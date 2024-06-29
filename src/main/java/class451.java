import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class451 {
   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6394 = new String[]{method3295(method3294("bf!\u00041")), method3295(method3294("p#n\u0004\u000e1")), method3295(method3294("w=cF")), method3295(method3294("p#n\u0004\r1")), method3295(method3294("p#n\u0004\u000f1"))};
   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "I"
   )
   public int field6389;
   @OriginalMember(
      owner = "client!ika",
      name = "d",
      descriptor = "I"
   )
   public static int field6391;
   @OriginalMember(
      owner = "client!ika",
      name = "e",
      descriptor = "I"
   )
   public static int field6392;
   @OriginalMember(
      owner = "client!ika",
      name = "b",
      descriptor = "I"
   )
   public static int field6393;
   @OriginalMember(
      owner = "client!ika",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public String field6390;

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(IILbl;I)V"
   )
   public static final void method3291(int arg0, int arg1, class678 arg2, int arg3) {
      try {
         ++field6392;
         if (class182.field2549 == null && !class131.field1677) {
            if (arg2 != null && class338.method2490(arg1 ^ 124, arg2) != null) {
               if (arg1 != -1) {
                  method3291(-43, 105, (class678)null, 42);
               }

               class182.field2549 = arg2;
               class368.field5038 = class338.method2490(arg1 + -53, arg2);
               class590.field8699 = 0;
               class252.field3439 = arg3;
               class73.field905 = false;
               class741.field10809 = arg0;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6394[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6394[0] : field6394[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(II[Lbl;)V"
   )
   public static final void method3292(int param0, int param1, class678[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(CZ)Z"
   )
   public static final boolean method3293(char arg0, boolean arg1) {
      boolean var2 = client.field4360;

      try {
         ++field6391;
         if (Character.isISOControl(arg0)) {
            return false;
         } else if (class778.method5602(10358, arg0)) {
            return true;
         } else {
            char[] var3 = class151.field2112;
            int var4 = 0;
            if (!arg1) {
               return true;
            } else {
               while(true) {
                  char var10000;
                  if (~var4 <= ~var3.length) {
                     char[] var6 = class457.field6569;
                     var10000 = 0;
                     if (!var2) {
                        int var7 = 0;
                        char var8;
                        if (var2) {
                           var8 = var6[var7];
                           if (arg0 == var8) {
                              return true;
                           }

                           ++var7;
                        }

                        while(true) {
                           if (var7 >= var6.length) {
                              var10000 = 0;
                              if (!var2) {
                                 return false;
                              }
                           } else {
                              var10000 = var6[var7];
                           }

                           var8 = var10000;
                           if (arg0 == var8) {
                              return true;
                           }

                           ++var7;
                        }
                     }
                  } else {
                     var10000 = var3[var4];
                  }

                  char var5 = var10000;
                  if (~arg0 == ~var5) {
                     return true;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field6394[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3294(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3295(char[] arg0) {
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
            var10005 = 72;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
