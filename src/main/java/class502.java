import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class502 extends class721 {
   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7676 = new String[]{method3892(method3891("q\u0017\u0001eQ1")), method3892(method3891("q\u0017\u0001eS1")), method3892(method3891("bZNej")), method3892(method3891("w\u0001\f'")), method3892(method3891("q\u0017\u0001eR1"))};
   @OriginalMember(
      owner = "client!hca",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field7672 = false;
   @OriginalMember(
      owner = "client!hca",
      name = "g",
      descriptor = "[S"
   )
   public static short[] field7671 = new short[256];
   @OriginalMember(
      owner = "client!hca",
      name = "k",
      descriptor = "F"
   )
   public static float field7670;
   @OriginalMember(
      owner = "client!hca",
      name = "l",
      descriptor = "I"
   )
   public static int field7673;
   @OriginalMember(
      owner = "client!hca",
      name = "j",
      descriptor = "I"
   )
   public static int field7674;
   @OriginalMember(
      owner = "client!hca",
      name = "f",
      descriptor = "I"
   )
   public static int field7675;
   @OriginalMember(
      owner = "client!hca",
      name = "i",
      descriptor = "Lsu;"
   )
   public static class289 field7669;

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static void method3888(byte arg0) {
      try {
         field7671 = null;
         if (arg0 < 106) {
            method3890((byte)30);
         }

         field7669 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7676[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V",
      line = 21
   )
   public static final void method3889(boolean arg0, String arg1) {
      boolean var2 = client.field1786;

      try {
         ++field7675;
         if (arg1 != null) {
            if ((class148.field2244 < 200 || class197.field3035) && class148.field2244 < 200) {
               if (!arg0) {
                  String var3 = class427.method3381(arg1, 0);
                  if (var3 != null) {
                     int var4 = 0;
                     if (var2 || var4 < class148.field2244) {
                        do {
                           String var5 = class427.method3381(class626.field9075[var4], 0);
                           if (var5 != null && var5.equals(var3)) {
                              class23.method170(4, 0, arg1 + class499.field7626.method3875(class493.field7455, 114));
                              return;
                           }

                           if (class155.field2307[var4] != null) {
                              String var6 = class427.method3381(class155.field2307[var4], 0);
                              if (var6 != null && var6.equals(var3)) {
                                 class23.method170(4, 0, arg1 + class499.field7626.method3875(class493.field7455, 113));
                                 return;
                              }
                           }

                           ++var4;
                        } while(var4 < class148.field2244);
                     }

                     int var7 = 0;
                     class29 var10;
                     class577 var11;
                     String var10000;
                     if (var2) {
                        var10000 = class427.method3381(class698.field10370[var7], 0);
                     } else if (~var7 <= ~class377.field5987) {
                        var10000 = class427.method3381(class476.field7251.field67, 0);
                        if (!var2) {
                           if (var10000.equals(var3)) {
                              class23.method170(4, 0, class499.field7629.method3875(class493.field7455, 100));
                              return;
                           }

                           ++class697.field10359;
                           var10 = class578.method4332((byte)-32);
                           var11 = class218.method1888(class144.field2052, 99, var10.field361);
                           var11.field8531.method2864(-26110, class714.method5292((byte)-97, arg1));
                           var11.field8531.method2862(arg1, true);
                           var10.method211(var11, 122);
                           return;
                        }
                     } else {
                        var10000 = class427.method3381(class698.field10370[var7], 0);
                     }

                     while(true) {
                        String var8 = var10000;
                        if (var8 != null && var8.equals(var3)) {
                           class23.method170(4, 0, class499.field7631.method3875(class493.field7455, 96) + arg1 + class499.field7632.method3875(class493.field7455, 90));
                           return;
                        }

                        if (class459.field7008[var7] != null) {
                           String var9 = class427.method3381(class459.field7008[var7], 0);
                           if (var9 != null && var9.equals(var3)) {
                              class23.method170(4, 0, class499.field7631.method3875(class493.field7455, 124) + arg1 + class499.field7632.method3875(class493.field7455, 92));
                              return;
                           }
                        }

                        ++var7;
                        if (~var7 <= ~class377.field5987) {
                           var10000 = class427.method3381(class476.field7251.field67, 0);
                           if (!var2) {
                              if (var10000.equals(var3)) {
                                 class23.method170(4, 0, class499.field7629.method3875(class493.field7455, 100));
                                 return;
                              }

                              ++class697.field10359;
                              var10 = class578.method4332((byte)-32);
                              var11 = class218.method1888(class144.field2052, 99, var10.field361);
                              var11.field8531.method2864(-26110, class714.method5292((byte)-97, arg1));
                              var11.field8531.method2862(arg1, true);
                              var10.method211(var11, 122);
                              return;
                           }
                        } else {
                           var10000 = class427.method3381(class698.field10370[var7], 0);
                        }
                     }
                  }
               }
            } else {
               class23.method170(4, 0, class499.field7599.method3875(class493.field7455, 111));
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field7676[1] + arg0 + ',' + (arg1 != null ? field7676[2] : field7676[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "b",
      descriptor = "(B)V",
      line = 126
   )
   public static final void method3890(byte arg0) {
      try {
         ++field7673;
         class296.field4672 = new class374[class70.field919.method5008(-1)][];
         class505.field7743 = new class374[class70.field919.method5008(-1)][];
         class14.field181 = new boolean[class70.field919.method5008(-1)];
         if (arg0 != 119) {
            method3890((byte)29);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7676[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3891(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3892(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
