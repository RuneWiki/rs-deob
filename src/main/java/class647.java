import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class647 extends class15 {
   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "Lwja;"
   )
   public class352 field9681;
   @OriginalMember(
      owner = "client!gl",
      name = "y",
      descriptor = "I"
   )
   public int field9684;
   @OriginalMember(
      owner = "client!gl",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9687 = new String[]{method4758(method4757("  lz&)%6xg")), method4758(method4757(")9.*")), method4758(method4757("<blh2")), method4758(method4757("  l\u0001g")), method4758(method4757("  l\u000eg")), method4758(method4757("--4'a+-,!a\u00159,2&*)")), method4758(method4757("*-:\u000b**#0?")), method4758(method4757("  l\u0000g"))};
   @OriginalMember(
      owner = "client!gl",
      name = "v",
      descriptor = "Laka;"
   )
   public static class418 field9679 = new class418(14, 5);
   @OriginalMember(
      owner = "client!gl",
      name = "x",
      descriptor = "F"
   )
   public static float field9685 = 0.25F;
   @OriginalMember(
      owner = "client!gl",
      name = "t",
      descriptor = "Lse;"
   )
   public static class6 field9683 = new class6(3, -1);
   @OriginalMember(
      owner = "client!gl",
      name = "s",
      descriptor = "I"
   )
   public static int field9680;
   @OriginalMember(
      owner = "client!gl",
      name = "u",
      descriptor = "I"
   )
   public static int field9682;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gl",
      name = "w",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9686;

   @OriginalMember(
      owner = "client!gl",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method4753(int arg0) {
      try {
         if (arg0 != -11750) {
            field9679 = null;
         }

         ++field9680;
         if (!class366.field5092.field10749) {
            try {
               Method var1 = (field9686 != null ? field9686 : (field9686 = method4756(field9687[5]))).getMethod(field9687[6]);
               if (var1 != null) {
                  try {
                     Runtime var2 = Runtime.getRuntime();
                     Long var3 = (Long)var1.invoke(var2, (Object[])null);
                     class578.field8565 = 1 + (int)(var3 / 1048576L);
                     return;
                  } catch (Throwable var5) {
                     return;
                  }
               }
            } catch (Exception var6) {
               return;
            }
         } else {
            class578.field8565 = 96;
         }

      } catch (RuntimeException var7) {
         throw class93.method866(var7, field9687[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(B)Z"
   )
   public abstract boolean method545(byte arg0);

   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public abstract Object method546(byte arg0);

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(ILsa;IIILfia;ILqh;)V"
   )
   public static final void method4754(int arg0, class783 arg1, int arg2, int arg3, int arg4, class294 arg5, int arg6, class81 arg7) {
      try {
         ++field9682;
         if (arg0 != 256) {
            method4755(-27);
         }

         class258 var8 = new class258();
         var8.field3285 = arg3;
         var8.field3266 = arg4 << 9;
         var8.field3261 = arg2 << 9;
         if (arg5 == null) {
            if (arg7 == null) {
               if (arg1 != null) {
                  var8.field3282 = arg1;
                  var8.field3264 = arg4 - -arg1.method78(0) << 9;
                  var8.field3271 = arg1.method78(0) + arg2 << 9;
                  var8.field3286 = class383.method3035(-72, arg1);
                  var8.field3279 = 256;
                  var8.field3274 = arg1.field11448;
                  var8.field3276 = 0;
                  var8.field3277 = arg1.field11403 << 9;
                  var8.field3269 = arg1.field11404;
                  var8.field3272 = 256;
                  class328.field4539.method1808((long)arg1.field145, var8, 26459);
                  return;
               }
            } else {
               var8.field3289 = arg7;
               class473 var11 = arg7.field1135;
               if (var11.field6583 != null) {
                  var8.field3281 = true;
                  var11 = var11.method3603(class175.field2266, 4764);
               }

               if (var11 != null) {
                  var8.field3264 = var11.field6546 + arg4 << 9;
                  var8.field3271 = var11.field6546 + arg2 << 9;
                  var8.field3286 = class650.method4776(arg7, -108);
                  var8.field3277 = var11.field6527 << 9;
                  var8.field3276 = var11.field6536 << 9;
                  var8.field3272 = var11.field6550;
                  var8.field3279 = var11.field6579;
                  var8.field3274 = var11.field6533;
                  var8.field3269 = var11.field6519;
               }

               class320.field4398.method279(false, var8);
            }

         } else {
            var8.field3267 = arg5;
            int var9 = arg5.field4038;
            int var10 = arg5.field4066;
            if (~arg6 == -2 || ~arg6 == -4) {
               var9 = arg5.field4066;
               var10 = arg5.field4038;
            }

            var8.field3278 = arg5.field4055;
            var8.field3275 = arg5.field4050;
            var8.field3263 = arg5.field4076;
            var8.field3269 = arg5.field4084;
            var8.field3279 = arg5.field4030;
            var8.field3274 = arg5.field4031;
            var8.field3273 = arg5.field4092;
            var8.field3272 = arg5.field4073;
            var8.field3271 = arg2 + var10 << 9;
            var8.field3277 = arg5.field4077 << 9;
            var8.field3264 = arg4 + var9 << 9;
            var8.field3286 = arg5.field4128;
            var8.field3276 = arg5.field4078 << 9;
            if (arg5.field4036 != null) {
               var8.field3281 = true;
               var8.method2083(-122);
            }

            if (var8.field3278 != null) {
               var8.field3265 = var8.field3275 + (int)(Math.random() * (double)(var8.field3273 - var8.field3275));
            }

            class52.field710.method279(false, var8);
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field9687[3] + arg0 + ',' + (arg1 != null ? field9687[2] : field9687[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9687[2] : field9687[1]) + ',' + arg6 + ',' + (arg7 != null ? field9687[2] : field9687[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "<init>",
      descriptor = "(Lwja;I)V"
   )
   public class647(class352 arg0, int arg1) {
      try {
         this.field9681 = arg0;
         this.field9684 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9687[0] + (arg0 != null ? field9687[2] : field9687[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4755(int arg0) {
      try {
         if (arg0 == 5) {
            field9679 = null;
            field9683 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9687[7] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4756(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4757(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4758(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
