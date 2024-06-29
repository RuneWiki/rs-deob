import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class203 extends class67 {
   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3101 = new String[]{method1776(method1775("Y0$u\u0014\u0018")), method1776(method1775("Y0$u\u0013\u0018")), method1776(method1775("Y0$u\u0015\u0018")), method1776(method1775("Y0$u\u001e\u0018")), method1776(method1775("Y0$u\u0010\u0018")), method1776(method1775("Y0$u\u0012\u0018")), method1776(method1775("Y0$u\u0017\u0018")), method1776(method1775("Y0$u\u0011\u0018"))};
   @OriginalMember(
      owner = "client!iga",
      name = "o",
      descriptor = "I"
   )
   public static int field3095 = -1;
   @OriginalMember(
      owner = "client!iga",
      name = "n",
      descriptor = "I"
   )
   public static int field3092;
   @OriginalMember(
      owner = "client!iga",
      name = "q",
      descriptor = "I"
   )
   public static int field3093;
   @OriginalMember(
      owner = "client!iga",
      name = "r",
      descriptor = "I"
   )
   public static int field3094;
   @OriginalMember(
      owner = "client!iga",
      name = "k",
      descriptor = "I"
   )
   public static int field3096;
   @OriginalMember(
      owner = "client!iga",
      name = "s",
      descriptor = "I"
   )
   public static int field3097;
   @OriginalMember(
      owner = "client!iga",
      name = "m",
      descriptor = "I"
   )
   public static int field3099;
   @OriginalMember(
      owner = "client!iga",
      name = "p",
      descriptor = "I"
   )
   public static int field3100;
   @OriginalMember(
      owner = "client!iga",
      name = "l",
      descriptor = "[Lfq;"
   )
   public static class374[] field3098;

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(Z)V",
      line = 3
   )
   public static final void method1771(boolean arg0) {
      try {
         ++field3097;
         if (class146.field2177 != null) {
            class146.field2177.method4495(!arg0);
            class146.field2177 = null;
            class583.field8599 = null;
         }

         if (arg0) {
            field3098 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3101[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(II)I",
      line = 21
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field3093;
         return arg1 >= -74 ? 56 : 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3101[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "b",
      descriptor = "(I)I",
      line = 35
   )
   public final int method162(int arg0) {
      try {
         ++field3094;
         if (arg0 != 0) {
            field3098 = null;
         }

         return 127;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3101[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 49
   )
   public class203(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!iga",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 53
   )
   public class203(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(IZ)V",
      line = 56
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field3092;
         if (!arg1) {
            this.method158((byte)-108);
         }

         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3101[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "b",
      descriptor = "(Z)V",
      line = 70
   )
   public static final void method1772(boolean arg0) {
      try {
         ++field3096;
         if (arg0) {
            field3095 = -89;
         }

         class15.method118();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3101[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(B)V",
      line = 81
   )
   public final void method158(byte arg0) {
      try {
         if (arg0 != -69) {
            method1772(true);
         }

         ++field3099;
         if (super.field877 < 0 && super.field877 > 127) {
            super.field877 = this.method162(0);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3101[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "d",
      descriptor = "(I)V",
      line = 99
   )
   public static void method1773(int arg0) {
      try {
         if (arg0 >= -51) {
            field3098 = null;
         }

         field3098 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3101[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "c",
      descriptor = "(I)I",
      line = 110
   )
   public final int method1774(int arg0) {
      try {
         if (arg0 != 480102311) {
            return -56;
         } else {
            ++field3100;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3101[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1775(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1776(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
