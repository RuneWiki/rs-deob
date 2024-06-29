import java.awt.Container;
import java.awt.Insets;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class619 {
   @OriginalMember(
      owner = "client!afa",
      name = "e",
      descriptor = "Liw;"
   )
   private class107 field8869 = new class107(16);
   @OriginalMember(
      owner = "client!afa",
      name = "i",
      descriptor = "Lsa;"
   )
   private class39 field8865;
   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8873 = new String[]{method4569(method4568("p\r\b[I9")), method4569(method4568("p\r\b[D9")), method4569(method4568("p\r\b[C9")), method4569(method4568("jEG[|")), method4569(method4568("p\r\b[=x\u0005\u0000\u0001?9")), method4569(method4568("\u007f\u001e\u0005\u0019")), method4569(method4568("p\r\b[B9")), method4569(method4568("p\r\b[G9")), method4569(method4568("p\r\b[F9")), method4569(method4568("p\r\b[@9")), method4569(method4568("y\u001cZ\u0011")), method4569(method4568("{\n\n\u0019hs")), method4569(method4568("p\r\b[E9"))};
   @OriginalMember(
      owner = "client!afa",
      name = "h",
      descriptor = "Lbu;"
   )
   public static class234 field8872 = new class234(6, 0, 4, 2);
   @OriginalMember(
      owner = "client!afa",
      name = "j",
      descriptor = "I"
   )
   public static int field8863;
   @OriginalMember(
      owner = "client!afa",
      name = "g",
      descriptor = "I"
   )
   public static int field8864;
   @OriginalMember(
      owner = "client!afa",
      name = "d",
      descriptor = "I"
   )
   public static int field8866;
   @OriginalMember(
      owner = "client!afa",
      name = "f",
      descriptor = "I"
   )
   public static int field8867;
   @OriginalMember(
      owner = "client!afa",
      name = "c",
      descriptor = "I"
   )
   public static int field8868;
   @OriginalMember(
      owner = "client!afa",
      name = "b",
      descriptor = "I"
   )
   public static int field8870;
   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "I"
   )
   public static int field8871;

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4560(int arg0) {
      try {
         int var1 = 74 / ((arg0 - -61) / 42);
         field8872 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8873[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method4561(int arg0) {
      try {
         if (arg0 != 100) {
            this.field8869 = null;
         }

         ++field8866;
         class107 var2 = this.field8869;
         synchronized(this.field8869) {
            this.field8869.method1052(true);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8873[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method4562(byte arg0) {
      try {
         if (arg0 != 15) {
            field8872 = null;
         }

         ++field8870;
         return !class354.method2785(field8873[11], arg0 ^ -118) ? false : class354.method2785(field8873[10], -117);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8873[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4563(int arg0) {
      try {
         class107 var2 = this.field8869;
         synchronized(this.field8869) {
            if (arg0 <= 26) {
               method4560(-14);
            }

            this.field8869.method1045(3);
         }

         ++field8864;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8873[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I"
   )
   public static final int method4564(String arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field8871;
         if (!class745.field10601.field1275) {
            return -1;
         } else if (class235.field3630.containsKey(arg0)) {
            return 100;
         } else {
            String var3 = class366.method2881(arg1 + 81, arg0);
            if (var3 == null) {
               return -1;
            } else {
               String var4 = class205.field2917 + var3;
               if (!class266.field4063.method448((byte)-90, var4, "")) {
                  return -1;
               } else if (!class266.field4063.method463((byte)-128, var4)) {
                  return class266.field4063.method464(var4, (byte)38);
               } else {
                  byte[] var5 = class266.field4063.method458(0, var4, "");
                  Object var6 = null;
                  if (arg1 != 2) {
                     field8872 = null;
                  }

                  File var7;
                  try {
                     var7 = class149.method1452((byte)86, var3);
                  } catch (RuntimeException var12) {
                     return -1;
                  }

                  if (var5 != null && var7 != null) {
                     boolean var8;
                     label93: {
                        var8 = true;
                        byte[] var9 = class258.method2206(256, var7);
                        if (var9 != null && ~var5.length == ~var9.length) {
                           int var10 = 0;
                           if (var2) {
                              if (var5[var10] != var9[var10]) {
                                 var8 = false;
                                 if (!var2) {
                                    break label93;
                                 }
                              }

                              ++var10;
                           }

                           while(true) {
                              while(var10 < var9.length) {
                                 if (var5[var10] != var9[var10]) {
                                    var8 = false;
                                    if (!var2) {
                                       break label93;
                                    }
                                 }

                                 ++var10;
                              }

                              if (!var2) {
                                 if (!var2) {
                                    break label93;
                                 }
                                 break;
                              }

                              ++var10;
                           }
                        }

                        var8 = false;
                     }

                     try {
                        if (!var8) {
                           class745.field10601.method876(arg1 ^ 2, var5, var7);
                        }
                     } catch (Throwable var13) {
                        return -1;
                     }

                     class129.method1316((byte)111, var7, arg0);
                     return 100;
                  } else {
                     return -1;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field8873[6] + (arg0 != null ? field8873[3] : field8873[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method4565(boolean arg0, int arg1) {
      try {
         if (arg0) {
            method4566((byte)46);
         }

         class107 var3 = this.field8869;
         synchronized(this.field8869) {
            this.field8869.method1048(arg1, -8543);
         }

         ++field8863;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8873[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4566(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field8868;
         client var2 = class183.field2683;
         synchronized(class183.field2683) {
            if (class687.field9907 == null) {
               Container var3;
               label96: {
                  if (class800.field11642 != null) {
                     var3 = class800.field11642;
                     if (!var1) {
                        break label96;
                     }
                  }

                  if (class289.field4303 != null) {
                     var3 = class289.field4303;
                     if (!var1) {
                        break label96;
                     }
                  }

                  var3 = class65.field898;
               }

               class91.field1368 = var3.getSize().width;
               if (arg0 != 65) {
                  method4562((byte)-77);
               }

               class223.field3171 = var3.getSize().height;
               if (class800.field11642 == var3) {
                  Insets var4 = class800.field11642.getInsets();
                  class223.field3171 -= var4.top + var4.bottom;
                  class91.field1368 -= var4.right + var4.left;
               }

               label76: {
                  if (class40.method477(false) == 1) {
                     class140.field2243 = class595.field8386;
                     class541.field7634 = 0;
                     class557.field7909 = class111.field1737;
                     class245.field3760 = (class91.field1368 - class111.field1737) / 2;
                     if (!var1) {
                        break label76;
                     }
                  }

                  class300.method2491(-601);
               }

               if (class479.field6892 != class160.field2451) {
                  boolean var10000;
                  if (~class557.field7909 > -1025 && ~class140.field2243 > -769) {
                     var10000 = true;
                  } else {
                     var10000 = false;
                  }
               }

               class729.field10389.setSize(class557.field7909, class140.field2243);
               if (class54.field794 != null) {
                  label63: {
                     if (!class563.field8012) {
                        class54.field794.method148(class729.field10389, class557.field7909, class140.field2243);
                        if (!var1) {
                           break label63;
                        }
                     }

                     class674.method4880(class729.field10389, -2);
                  }
               }

               label58: {
                  if (class800.field11642 != var3) {
                     class729.field10389.setLocation(class245.field3760, class541.field7634);
                     if (!var1) {
                        break label58;
                     }
                  }

                  Insets var5 = class800.field11642.getInsets();
                  class729.field10389.setLocation(class245.field3760 + var5.left, var5.top - -class541.field7634);
               }

               if (class7.field130 != -1) {
                  class487.method3707(1, true);
               }

               class646.method4702(true);
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field8873[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(II)Lmh;"
   )
   public final class320 method4567(int arg0, int arg1) {
      try {
         ++field8867;
         class107 var3 = this.field8869;
         class320 var4;
         synchronized(this.field8869) {
            var4 = (class320)this.field8869.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            int var5 = 15 / ((-5 - arg1) / 62);
            class39 var6 = this.field8865;
            byte[] var7;
            synchronized(this.field8865) {
               var7 = this.field8865.method460((byte)-11, arg0, 30);
            }

            class320 var8 = new class320();
            if (var7 != null) {
               var8.method2588(new class65(var7), -127);
            }

            class107 var9 = this.field8869;
            synchronized(this.field8869) {
               this.field8869.method1050(-92, var8, (long)arg0);
               return var8;
            }
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field8873[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class619(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field8865 = arg2;
         this.field8865.method434((byte)-106, 30);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8873[4] + (arg0 != null ? field8873[3] : field8873[5]) + ',' + arg1 + ',' + (arg2 != null ? field8873[3] : field8873[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4568(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4569(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
