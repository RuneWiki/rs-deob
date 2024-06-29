import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class378 {
   @OriginalMember(
      owner = "client!bga",
      name = "k",
      descriptor = "I"
   )
   public int field5303;
   @OriginalMember(
      owner = "client!bga",
      name = "l",
      descriptor = "I"
   )
   private int field5297;
   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5306 = new String[]{method2919(method2918("-\\Pj3g")), method2919(method2918("-\\Pj2g")), method2919(method2918("-\\Pj\u0002 hE6\u001f!\\\u0019")), method2919(method2918("-\\PjJ&UX0Hg")), method2919(method2918("-\\Pj4g")), method2919(method2918("<S^3\u001f!\\g-\u0012*Tp ")), method2919(method2918("!N](")), method2919(method2918("4\u0015\u001fj\u000b")), method2919(method2918("-\\Pj5g")), method2919(method2918("-\\Pj7g"))};
   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "Lgka;"
   )
   public static class394 field5298 = new class394("", 15);
   @OriginalMember(
      owner = "client!bga",
      name = "h",
      descriptor = "[Z"
   )
   public static boolean[] field5304 = new boolean[100];
   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "I"
   )
   public static int field5294;
   @OriginalMember(
      owner = "client!bga",
      name = "g",
      descriptor = "I"
   )
   public static int field5295;
   @OriginalMember(
      owner = "client!bga",
      name = "d",
      descriptor = "I"
   )
   public static int field5296;
   @OriginalMember(
      owner = "client!bga",
      name = "j",
      descriptor = "I"
   )
   public static int field5299;
   @OriginalMember(
      owner = "client!bga",
      name = "e",
      descriptor = "I"
   )
   public static int field5300;
   @OriginalMember(
      owner = "client!bga",
      name = "i",
      descriptor = "I"
   )
   public static int field5305;
   @OriginalMember(
      owner = "client!bga",
      name = "c",
      descriptor = "Lrq;"
   )
   public static class372 field5301;
   @OriginalMember(
      owner = "client!bga",
      name = "f",
      descriptor = "[Ljba;"
   )
   public static class422[] field5302;

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2913(int arg0) {
      try {
         field5304 = null;
         if (arg0 != -22440) {
            method2915(43);
         }

         field5302 = null;
         field5298 = null;
         field5301 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5306[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(ZILjava/lang/String;)V"
   )
   public static final void method2914(boolean arg0, int arg1, String arg2) {
      boolean var3 = client.field4273;

      try {
         ++field5300;
         int var4 = class261.field3357;
         int[] var5 = class294.field3862;
         boolean var6 = arg0;
         int var7 = 0;
         if (var3 || var7 < var4) {
            do {
               class404 var8 = class136.field1773[var5[var7]];
               if (var8 != null && class278.field3709 != var8 && var8.field5662 != null && var8.field5662.equalsIgnoreCase(arg2)) {
                  var6 = true;
                  if (~arg1 == -2) {
                     ++class336.field4816;
                     class471 var9 = class133.method1118(class605.field8474.field2787, 2, class22.field286);
                     var9.field6527.method4301(0, (byte)-43);
                     var9.field6527.method4274(-1165420232, var5[var7]);
                     class605.field8474.method1702((byte)-90, var9);
                     if (!var3) {
                        break;
                     }
                  }

                  if (arg1 != 4) {
                     if (~arg1 != -6) {
                        if (arg1 == 6) {
                           ++class591.field8162;
                           class471 var10 = class133.method1118(class605.field8474.field2787, 2, class437.field6064);
                           var10.field6527.method4324(0, 32203);
                           var10.field6527.method4274(-1165420232, var5[var7]);
                           class605.field8474.method1702((byte)-123, var10);
                           if (!var3) {
                              break;
                           }
                        }

                        if (~arg1 == -8) {
                           ++class722.field10591;
                           class471 var11 = class133.method1118(class605.field8474.field2787, 2, class128.field1614);
                           var11.field6527.method4274(-1165420232, var5[var7]);
                           var11.field6527.method4298(0, 128);
                           class605.field8474.method1702((byte)-89, var11);
                           if (!var3) {
                              break;
                           }
                        }

                        if (~arg1 != -10) {
                           break;
                        }

                        class471 var12 = class133.method1118(class605.field8474.field2787, 2, class64.field700);
                        var12.field6527.method4308(!arg0, var5[var7]);
                        var12.field6527.method4298(0, 128);
                        class605.field8474.method1702((byte)-98, var12);
                        if (!var3) {
                           break;
                        }
                     }

                     ++class256.field3274;
                     class471 var13 = class133.method1118(class605.field8474.field2787, 2, class715.field10455);
                     var13.field6527.method4314(-14, var5[var7]);
                     var13.field6527.method4324(0, 32203);
                     class605.field8474.method1702((byte)-72, var13);
                     if (!var3) {
                        break;
                     }
                  }

                  ++class593.field8191;
                  class471 var14 = class133.method1118(class605.field8474.field2787, 2, class254.field3233);
                  var14.field6527.method4324(0, 32203);
                  var14.field6527.method4274(-1165420232, var5[var7]);
                  class605.field8474.method1702((byte)-113, var14);
                  if (!var3) {
                     break;
                  }
               }

               ++var7;
            } while(var7 < var4);
         }

         if (!var6) {
            class545.method3938(-7764, 4, class551.field7542.method3980(class494.field6787, !arg0) + arg2);
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field5306[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5306[7] : field5306[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "(I)Z"
   )
   public static final boolean method2915(int arg0) {
      try {
         ++field5299;
         if (arg0 != 0) {
            method2915(12);
         }

         if (class710.field10422) {
            try {
               if ((Boolean)class164.method1307(-22955, class126.field1586, field5306[5])) {
                  return false;
               }

               return true;
            } catch (Throwable var2) {
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5306[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(ZI)I"
   )
   public static final int method2916(boolean arg0, int arg1) {
      try {
         ++field5296;
         int var2 = class616.field8588;
         if (var2 != 0) {
            if (~var2 == -2) {
               return class384.field5398;
            }

            if (var2 != 2) {
               int var3 = 81 % ((arg1 - 39) / 52);
               return 0;
            }

            if (!client.field4273) {
               return 0;
            }
         }

         return !arg0 ? class384.field5398 : 0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5306[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field5295;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5306[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method2917(boolean arg0) {
      try {
         if (!arg0) {
            method2916(false, 68);
         }

         ++field5294;
         return this.field5297;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5306[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class378(int arg0, int arg1) {
      try {
         this.field5303 = arg1;
         this.field5297 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5306[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2918(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2919(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
