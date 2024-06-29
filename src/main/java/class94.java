import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class94 extends class100 {
   @OriginalMember(
      owner = "client!mp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1540 = new String[]{method955(method954("\u001a<7\b7")), method955(method954("\u001a<7\u000f7")), method955(method954("\u001a<7\n7")), method955(method954("\u001a<7\t7"))};
   @OriginalMember(
      owner = "client!mp",
      name = "u",
      descriptor = "I"
   )
   public static int field1536 = -2;
   @OriginalMember(
      owner = "client!mp",
      name = "r",
      descriptor = "Lfm;"
   )
   public static class164 field1534 = new class164(65, -1);
   @OriginalMember(
      owner = "client!mp",
      name = "v",
      descriptor = "Lfm;"
   )
   public static class164 field1539 = new class164(32, 7);
   @OriginalMember(
      owner = "client!mp",
      name = "s",
      descriptor = "I"
   )
   public static int field1532;
   @OriginalMember(
      owner = "client!mp",
      name = "w",
      descriptor = "I"
   )
   public static int field1533;
   @OriginalMember(
      owner = "client!mp",
      name = "t",
      descriptor = "I"
   )
   public static int field1535;
   @OriginalMember(
      owner = "client!mp",
      name = "x",
      descriptor = "I"
   )
   public static int field1537;
   @OriginalMember(
      owner = "client!mp",
      name = "y",
      descriptor = "I"
   )
   public static int field1538;

   @OriginalMember(
      owner = "client!mp",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method950(byte arg0) {
      try {
         field1534 = null;
         if (arg0 != 94) {
            method950((byte)-51);
         }

         field1539 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1540[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "a",
      descriptor = "(ZBII)V"
   )
   public final void method951(boolean arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field1535;
         if (arg1 <= 27) {
            method953(-64, 101, -50);
         }

         int var5 = this.method985(-80) * super.field1580.field8701 / 10000;
         class54.field794.method226(arg3, arg2 + 2, var5, super.field1580.field8708 + -2, ((class705)super.field1580).field10140, 0);
         class54.field794.method226(arg3 + var5, arg2 - -2, -var5 + super.field1580.field8701, super.field1580.field8708 + -2, 0, 0);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1540[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "<init>",
      descriptor = "(Lsa;Lsa;Luw;)V"
   )
   public class94(class39 arg0, class39 arg1, class705 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!mp",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public final void method952(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         class54.field794.method257(arg1 + -2, arg3, super.field1580.field8701 - -4, super.field1580.field8708 + 2, ((class705)super.field1580).field10139, 0);
         ++field1538;
         class54.field794.method257(arg1 + -1, arg0 + arg3, super.field1580.field8701 + 2, super.field1580.field8708, 0, 0);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1540[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method953(int arg0, int arg1, int arg2) {
      try {
         if (arg2 > -61) {
            field1534 = null;
         }

         ++field1533;
         class111 var3 = class796.method5734(15, 0L, (byte)-103);
         var3.method1087(0);
         var3.field1740 = arg0;
         var3.field1739 = arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1540[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method954(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method955(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
