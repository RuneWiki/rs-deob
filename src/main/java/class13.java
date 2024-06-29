import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class13 {
   @OriginalMember(
      owner = "client!dka",
      name = "t",
      descriptor = "I"
   )
   private int field158 = 0;
   @OriginalMember(
      owner = "client!dka",
      name = "h",
      descriptor = "I"
   )
   private int field161 = 0;
   @OriginalMember(
      owner = "client!dka",
      name = "n",
      descriptor = "I"
   )
   private int field168 = 0;
   @OriginalMember(
      owner = "client!dka",
      name = "r",
      descriptor = "Lor;"
   )
   private class670 field167;
   @OriginalMember(
      owner = "client!dka",
      name = "j",
      descriptor = "Lee;"
   )
   private class707 field155;
   @OriginalMember(
      owner = "client!dka",
      name = "c",
      descriptor = "[Lcp;"
   )
   private class757[] field152;
   @OriginalMember(
      owner = "client!dka",
      name = "e",
      descriptor = "Ljda;"
   )
   public class238 field156;
   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field169 = new String[]{method105(method104("{UN087")), method105(method104("{UN0?7")), method105(method104("{UN097")), method105(method104("qKCr")), method105(method104("d\u0010\u00010\u0006")), method105(method104("{UN0GvPFjE7")), method105(method104("{UN0:7"))};
   @OriginalMember(
      owner = "client!dka",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field150 = new int[]{28, 35, 40, 44};
   @OriginalMember(
      owner = "client!dka",
      name = "m",
      descriptor = "I"
   )
   public static int field160 = 50;
   @OriginalMember(
      owner = "client!dka",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field151 = new int[field160];
   @OriginalMember(
      owner = "client!dka",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field166 = new int[field160];
   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field159 = new int[field160];
   @OriginalMember(
      owner = "client!dka",
      name = "f",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field163 = new String[field160];
   @OriginalMember(
      owner = "client!dka",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field149 = new int[field160];
   @OriginalMember(
      owner = "client!dka",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field164 = new int[field160];
   @OriginalMember(
      owner = "client!dka",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field148 = new int[field160];
   @OriginalMember(
      owner = "client!dka",
      name = "p",
      descriptor = "I"
   )
   public static int field153;
   @OriginalMember(
      owner = "client!dka",
      name = "o",
      descriptor = "I"
   )
   public static int field154;
   @OriginalMember(
      owner = "client!dka",
      name = "i",
      descriptor = "I"
   )
   public static int field157;
   @OriginalMember(
      owner = "client!dka",
      name = "s",
      descriptor = "I"
   )
   public static int field162;
   @OriginalMember(
      owner = "client!dka",
      name = "l",
      descriptor = "I"
   )
   public static int field165;

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method100(byte arg0) {
      try {
         field148 = null;
         if (arg0 <= -70) {
            field163 = null;
            field151 = null;
            field150 = null;
            field166 = null;
            field159 = null;
            field164 = null;
            field149 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field169[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(IIIIZZ)V"
   )
   public final void method101(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
      try {
         if (arg0 != Integer.MAX_VALUE) {
            this.field161 = -118;
         }

         ++field165;
         boolean var9 = arg5 & this.field167.method517();
         if (!var9 && (arg1 == 4 || ~arg1 == -9 || ~arg1 == -10)) {
            if (arg1 == 4) {
               arg3 = arg2;
            }

            arg1 = 2;
         }

         if (~arg1 != -1 && arg4) {
            arg1 |= Integer.MIN_VALUE;
         }

         if (~this.field158 == ~arg1) {
            if (this.field158 != 0) {
               this.field152[Integer.MAX_VALUE & this.field158].method385(arg4, 500);
               if (~this.field161 != ~arg2 || this.field168 != arg3) {
                  this.field152[this.field158 & Integer.MAX_VALUE].method386(arg2, -121, arg3);
                  this.field168 = arg3;
                  this.field161 = arg2;
               }

               return;
            }
         } else {
            if (~this.field158 != -1) {
               this.field152[Integer.MAX_VALUE & this.field158].method388((byte)123);
            }

            if (arg1 != 0) {
               this.field152[Integer.MAX_VALUE & arg1].method391(110, arg4);
               this.field152[arg1 & Integer.MAX_VALUE].method385(arg4, 500);
               this.field152[Integer.MAX_VALUE & arg1].method386(arg2, -119, arg3);
            }

            this.field168 = arg3;
            this.field161 = arg2;
            this.field158 = arg1;
         }

      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field169[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(Lmd;ZI)Z"
   )
   public final boolean method102(class573 arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            return false;
         } else {
            ++field154;
            if (~this.field158 == -1) {
               return false;
            } else {
               this.field152[Integer.MAX_VALUE & this.field158].method387((byte)-96, arg2, arg0);
               return true;
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field169[2] + (arg0 != null ? field169[4] : field169[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(BI)Z"
   )
   public final boolean method103(byte arg0, int arg1) {
      try {
         ++field157;
         if (arg0 != -1) {
            this.field168 = -13;
         }

         return this.field152[arg1].method392(arg0 ^ -127);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field169[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class13(class670 arg0) {
      try {
         this.field167 = arg0;
         this.field155 = new class707(arg0);
         this.field152 = new class757[10];
         this.field152[1] = new class658(arg0);
         this.field152[2] = new class764(arg0, this.field155);
         this.field152[4] = new class442(arg0, this.field155);
         this.field152[5] = new class316(arg0, this.field155);
         this.field152[6] = new class532(arg0);
         this.field152[7] = new class46(arg0);
         this.field152[3] = this.field156 = new class238(arg0);
         this.field152[8] = new class343(arg0, this.field155);
         this.field152[9] = new class679(arg0, this.field155);
         if (!this.field152[8].method392(116)) {
            this.field152[8] = this.field152[4];
         }

         if (!this.field152[9].method392(113)) {
            this.field152[9] = this.field152[8];
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field169[5] + (arg0 != null ? field169[4] : field169[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method104(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method105(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
