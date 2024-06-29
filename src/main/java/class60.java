import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class60 extends class76 {
   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "Lgga;"
   )
   public class308 field740;
   @OriginalMember(
      owner = "client!vg",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field744 = new String[]{method466(method465("NC\u0017\tu")), method466(method465("C\n\u0017d ")), method466(method465("VQU&")), method466(method465("NC\u0017\u000bu")), method466(method465("NC\u0017v4VMMtu")), method466(method465("NC\u0017\bu"))};
   @OriginalMember(
      owner = "client!vg",
      name = "A",
      descriptor = "Lek;"
   )
   public static class536 field737 = new class536(23, 7);
   @OriginalMember(
      owner = "client!vg",
      name = "G",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field741 = new Hashtable();
   @OriginalMember(
      owner = "client!vg",
      name = "B",
      descriptor = "I"
   )
   public static int field743 = 503;
   @OriginalMember(
      owner = "client!vg",
      name = "D",
      descriptor = "Leg;"
   )
   public static class118 field742 = new class118(114, 3);
   @OriginalMember(
      owner = "client!vg",
      name = "F",
      descriptor = "I"
   )
   public static int field738;
   @OriginalMember(
      owner = "client!vg",
      name = "C",
      descriptor = "I"
   )
   public static int field739;

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(ILkf;)V",
      line = 4
   )
   public static final void method462(int arg0, class266 arg1) {
      try {
         if (arg0 == -8658) {
            ++field738;
            class753.field11152 = arg1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field744[3] + arg0 + ',' + (arg1 != null ? field744[1] : field744[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "c",
      descriptor = "(B)V",
      line = 19
   )
   public static void method463(byte arg0) {
      try {
         field741 = null;
         field737 = null;
         if (arg0 == -44) {
            field742 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field744[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(Z)V",
      line = 34
   )
   public static final void method464(boolean arg0) {
      boolean var1 = client.field4360;

      try {
         ++field739;
         if (class546.field7829 == null) {
            class546.field7829 = new int[65536];
            if (!var1) {
               if (arg0) {
                  field737 = null;
               }

               double var2 = -0.015D + Math.random() * 0.03D + 0.7D;
               int var4 = 0;
               if (!var1 && ~var4 <= -65537) {
                  return;
               }

               do {
                  double var5 = (double)(var4 >> 10 & 63) / 64.0D + 0.0078125D;
                  double var7 = (double)((var4 & 1014) >> 7) / 8.0D + 0.0625D;
                  double var9 = (double)(var4 & 127) / 128.0D;
                  double var11 = var9;
                  double var13 = var9;
                  double var15 = var9;
                  if (var7 != 0.0D) {
                     label122: {
                        double var17;
                        if (!(var9 < 0.5D)) {
                           var17 = var7 + var9 - var7 * var9;
                           if (var1) {
                              var17 = (var7 + 1.0D) * var9;
                           }
                        } else {
                           var17 = (var7 + 1.0D) * var9;
                        }

                        double var19 = var9 * 2.0D + -var17;
                        double var21 = var5 + 0.3333333333333333D;
                        if (var21 > 1.0D) {
                           --var21;
                        }

                        double var25;
                        label107: {
                           var25 = var5 - 0.3333333333333333D;
                           if (var5 * 6.0D < 1.0D) {
                              var13 = (var17 - var19) * 6.0D * var5 + var19;
                              if (!var1) {
                                 break label107;
                              }
                           }

                           if (!(var5 * 2.0D < 1.0D)) {
                              label102: {
                                 if (!(var5 * 3.0D < 2.0D)) {
                                    var13 = var19;
                                    if (!var1) {
                                       break label102;
                                    }
                                 }

                                 var13 = (var17 - var19) * (0.6666666666666666D - var5) * 6.0D + var19;
                                 if (var1) {
                                    var13 = var17;
                                 }
                              }
                           } else {
                              var13 = var17;
                           }
                        }

                        if (var25 < 0.0D) {
                           ++var25;
                        }

                        label96: {
                           if (!(var21 * 6.0D < 1.0D)) {
                              if (!(var21 * 2.0D < 1.0D)) {
                                 if (!(var21 * 3.0D < 2.0D)) {
                                    var11 = var19;
                                    if (!var1) {
                                       break label96;
                                    }
                                 }

                                 var11 = (0.6666666666666666D - var21) * (-var19 + var17) * 6.0D + var19;
                                 if (!var1) {
                                    break label96;
                                 }
                              }

                              var11 = var17;
                              if (!var1) {
                                 break label96;
                              }
                           }

                           var11 = (var17 - var19) * 6.0D * var21 + var19;
                        }

                        if (!(var25 * 6.0D < 1.0D)) {
                           if (!(var25 * 2.0D < 1.0D)) {
                              if (!(var25 * 3.0D < 2.0D)) {
                                 var15 = var19;
                                 if (!var1) {
                                    break label122;
                                 }
                              }

                              var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                              if (!var1) {
                                 break label122;
                              }
                           }

                           var15 = var17;
                           if (!var1) {
                              break label122;
                           }
                        }

                        var15 = (-var19 + var17) * 6.0D * var25 + var19;
                     }
                  }

                  double var27 = Math.pow(var11, var2);
                  double var29 = Math.pow(var13, var2);
                  double var31 = Math.pow(var15, var2);
                  int var33 = (int)(var27 * 256.0D);
                  int var34 = (int)(var29 * 256.0D);
                  int var35 = (int)(var31 * 256.0D);
                  int var36 = (var33 << 16) - (-(var34 << 8) + -var35);
                  class546.field7829[var4] = var36;
                  ++var4;
               } while(~var4 > -65537);

               return;
            }
         }

      } catch (RuntimeException var38) {
         throw class237.method1823(var38, field744[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "<init>",
      descriptor = "(Lgga;)V",
      line = 147
   )
   public class60(class308 arg0) {
      try {
         this.field740 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field744[4] + (arg0 != null ? field744[1] : field744[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method465(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method466(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
