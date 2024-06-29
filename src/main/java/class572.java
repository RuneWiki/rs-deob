import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class572 {
   @OriginalMember(
      owner = "client!lb",
      name = "e",
      descriptor = "Lkfa;"
   )
   private class632 field7868;
   @OriginalMember(
      owner = "client!lb",
      name = "f",
      descriptor = "I"
   )
   public int field7870;
   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7872 = new String[]{method4121(method4120("`E\u001e\u000bu")), method4121(method4120("w\t\u001ef ")), method4121(method4120("`E\u001et4bNDvu")), method4121(method4120("bR\\$")), method4121(method4120("`E\u001e.4bF\\!'i\u000f")), method4121(method4120("`E\u001e\nu")), method4121(method4120("`E\u001e\tu"))};
   @OriginalMember(
      owner = "client!lb",
      name = "d",
      descriptor = "I"
   )
   public static int field7865;
   @OriginalMember(
      owner = "client!lb",
      name = "b",
      descriptor = "I"
   )
   public static int field7866;
   @OriginalMember(
      owner = "client!lb",
      name = "g",
      descriptor = "I"
   )
   public static int field7869;
   @OriginalMember(
      owner = "client!lb",
      name = "c",
      descriptor = "I"
   )
   public static int field7871;
   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "Lod;"
   )
   public static class536 field7867;

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(Lqh;IIB)Ljk;"
   )
   public static final class663 method4117(class74 arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field7871;
         byte[] var4 = arg0.method732(arg1, arg2, (byte)38);
         if (arg3 != 84) {
            return null;
         } else {
            return var4 == null ? null : new class663(var4);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7872[6] + (arg0 != null ? field7872[1] : field7872[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field7865;
         this.field7868.method4587(122, this.field7870);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7872[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4118(int arg0) {
      try {
         if (arg0 != -936) {
            field7869 = 28;
         }

         field7867 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7872[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4119(int arg0) {
      try {
         ++field7866;
         ++class473.field6561;
         class471 var1 = class133.method1118(class605.field8474.field2787, 2, class204.field2504);
         var1.field6527.method4318(class600.method4374(arg0 + 5880), 0);
         var1.field6527.method4284(class252.field3194, -31429);
         var1.field6527.method4284(class41.field479, -31429);
         var1.field6527.method4318(class674.field9907.field8429.method1211((byte)-80), arg0 ^ -5766);
         if (arg0 != -5766) {
            field7867 = null;
         }

         class605.field8474.method1702((byte)-58, var1);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7872[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "<init>",
      descriptor = "(Lkfa;II)V"
   )
   public class572(class632 arg0, int arg1, int arg2) {
      try {
         this.field7868 = arg0;
         this.field7870 = arg2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7872[2] + (arg0 != null ? field7872[1] : field7872[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4120(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4121(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
