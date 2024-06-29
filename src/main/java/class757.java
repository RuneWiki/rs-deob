import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class757 {
   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11171 = new String[]{method5502(method5501("T'\u000bP\u001d\u001d")), method5502(method5501("T'\u000bP\u001e\u001d")), method5502(method5501("NjDP\"")), method5502(method5501("[1\u0006\u0012")), method5502(method5501("T'\u000bP\u001c\u001d")), method5502(method5501("T'\u000bP\u001b\u001d"))};
   @OriginalMember(
      owner = "client!aca",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field11161 = new class101(16, 0);
   @OriginalMember(
      owner = "client!aca",
      name = "h",
      descriptor = "I"
   )
   public static int field11170 = 0;
   @OriginalMember(
      owner = "client!aca",
      name = "j",
      descriptor = "I"
   )
   public static int field11168 = 0;
   @OriginalMember(
      owner = "client!aca",
      name = "e",
      descriptor = "I"
   )
   public static int field11159;
   @OriginalMember(
      owner = "client!aca",
      name = "i",
      descriptor = "I"
   )
   public static int field11160;
   @OriginalMember(
      owner = "client!aca",
      name = "l",
      descriptor = "I"
   )
   public static int field11163;
   @OriginalMember(
      owner = "client!aca",
      name = "f",
      descriptor = "I"
   )
   public int field11165;
   @OriginalMember(
      owner = "client!aca",
      name = "b",
      descriptor = "I"
   )
   public int field11166;
   @OriginalMember(
      owner = "client!aca",
      name = "g",
      descriptor = "I"
   )
   public int field11169;
   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "Z"
   )
   public boolean field11162;
   @OriginalMember(
      owner = "client!aca",
      name = "k",
      descriptor = "Z"
   )
   public boolean field11164;
   @OriginalMember(
      owner = "client!aca",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field11167;

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(IJ)V",
      line = 3
   )
   public static final void method5497(int arg0, long arg1) {
      int var3 = client.field4530;

      try {
         ++field11159;
         int var4 = class537.field7853;
         if (class573.field8527 != var4) {
            int var6;
            label81: {
               int var5 = -class573.field8527 + var4;
               var6 = (int)((long)var5 * arg1 / 320L);
               if (var5 > 0) {
                  if (var6 == 0) {
                     var6 = 1;
                     if (var3 == 0) {
                        break label81;
                     }
                  }

                  if (var6 <= var5) {
                     break label81;
                  }

                  var6 = var5;
                  if (var3 == 0) {
                     break label81;
                  }
               }

               if (~var6 != -1) {
                  if (var5 <= var6) {
                     break label81;
                  }

                  var6 = var5;
                  if (var3 == 0) {
                     break label81;
                  }
               }

               var6 = -1;
            }

            class573.field8527 += var6;
         }

         int var7 = class650.field9486;
         class56.field706 += (float)arg1 * class280.field3895 / 40.0F * 8.0F;
         if (class747.field11068 != var7) {
            int var9;
            label83: {
               int var8 = -class747.field11068 + var7;
               var9 = (int)((long)var8 * arg1 / 320L);
               if (~var8 >= -1) {
                  if (var9 == 0) {
                     var9 = -1;
                     if (var3 == 0) {
                        break label83;
                     }
                  }

                  if (var9 >= var8) {
                     break label83;
                  }

                  var9 = var8;
                  if (var3 == 0) {
                     break label83;
                  }
               }

               if (var9 != 0) {
                  if (~var8 <= ~var9) {
                     break label83;
                  }

                  var9 = var8;
                  if (var3 == 0) {
                     break label83;
                  }
               }

               var9 = 1;
            }

            class747.field11068 += var9;
         }

         class317.field4533 += (float)arg1 * class186.field2333 / 40.0F * 8.0F;
         class383.method2947(arg0 ^ 7379);
         if (arg0 != 26295) {
            method5497(-2, -68L);
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field11171[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(I)V",
      line = 89
   )
   public static void method5498(int arg0) {
      try {
         if (arg0 > -28) {
            field11170 = -125;
         }

         field11167 = null;
         field11161 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11171[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(DI)V",
      line = 108
   )
   public static final void method5499(double arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 != 255) {
            field11170 = -26;
         }

         ++field11160;
         if (class580.field8593 != arg0) {
            int var4 = 0;
            int var5;
            if (var3 != 0) {
               var5 = (int)(Math.pow((double)var4 / 255.0D, arg0) * 255.0D);
               class638.field9286[var4] = var5 > 255 ? 255 : var5;
               ++var4;
            }

            while(true) {
               double var10000;
               if (~var4 <= -257) {
                  var10000 = arg0;
                  if (var3 == 0) {
                     class580.field8593 = arg0;
                     return;
                  }
               } else {
                  var10000 = Math.pow((double)var4 / 255.0D, arg0) * 255.0D;
               }

               var5 = (int)var10000;
               class638.field9286[var4] = var5 > 255 ? 255 : var5;
               ++var4;
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11171[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(BLjava/lang/String;)V",
      line = 141
   )
   public static final void method5500(byte arg0, String arg1) {
      try {
         ++field11163;
         if (arg0 != 22) {
            field11161 = null;
         }

         if (class455.field6905 != null) {
            ++class726.field10791;
            class180 var2 = class486.method3603(class656.field9531, (byte)-113, class48.field583);
            var2.field2211.method1085(class543.method4009(true, arg1), (byte)-11);
            var2.field2211.method1101(arg1, arg0 ^ -116);
            class763.method5527(false, var2);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11171[1] + arg0 + ',' + (arg1 != null ? field11171[2] : field11171[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5501(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5502(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
