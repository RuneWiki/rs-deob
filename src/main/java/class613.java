import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class613 {
   @OriginalMember(
      owner = "client!lk",
      name = "i",
      descriptor = "I"
   )
   public int field8967 = 128;
   @OriginalMember(
      owner = "client!lk",
      name = "f",
      descriptor = "I"
   )
   public int field8971 = 128;
   @OriginalMember(
      owner = "client!lk",
      name = "g",
      descriptor = "I"
   )
   public int field8972;
   @OriginalMember(
      owner = "client!lk",
      name = "e",
      descriptor = "I"
   )
   public int field8964;
   @OriginalMember(
      owner = "client!lk",
      name = "l",
      descriptor = "I"
   )
   public int field8970;
   @OriginalMember(
      owner = "client!lk",
      name = "d",
      descriptor = "I"
   )
   public int field8968;
   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8976 = new String[]{method4462(method4461("\u0013\f\f\u001ac\u0011\u000eV\u0018\"")), method4462(method4461("\u0011\u0012NJ")), method4462(method4461("\u0013\f\fe\"")), method4462(method4461("\u0004I\f\bw")), method4462(method4461("\u0013\f\fb\"")), method4462(method4461("\u0013\f\fg\"")), method4462(method4461("\u0013\f\fc\"")), method4462(method4461("\u0013\f\fd\""))};
   @OriginalMember(
      owner = "client!lk",
      name = "j",
      descriptor = "Lcha;"
   )
   public static class227 field8973 = new class227();
   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "[[I"
   )
   public static int[][] field8975 = new int[][]{{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!lk",
      name = "c",
      descriptor = "I"
   )
   public static int field8965;
   @OriginalMember(
      owner = "client!lk",
      name = "h",
      descriptor = "I"
   )
   public static int field8966;
   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "I"
   )
   public static int field8969;
   @OriginalMember(
      owner = "client!lk",
      name = "k",
      descriptor = "I"
   )
   public static int field8974;

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Ldl;BLdl;)V"
   )
   public static final void method4456(class70 arg0, byte arg1, class70 arg2) {
      try {
         if (arg0.field878 != null) {
            arg0.method699(12);
         }

         ++field8974;
         arg0.field878 = arg2.field878;
         int var3 = -106 / ((arg1 - -52) / 60);
         arg0.field881 = arg2;
         arg0.field878.field881 = arg0;
         arg0.field881.field878 = arg0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8976[4] + (arg0 != null ? field8976[3] : field8976[1]) + ',' + arg1 + ',' + (arg2 != null ? field8976[3] : field8976[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Llk;B)V"
   )
   public final void method4457(class613 arg0, byte arg1) {
      try {
         this.field8972 = arg0.field8972;
         if (arg1 < 22) {
            this.field8968 = -96;
         }

         this.field8971 = arg0.field8971;
         this.field8968 = arg0.field8968;
         ++field8965;
         this.field8970 = arg0.field8970;
         this.field8967 = arg0.field8967;
         this.field8964 = arg0.field8964;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8976[2] + (arg0 != null ? field8976[3] : field8976[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Z[BILjava/lang/String;)I"
   )
   public static final int method4458(boolean arg0, byte[] arg1, int arg2, String arg3) {
      int var4 = client.field4530;

      try {
         ++field8969;
         int var5 = arg2;
         int var6 = arg3.length();
         if (!arg0) {
            return -106;
         } else {
            int var7 = 0;
            int var10000;
            if (var4 != 0) {
               var10000 = class732.method5325(-99, arg3.charAt(var7));
            } else if (~var7 <= ~var6) {
               var10000 = -arg2 + arg2;
               if (var4 == 0) {
                  return var10000;
               }
            } else {
               var10000 = class732.method5325(-99, arg3.charAt(var7));
            }

            do {
               while(true) {
                  int var8 = var10000;
                  int var9 = ~var6 >= ~(var7 + 1) ? -1 : class732.method5325(46, arg3.charAt(var7 + 1));
                  int var10 = ~(var7 + 2) <= ~var6 ? -1 : class732.method5325(-57, arg3.charAt(var7 + 2));
                  int var11 = var6 > var7 + 3 ? class732.method5325(-111, arg3.charAt(var7 + 3)) : -1;
                  arg1[arg2++] = (byte)class379.method2928(var9 >>> 4, var8 << 2);
                  if (var10 == -1 && var4 == 0) {
                     var10000 = -var5 + arg2;
                     break;
                  }

                  arg1[arg2++] = (byte)class379.method2928(var10 >>> 2, class153.method1262(var9, 15) << 4);
                  if (~var11 != 0) {
                     arg1[arg2++] = (byte)class379.method2928(var11, class153.method1262(var10 << 6, 192));
                     var7 += 4;
                     if (~var7 <= ~var6) {
                        var10000 = -var5 + arg2;
                        if (var4 == 0) {
                           return var10000;
                        }
                     } else {
                        var10000 = class732.method5325(-99, arg3.charAt(var7));
                     }
                  } else {
                     var10000 = -var5 + arg2;
                     if (var4 == 0) {
                        return var10000;
                     }
                  }
               }
            } while(var4 != 0);

            return var10000;
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field8976[6] + arg0 + ',' + (arg1 != null ? field8976[3] : field8976[1]) + ',' + arg2 + ',' + (arg3 != null ? field8976[3] : field8976[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "(I)Llk;"
   )
   public final class613 method4459(int arg0) {
      try {
         ++field8966;
         if (arg0 != 6) {
            this.field8967 = -57;
         }

         return new class613(this.field8972, this.field8967, this.field8971, this.field8964, this.field8968, this.field8970);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8976[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class613(int arg0) {
      try {
         this.field8972 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8976[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field8972 = arg0;
         this.field8971 = arg2;
         this.field8964 = arg3;
         this.field8970 = arg5;
         this.field8967 = arg1;
         this.field8968 = arg4;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field8976[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4460(int arg0) {
      try {
         field8975 = null;
         field8973 = null;
         if (arg0 != 4) {
            field8973 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8976[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4461(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4462(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
