import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class642 implements class772 {
   @OriginalMember(
      owner = "client!dha",
      name = "e",
      descriptor = "I"
   )
   public int field9295;
   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9297 = new String[]{method4689(method4688("\u001d@d\u000b0")), method4689(method4688("\u0002\u0006+\u000b\tN")), method4689(method4688("\b\u001b&I")), method4689(method4688("\u0002\u0006+\u000b9\t=>W$\b\tb")), method4689(method4688("\u0002\u0006+\u000b\fN")), method4689(method4688("\u0002\u0006+\u000b\u000fN")), method4689(method4688("\u0002\u0006+\u000b\u000eN")), method4689(method4688("\u0002\u0004")), method4689(method4688("\u0002\u0006+\u000bq\u000f\u0000#QsN"))};
   @OriginalMember(
      owner = "client!dha",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field9294 = new int[]{16, 32, 64, 128};
   @OriginalMember(
      owner = "client!dha",
      name = "b",
      descriptor = "I"
   )
   public static int field9289;
   @OriginalMember(
      owner = "client!dha",
      name = "d",
      descriptor = "I"
   )
   public static int field9290;
   @OriginalMember(
      owner = "client!dha",
      name = "i",
      descriptor = "I"
   )
   public static int field9291;
   @OriginalMember(
      owner = "client!dha",
      name = "g",
      descriptor = "I"
   )
   public static int field9292;
   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "I"
   )
   public static int field9293;
   @OriginalMember(
      owner = "client!dha",
      name = "f",
      descriptor = "Lrr;"
   )
   public static class678 field9288;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!dha",
      name = "c",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9296;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method4687(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 8
   )
   public final String toString() {
      try {
         ++field9289;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9297[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(I)V",
      line = 17
   )
   public static void method4683(int arg0) {
      try {
         field9294 = null;
         if (arg0 != 1) {
            method4684(true, (String)null, true);
         }

         field9288 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9297[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(ZLjava/lang/String;Z)V",
      line = 31
   )
   public static final void method4684(boolean arg0, String arg1, boolean arg2) {
      boolean var3 = client.field1786;

      try {
         ++field9293;
         if (arg2) {
            if (arg1 != null) {
               if (~class377.field5987 <= -101) {
                  class23.method170(4, 0, class499.field7627.method3875(class493.field7455, 120));
               } else {
                  String var4 = class427.method3381(arg1, 0);
                  if (var4 != null) {
                     int var5 = 0;
                     if (var3 || ~class377.field5987 < ~var5) {
                        do {
                           String var6 = class427.method3381(class698.field10370[var5], 0);
                           if (var6 != null && var6.equals(var4)) {
                              class23.method170(4, 0, arg1 + class499.field7628.method3875(class493.field7455, 114));
                              return;
                           }

                           if (class459.field7008[var5] != null) {
                              String var7 = class427.method3381(class459.field7008[var5], 0);
                              if (var7 != null && var7.equals(var4)) {
                                 class23.method170(4, 0, arg1 + class499.field7628.method3875(class493.field7455, 92));
                                 return;
                              }
                           }

                           ++var5;
                        } while(~class377.field5987 < ~var5);
                     }

                     int var8 = 0;
                     String var9;
                     String var10;
                     if (var3) {
                        var9 = class427.method3381(class626.field9075[var8], 0);
                        if (var9 != null && var9.equals(var4)) {
                           class23.method170(4, 0, class499.field7633.method3875(class493.field7455, 91) + arg1 + class499.field7634.method3875(class493.field7455, 112));
                           return;
                        }

                        if (class155.field2307[var8] != null) {
                           var10 = class427.method3381(class155.field2307[var8], 0);
                           if (var10 != null && var10.equals(var4)) {
                              class23.method170(4, 0, class499.field7633.method3875(class493.field7455, 95) + arg1 + class499.field7634.method3875(class493.field7455, 115));
                              return;
                           }
                        }

                        ++var8;
                     }

                     while(true) {
                        String var10000;
                        if (~var8 <= ~class148.field2244) {
                           var10000 = class427.method3381(class476.field7251.field67, 0);
                           if (!var3) {
                              if (var10000.equals(var4)) {
                                 class23.method170(4, 0, class499.field7630.method3875(class493.field7455, 93));
                                 return;
                              }

                              ++class156.field2325;
                              class29 var11 = class578.method4332((byte)-32);
                              class577 var12 = class218.method1888(class657.field9824, 96, var11.field361);
                              var12.field8531.method2864(-26110, class714.method5292((byte)-97, arg1) + 1);
                              var12.field8531.method2862(arg1, arg2);
                              var12.field8531.method2864(-26110, arg0 ? 1 : 0);
                              var11.method211(var12, 115);
                              return;
                           }
                        } else {
                           var10000 = class427.method3381(class626.field9075[var8], 0);
                        }

                        var9 = var10000;
                        if (var9 != null && var9.equals(var4)) {
                           class23.method170(4, 0, class499.field7633.method3875(class493.field7455, 91) + arg1 + class499.field7634.method3875(class493.field7455, 112));
                           return;
                        }

                        if (class155.field2307[var8] != null) {
                           var10 = class427.method3381(class155.field2307[var8], 0);
                           if (var10 != null && var10.equals(var4)) {
                              class23.method170(4, 0, class499.field7633.method3875(class493.field7455, 95) + arg1 + class499.field7634.method3875(class493.field7455, 115));
                              return;
                           }
                        }

                        ++var8;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field9297[1] + arg0 + ',' + (arg1 != null ? field9297[0] : field9297[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(III)Z",
      line = 134
   )
   public static final boolean method4685(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 4) {
            method4684(false, (String)null, true);
         }

         ++field9290;
         return class238.method2031(arg1, arg2, 11760) || class246.method2092((byte)-40, arg2, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9297[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(IIIZ)Z",
      line = 146
   )
   public static final boolean method4686(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field9292;
         if (arg3) {
            method4685(61, 38, -87);
         }

         boolean var4 = true;
         class434 var5 = (class434)class471.method3661(arg2, arg0, arg1);
         if (var5 != null) {
            var4 &= class124.method1179(7, var5);
         }

         class434 var6 = (class434)class288.method2404(arg2, arg0, arg1, field9296 != null ? field9296 : (field9296 = method4687(field9297[7])));
         if (var6 != null) {
            var4 &= class124.method1179(7, var6);
         }

         class434 var7 = (class434)class269.method2302(arg2, arg0, arg1);
         if (var7 != null) {
            var4 &= class124.method1179(7, var7);
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9297[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V",
      line = 179
   )
   public class642(String arg0, int arg1) {
      try {
         this.field9295 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9297[8] + (arg0 != null ? field9297[0] : field9297[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4688(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4689(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
