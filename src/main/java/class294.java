import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class294 extends class463 {
   @OriginalMember(
      owner = "client!mm",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3866 = new String[]{method2219(method2218("\u0000\u0005za_")), method2219(method2218("\u0000\u0005zb_")), method2219(method2218("\u0000\u0005ze_")), method2219(method2218("\u0000\u0005zg_")), method2219(method2218("\u0000\u0005zd_")), method2219(method2218("\u0003\u001d8L")), method2219(method2218("\u0016Fz\u000e\n")), method2219(method2218("\u0000\u0005zc_")), method2219(method2218("\u0000\u0005zf_"))};
   @OriginalMember(
      owner = "client!mm",
      name = "w",
      descriptor = "Lbga;"
   )
   public static class378 field3859 = new class378(87, -1);
   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "[Z"
   )
   public static boolean[] field3861 = new boolean[100];
   @OriginalMember(
      owner = "client!mm",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field3862 = new int[2048];
   @OriginalMember(
      owner = "client!mm",
      name = "r",
      descriptor = "I"
   )
   public static int field3855;
   @OriginalMember(
      owner = "client!mm",
      name = "x",
      descriptor = "I"
   )
   public static int field3856;
   @OriginalMember(
      owner = "client!mm",
      name = "q",
      descriptor = "I"
   )
   public static int field3857;
   @OriginalMember(
      owner = "client!mm",
      name = "u",
      descriptor = "I"
   )
   public static int field3858;
   @OriginalMember(
      owner = "client!mm",
      name = "v",
      descriptor = "I"
   )
   public static int field3863;
   @OriginalMember(
      owner = "client!mm",
      name = "s",
      descriptor = "I"
   )
   public static int field3864;
   @OriginalMember(
      owner = "client!mm",
      name = "t",
      descriptor = "Llc;"
   )
   public static class677 field3865;
   @OriginalMember(
      owner = "client!mm",
      name = "A",
      descriptor = "Lbo;"
   )
   private class763 field3860;

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2215(byte arg0) {
      try {
         field3865 = null;
         field3862 = null;
         field3859 = null;
         field3861 = null;
         if (arg0 >= -63) {
            field3859 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3866[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method905(int arg0) {
      try {
         super.method905(arg0);
         ++field3855;
         this.field3860 = class583.method4187(super.field6340, ((class519)super.field6345).field7119, arg0 + 15135);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3866[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "<init>",
      descriptor = "(Lqh;Lqh;Lhca;)V"
   )
   public class294(class74 arg0, class74 arg1, class519 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method907(boolean arg0) {
      try {
         ++field3858;
         if (!arg0) {
            return false;
         } else {
            return !super.method907(arg0) ? false : super.field6340.method717(((class519)super.field6345).field7119, (byte)-58);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3866[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(IZBI)V"
   )
   public final void method1047(int arg0, boolean arg1, byte arg2, int arg3) {
      try {
         ++field3856;
         int var5 = this.method3399(-25631) * super.field6345.field1299 / 10000;
         int[] var6 = new int[4];
         class338.field4832.method582(var6);
         class338.field4832.method577(arg3, arg0 + 2, arg3 - -var5, super.field6345.field1311 + arg0);
         this.field3860.method5484(arg3, arg0 + 2, super.field6345.field1299, super.field6345.field1311);
         if (arg2 == -84) {
            class338.field4832.method577(var6[0], var6[1], var6[2], var6[3]);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field3866[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(IIBII)V"
   )
   public static final void method2216(int param0, int param1, byte param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public final void method1050(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         class338.field4832.method523(arg2 + -2, arg0, super.field6345.field1299 + 4, super.field6345.field1311 + 2, ((class519)super.field6345).field7118, 0);
         ++field3863;
         if (arg1 == 29953) {
            class338.field4832.method523(arg2 + -1, arg0 + 1, super.field6345.field1299 + 2, super.field6345.field1311, 0, 0);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3866[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "([BLkfa;II)Llb;"
   )
   public static final class572 method2217(byte[] arg0, class632 arg1, int arg2, int arg3) {
      try {
         ++field3864;
         if (arg0 == null) {
            return null;
         } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg2, var4);
            OpenGL.glProgramRawARB(arg2, 34933, arg0);
            OpenGL.glGetIntegerv(34379, class49.field561, arg3);
            if (class49.field561[0] != -1) {
               OpenGL.glBindProgramARB(arg2, 0);
               return null;
            } else {
               OpenGL.glBindProgramARB(arg2, 0);
               return new class572(arg1, arg2, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3866[7] + (arg0 != null ? field3866[6] : field3866[5]) + ',' + (arg1 != null ? field3866[6] : field3866[5]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2218(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2219(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
