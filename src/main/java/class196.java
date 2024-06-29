import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class196 {
   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "Ltv;"
   )
   private class590 field2383 = new class590(64);
   @OriginalMember(
      owner = "client!qga",
      name = "c",
      descriptor = "Ltv;"
   )
   private class590 field2386 = new class590(100);
   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "Lqh;"
   )
   private class74 field2374;
   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2387 = new String[]{method1482(method1481("5jS<2l")), method1482(method1481("5jS<4l")), method1482(method1481("5jS<7l")), method1482(method1481("5jS<5l")), method1482(method1481("5jS<6l")), method1482(method1481("5jS<3l")), method1482(method1481("5jS<L-c[fNl")), method1482(method1481("?#\u001c<\r")), method1482(method1481("*x^~")), method1482(method1481("5jS<1l"))};
   @OriginalMember(
      owner = "client!qga",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field2375 = new int[256];
   @OriginalMember(
      owner = "client!qga",
      name = "l",
      descriptor = "I"
   )
   public static int field2377 = 0;
   @OriginalMember(
      owner = "client!qga",
      name = "e",
      descriptor = "J"
   )
   public static long field2379 = -1L;
   @OriginalMember(
      owner = "client!qga",
      name = "d",
      descriptor = "I"
   )
   public static int field2380 = -1;
   @OriginalMember(
      owner = "client!qga",
      name = "f",
      descriptor = "I"
   )
   public static int field2376;
   @OriginalMember(
      owner = "client!qga",
      name = "k",
      descriptor = "I"
   )
   public static int field2378;
   @OriginalMember(
      owner = "client!qga",
      name = "i",
      descriptor = "I"
   )
   public static int field2381;
   @OriginalMember(
      owner = "client!qga",
      name = "h",
      descriptor = "I"
   )
   public static int field2382;
   @OriginalMember(
      owner = "client!qga",
      name = "m",
      descriptor = "I"
   )
   public static int field2384;
   @OriginalMember(
      owner = "client!qga",
      name = "g",
      descriptor = "I"
   )
   public static int field2385;

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1474(byte arg0) {
      try {
         field2375 = null;
         if (arg0 <= 4) {
            method1474((byte)108);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2387[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(BZ)V"
   )
   public static final void method1475(byte arg0, boolean arg1) {
      try {
         class773.field11148.method158(class633.field8958.method507());
         ++field2382;
         int[] var2 = class633.field8958.method599();
         class110.field1398 = var2[1];
         class480.field6632 = var2[0];
         if (arg0 != -69) {
            field2377 = -19;
         }

         class257.field3279 = var2[2];
         class266.field3461 = var2[3];
         if (!arg1) {
            class633.field8958.method526(class21.field265, class528.field7241, class307.field4091, class658.field9400);
            class524.method3786(false, class483.field6658);
         } else {
            class633.field8958.method526(class517.field7097, class619.field8652, class568.field7750, class373.field5253);
            class524.method3786(false, class298.field3944);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2387[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1476(int arg0) {
      try {
         if (arg0 != 2) {
            this.method1477(124, -49);
         }

         ++field2385;
         class590 var2 = this.field2383;
         synchronized(this.field2383) {
            this.field2383.method4244(true);
         }

         class590 var3 = this.field2386;
         synchronized(this.field2386) {
            this.field2386.method4244(true);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2387[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(II)Lmk;"
   )
   public final class61 method1477(int arg0, int arg1) {
      try {
         ++field2384;
         class590 var3 = this.field2383;
         class61 var4;
         synchronized(this.field2383) {
            var4 = (class61)this.field2383.method4239((long)arg1, arg0 + -1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field2374;
            byte[] var6;
            synchronized(this.field2374) {
               var6 = this.field2374.method732(class442.method3281(arg1, false), class754.method5437(arg1, -1454207865), (byte)91);
            }

            class61 var7 = new class61();
            var7.field662 = this;
            var7.field653 = arg1;
            if (var6 != null) {
               var7.method464(arg0 + 101, new class594(var6));
            }

            var7.method462(128);
            class590 var8 = this.field2383;
            synchronized(this.field2383) {
               if (arg0 != 1) {
                  this.field2383 = null;
               }

               this.field2383.method4238(29, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2387[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "(II)Lci;"
   )
   public final class477 method1478(int arg0, int arg1) {
      try {
         ++field2381;
         class590 var3 = this.field2386;
         synchronized(this.field2386) {
            class477 var4 = (class477)this.field2386.method4239((long)arg1, 0);
            if (arg0 < 65) {
               this.method1479(-122);
            }

            if (var4 == null) {
               var4 = new class477(arg1);
               this.field2386.method4238(116, var4, (long)arg1);
            }

            return !var4.method3481(3) ? null : var4;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field2387[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1479(int arg0) {
      try {
         if (arg0 == 1) {
            ++field2378;
            class590 var2 = this.field2383;
            synchronized(this.field2383) {
               this.field2383.method4245(true);
            }

            class590 var3 = this.field2386;
            synchronized(this.field2386) {
               this.field2386.method4245(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2387[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method1480(byte arg0, int arg1) {
      try {
         class590 var3 = this.field2383;
         synchronized(this.field2383) {
            this.field2383.method4234(2, arg1);
            if (arg0 != 41) {
               method1475((byte)24, true);
            }
         }

         ++field2376;
         class590 var4 = this.field2386;
         synchronized(this.field2386) {
            this.field2386.method4234(2, arg1);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2387[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "<init>",
      descriptor = "(Lnc;ILqh;Lqh;Lqh;)V"
   )
   public class196(class26 arg0, int arg1, class74 arg2, class74 arg3, class74 arg4) {
      try {
         this.field2374 = arg2;
         if (this.field2374 != null) {
            int var6 = -1 + this.field2374.method719(true);
            this.field2374.method727(var6, -32767);
         }

         class366.method2831(arg4, 2, arg3, -102);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2387[6] + (arg0 != null ? field2387[7] : field2387[8]) + ',' + arg1 + ',' + (arg2 != null ? field2387[7] : field2387[8]) + ',' + (arg3 != null ? field2387[7] : field2387[8]) + ',' + (arg4 != null ? field2387[7] : field2387[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1481(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1482(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
