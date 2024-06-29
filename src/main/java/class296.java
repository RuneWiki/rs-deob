import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class296 {
   @OriginalMember(
      owner = "client!jfa",
      name = "c",
      descriptor = "Llj;"
   )
   private class304 field4671 = new class304(128);
   @OriginalMember(
      owner = "client!jfa",
      name = "g",
      descriptor = "Lrr;"
   )
   private class678 field4675;
   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4676 = new String[]{method2492(method2491("KEWQv\t")), method2492(method2491("OVZ\u0013")), method2492(method2491("Z\r\u0018QJ")), method2492(method2491("KEWQr\t")), method2492(method2491("KEWQu\t")), method2492(method2491("KEWQt\t")), method2492(method2491("KEWQ\u000bHM_\u000b\t\t")), method2492(method2491("KEWQs\t"))};
   @OriginalMember(
      owner = "client!jfa",
      name = "d",
      descriptor = "I"
   )
   public static int field4669;
   @OriginalMember(
      owner = "client!jfa",
      name = "b",
      descriptor = "I"
   )
   public static int field4670;
   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "I"
   )
   public static int field4673;
   @OriginalMember(
      owner = "client!jfa",
      name = "f",
      descriptor = "I"
   )
   public static int field4674;
   @OriginalMember(
      owner = "client!jfa",
      name = "e",
      descriptor = "[[Lfq;"
   )
   public static class374[][] field4672;

   @OriginalMember(
      owner = "client!jfa",
      name = "b",
      descriptor = "(II)Ldl;"
   )
   public final class127 method2486(int arg0, int arg1) {
      try {
         ++field4674;
         class304 var3 = this.field4671;
         class127 var4;
         synchronized(this.field4671) {
            var4 = (class127)this.field4671.method2544(false, (long)arg1);
         }

         if (arg0 != -27622) {
            return null;
         } else if (var4 != null) {
            return var4;
         } else {
            byte[] var5 = this.field4675.method5017(class406.method3261(arg1, true), class665.method4916((byte)59, arg1), (byte)71);
            class127 var6 = new class127();
            if (var5 != null) {
               var6.method1205(new class354(var5), 0);
            }

            class304 var7 = this.field4671;
            synchronized(this.field4671) {
               this.field4671.method2545((long)arg1, 109, var6);
               return var6;
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field4676[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(ILjava/lang/String;ZI)V"
   )
   public static final void method2487(int arg0, String arg1, boolean arg2, int arg3) {
      try {
         class733.method5399(0);
         ++field4669;
         class351.method2823((byte)118);
         if (arg3 < -53) {
            class734.method5405(false);
            class423.method3358(false, arg1, arg2, arg0);
            class331.method2698(0);
            class463.method3592(0, class351.field5356);
            class40.method283(class351.field5356, 115);
            class281.method2351(class351.field5356, 32323, class316.field4879);
            class5.method20((byte)-68);
            class636.method4643(-10, class547.field8199);
            class204.method1782((byte)7);
            class698.method5133(127);
            if (class342.field5204 == 3) {
               class69.method532(1, 4);
            } else if (class342.field5204 == 7) {
               class69.method532(1, 8);
            } else if (class342.field5204 == 9) {
               class69.method532(1, 10);
            } else if (class342.field5204 == 11) {
               class69.method532(1, 12);
            } else {
               if (~class342.field5204 == -2 || class342.field5204 == 2) {
                  class426.method3378(false);
               }

            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4676[3] + arg0 + ',' + (arg1 != null ? field4676[2] : field4676[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2488(int arg0, int arg1) {
      try {
         ++field4670;
         if (class687.field10213.field511.method2741(480102311) == 0) {
            arg0 = -1;
         }

         if (~class308.field4802 != ~arg0) {
            if (arg0 != -1) {
               label28: {
                  class748 var2 = class581.field8578.method5195(arg0, arg1 + 10587);
                  class776 var3 = var2.method5497(-99);
                  if (var3 == null) {
                     arg0 = -1;
                     if (!client.field1786) {
                        break label28;
                     }
                  }

                  class498.field7578.method2426(new Point(var2.field11095, var2.field11091), var3.method5641(), class544.field8183, var3.method5648(), var3.method5636(), (byte)-106);
                  class308.field4802 = arg0;
               }
            }

            if (arg0 == arg1 && ~class308.field4802 != 0) {
               class498.field7578.method2426(new Point(), (int[])null, class544.field8183, -1, -1, (byte)-106);
               class308.field4802 = -1;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4676[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2489(int arg0, int arg1, int arg2) {
      try {
         if (arg0 < 47) {
            field4672 = null;
         }

         ++field4673;
         return class66.method509(arg1, 2048, arg2) || class348.method2804(0, arg2, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4676[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2490(int arg0) {
      try {
         field4672 = null;
         if (arg0 != 22815) {
            method2487(-95, (String)null, true, -65);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4676[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V"
   )
   public class296(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field4675 = arg2;
         if (this.field4675 != null) {
            int var4 = this.field4675.method5008(-1) - 1;
            this.field4675.method4998((byte)-82, var4);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4676[6] + (arg0 != null ? field4676[2] : field4676[1]) + ',' + arg1 + ',' + (arg2 != null ? field4676[2] : field4676[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2491(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2492(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
