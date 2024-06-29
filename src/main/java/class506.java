import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class506 extends class644 {
   @OriginalMember(
      owner = "client!dj",
      name = "v",
      descriptor = "J"
   )
   private long field7049 = -1L;
   @OriginalMember(
      owner = "client!dj",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private String field7051 = null;
   @OriginalMember(
      owner = "client!dj",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7054 = new String[]{method3824(method3823("m?Ia\u0010")), method3824(method3823("r{I\fE")), method3824(method3823(")8\u0002OZl'\tCUlo")), method3824(method3823("d0\n@]{=\u0006QP3")), method3824(method3823("g \u000bN")), method3824(method3823("m?Ig\u0010")), method3824(method3823("m?Ic\u0010")), method3824(method3823("m?I`\u0010"))};
   @OriginalMember(
      owner = "client!dj",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field7050 = false;
   @OriginalMember(
      owner = "client!dj",
      name = "x",
      descriptor = "[[[I"
   )
   public static int[][][] field7053 = new int[2][][];
   @OriginalMember(
      owner = "client!dj",
      name = "t",
      descriptor = "I"
   )
   public static int field7047;
   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "I"
   )
   public static int field7048;
   @OriginalMember(
      owner = "client!dj",
      name = "s",
      descriptor = "I"
   )
   public static int field7052;
   @OriginalMember(
      owner = "client!dj",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field7046;

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         ++field7047;
         if (arg0 != 11) {
            method3822((byte)-73);
         }

         if (arg1.method640(255) != 255) {
            --arg1.field864;
            this.field7049 = arg1.method660(116);
         }

         this.field7051 = arg1.method654((byte)-118);
         if (class374.field5234) {
            System.out.println(field7054[3] + this.field7049 + field7054[2] + this.field7051);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7054[5] + arg0 + ',' + (arg1 != null ? field7054[1] : field7054[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method3821(int arg0, byte arg1) {
      try {
         ++field7048;
         if (arg1 == 29) {
            class407 var2 = class563.field8278;
            synchronized(class563.field8278) {
               class563.field8278.method3197(5, arg0);
            }

            class407 var3 = class88.field1196;
            synchronized(class88.field1196) {
               class88.field1196.method3197(5, arg0);
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7054[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         ++field7052;
         arg1.method5702(this.field7051, 31, this.field7049);
         if (arg0 != 19163) {
            field7050 = false;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7054[7] + arg0 + ',' + (arg1 != null ? field7054[1] : field7054[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3822(byte arg0) {
      try {
         int var1 = 76 % ((arg0 - 47) / 42);
         field7053 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7054[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3823(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3824(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
