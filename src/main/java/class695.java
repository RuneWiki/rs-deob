import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class695 extends class34 implements class83 {
   @OriginalMember(
      owner = "client!ut",
      name = "h",
      descriptor = "I"
   )
   private int field10187;
   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10191 = new String[]{method5066(method5065("h7<\u0016")), method5066(method5065("s6~FRh+$D\u0013")), method5066(method5065("}l~TF")), method5066(method5065("s6~>\u0013")), method5066(method5065("s6~;\u0013")), method5066(method5065("s6~9\u0013")), method5066(method5065("s6~<\u0013")), method5066(method5065("s6~8\u0013"))};
   @OriginalMember(
      owner = "client!ut",
      name = "j",
      descriptor = "I"
   )
   public static int field10183;
   @OriginalMember(
      owner = "client!ut",
      name = "g",
      descriptor = "I"
   )
   public static int field10184;
   @OriginalMember(
      owner = "client!ut",
      name = "c",
      descriptor = "I"
   )
   public static int field10185;
   @OriginalMember(
      owner = "client!ut",
      name = "i",
      descriptor = "I"
   )
   public static int field10186;
   @OriginalMember(
      owner = "client!ut",
      name = "d",
      descriptor = "I"
   )
   public static int field10188;
   @OriginalMember(
      owner = "client!ut",
      name = "f",
      descriptor = "I"
   )
   public static int field10189;
   @OriginalMember(
      owner = "client!ut",
      name = "e",
      descriptor = "I"
   )
   public static int field10190;

   @OriginalMember(
      owner = "client!ut",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method801(int arg0) {
      try {
         ++field10189;
         if (arg0 != 18744) {
            field10184 = -106;
         }

         return this.field10187;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10191[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "<init>",
      descriptor = "(Liu;ILjaclib/memory/Buffer;)V"
   )
   public class695(class530 arg0, int arg1, Buffer arg2) {
      super(arg0, arg2);

      try {
         this.field10187 = arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10191[1] + (arg0 != null ? field10191[2] : field10191[0]) + ',' + arg1 + ',' + (arg2 != null ? field10191[2] : field10191[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method800(byte arg0) {
      try {
         if (arg0 >= -14) {
            field10184 = 55;
         }

         ++field10185;
         return 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10191[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5064(int arg0) {
      try {
         class632.field9319 = null;
         class199.field2535 = null;
         class382.field5309 = null;
         if (arg0 == 0) {
            ++field10183;
            class370.field5157 = null;
            class239.field3043 = null;
            class756.field11071 = null;
            class793.field11602 = null;
            class476.field6643 = null;
            class400.field5502 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10191[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "<init>",
      descriptor = "(Liu;I[BI)V"
   )
   public class695(class530 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field10187 = arg1;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10191[1] + (arg0 != null ? field10191[2] : field10191[0]) + ',' + arg1 + ',' + (arg2 != null ? field10191[2] : field10191[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(III[B)V"
   )
   public final void method803(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         ++field10186;
         this.method271(arg3, arg2);
         this.field10187 = arg0;
         int var5 = 108 / ((arg1 - -39) / 44);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10191[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10191[2] : field10191[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method802(int arg0) {
      try {
         ++field10188;
         int var2 = 4 % ((-17 - arg0) / 49);
         return super.field489.getAddress();
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10191[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5065(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5066(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
