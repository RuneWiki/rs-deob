import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class321 extends class96 {
   @OriginalMember(
      owner = "client!hfa",
      name = "q",
      descriptor = "[B"
   )
   public byte[] field4795;
   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4797 = new String[]{method2596(method2595("t 4\u001eG4")), method2596(method2595("gh{\u001ey")), method2596(method2595("t 4\u001eF4")), method2596(method2595("r39\\")), method2596(method2595("t 4\u001e8u(<D:4"))};
   @OriginalMember(
      owner = "client!hfa",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field4792 = new int[5];
   @OriginalMember(
      owner = "client!hfa",
      name = "s",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4793 = new String[100];
   @OriginalMember(
      owner = "client!hfa",
      name = "u",
      descriptor = "I"
   )
   public static int field4794;
   @OriginalMember(
      owner = "client!hfa",
      name = "t",
      descriptor = "I"
   )
   public static int field4796;

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(Lie;IIZLie;)I"
   )
   public static final int method2592(class639 arg0, int arg1, int arg2, boolean arg3, class639 arg4) {
      try {
         ++field4794;
         if (~arg1 == -2) {
            int var5 = arg4.field11525;
            int var6 = arg0.field11525;
            if (!arg3) {
               if (var6 == -1) {
                  var6 = 2001;
               }

               if (var5 == -1) {
                  var5 = 2001;
               }
            }

            return -var6 + var5;
         } else if (~arg1 == -3) {
            return class801.method5769(arg4.method4656(16).field2688, class777.field11340, arg0.method4656(16).field2688, 0);
         } else if (~arg1 == -4) {
            if (!arg4.field9018.equals("-")) {
               if (arg0.field9018.equals("-")) {
                  return arg3 ? 1 : -1;
               } else {
                  return class801.method5769(arg4.field9018, class777.field11340, arg0.field9018, 0);
               }
            } else if (arg0.field9018.equals("-")) {
               return 0;
            } else {
               return !arg3 ? 1 : -1;
            }
         } else if (~arg1 == -5) {
            if (!arg4.method5707(1024)) {
               return arg0.method5707(1024) ? -1 : 0;
            } else {
               return !arg0.method5707(1024) ? 1 : 0;
            }
         } else if (arg1 == 5) {
            if (arg4.method5705((byte)-48)) {
               return !arg0.method5705((byte)-48) ? 1 : 0;
            } else {
               return arg0.method5705((byte)-48) ? -1 : 0;
            }
         } else if (~arg1 == -7) {
            if (arg4.method5706(0)) {
               return arg0.method5706(0) ? 0 : 1;
            } else {
               return !arg0.method5706(0) ? 0 : -1;
            }
         } else if (~arg1 == -8) {
            if (!arg4.method5709(-31850)) {
               return !arg0.method5709(-31850) ? 0 : -1;
            } else {
               return arg0.method5709(-31850) ? 0 : 1;
            }
         } else if (arg1 != 8) {
            int var9 = -6 % ((arg2 - 10) / 51);
            return arg4.field9023 - arg0.field9023;
         } else {
            int var7 = arg4.field9019;
            int var8 = arg0.field9019;
            if (!arg3) {
               if (~var7 == 0) {
                  var7 = 1000;
               }

               if (var8 != -1) {
                  return -var8 + var7;
               }

               var8 = 1000;
               if (!client.field10022) {
                  return -var8 + var7;
               }
            }

            if (var8 == 1000) {
               var8 = -1;
            }

            if (~var7 == -1001) {
               var7 = -1;
            }

            return -var8 + var7;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field4797[2] + (arg0 != null ? field4797[1] : field4797[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4797[1] : field4797[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method2593(boolean arg0) {
      try {
         if (!arg0) {
            field4796 = -41;
         }

         field4793 = null;
         field4792 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4797[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "()V"
   )
   public static final void method2594() {
      if (class211.field3016 != null) {
         for(int var0 = 0; var0 < class211.field3016.length; ++var0) {
            for(int var1 = 0; var1 < class155.field2381; ++var1) {
               for(int var2 = 0; var2 < class25.field360; ++var2) {
                  if (class211.field3016[var0][var1][var2] != null) {
                     class211.field3016[var0][var1][var2].method2545(0);
                  }

                  class211.field3016[var0][var1][var2] = null;
               }
            }
         }
      }

      class211.field3016 = null;
      class558.field7922 = null;
      if (class506.field7196 != null) {
         for(int var3 = 0; var3 < class506.field7196.length; ++var3) {
            for(int var4 = 0; var4 < class155.field2381; ++var4) {
               for(int var5 = 0; var5 < class25.field360; ++var5) {
                  if (class506.field7196[var3][var4][var5] != null) {
                     class506.field7196[var3][var4][var5].method2545(0);
                  }

                  class506.field7196[var3][var4][var5] = null;
               }
            }
         }
      }

      class506.field7196 = null;
      class634.field8989 = null;
      class324.field4826 = null;
      class225.field3197 = null;
      class232.field3602 = null;
      class719.field10306 = null;
      class84.field1302 = null;
      class279.field4226 = null;
      class627.field8951 = null;
      class497.method3769(-68);
      if (class788.field11486 != null) {
         for(int var6 = 0; var6 < class155.field2377; ++var6) {
            class788.field11486[var6] = null;
         }

         class155.field2377 = 0;
      }

      class615.field8739 = null;
      class705.field10147 = null;
      class399.field5912 = null;
      if (class487.field6946 != null) {
         for(int var7 = 0; var7 < class487.field6946.length; ++var7) {
            class487.field6946[var7] = null;
         }

         class139.field2234 = 0;
      }

      if (class582.field8184 != null) {
         for(int var8 = 0; var8 < class582.field8184.length; ++var8) {
            class582.field8184[var8] = null;
         }

         class432.field6346 = 0;
      }

      if (class274.field4176 != null) {
         for(int var9 = 0; var9 < class160.field2452; ++var9) {
            class274.field4176[var9] = null;
         }

         for(int var10 = 0; var10 < class522.field7337; ++var10) {
            for(int var11 = 0; var11 < class155.field2381; ++var11) {
               for(int var12 = 0; var12 < class25.field360; ++var12) {
                  class232.field3604[var10][var11][var12] = 0L;
               }
            }
         }

         class160.field2452 = 0;
      }

      class546.method4093(-125);
      class416.field6098 = class416.field6085;
      class416.field6098.method1567((byte)-110);
      class6.field103 = null;
      class157.field2392 = null;
      class175.field2603 = null;
      if (class468.field6786 != null) {
         class346.method2748();
         class720.field10315.method155(1);
         class720.field10315.method174(0);
      }

      if (class164.field2483 != null) {
         class164.field2483 = null;
      }

      class720.field10315 = null;
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class321(byte[] arg0) {
      try {
         this.field4795 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4797[4] + (arg0 != null ? field4797[1] : field4797[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2595(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2596(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
