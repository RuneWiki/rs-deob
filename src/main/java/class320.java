import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class320 {
   @OriginalMember(
      owner = "client!mh",
      name = "l",
      descriptor = "I"
   )
   public int field4788 = 16777215;
   @OriginalMember(
      owner = "client!mh",
      name = "e",
      descriptor = "I"
   )
   public int field4789 = 8;
   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4791 = new String[]{method2591(method2590("cY\f,\u0006")), method2591(method2590("v\u0002Nn")), method2591(method2590("u\u001f\fAS")), method2591(method2590("u\u001f\f@S")), method2591(method2590("u\u001f\fCS")), method2591(method2590("u\u001f\fGS")), method2591(method2590("u\u001f\fFS"))};
   @OriginalMember(
      owner = "client!mh",
      name = "h",
      descriptor = "I"
   )
   public static int field4774;
   @OriginalMember(
      owner = "client!mh",
      name = "n",
      descriptor = "I"
   )
   public static int field4777;
   @OriginalMember(
      owner = "client!mh",
      name = "j",
      descriptor = "I"
   )
   public int field4778;
   @OriginalMember(
      owner = "client!mh",
      name = "f",
      descriptor = "I"
   )
   public int field4780;
   @OriginalMember(
      owner = "client!mh",
      name = "g",
      descriptor = "I"
   )
   public int field4781;
   @OriginalMember(
      owner = "client!mh",
      name = "d",
      descriptor = "I"
   )
   public int field4782;
   @OriginalMember(
      owner = "client!mh",
      name = "q",
      descriptor = "I"
   )
   public static int field4783;
   @OriginalMember(
      owner = "client!mh",
      name = "p",
      descriptor = "I"
   )
   public int field4784;
   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "I"
   )
   public int field4785;
   @OriginalMember(
      owner = "client!mh",
      name = "b",
      descriptor = "I"
   )
   public int field4786;
   @OriginalMember(
      owner = "client!mh",
      name = "c",
      descriptor = "I"
   )
   public int field4787;
   @OriginalMember(
      owner = "client!mh",
      name = "k",
      descriptor = "I"
   )
   public static int field4790;
   @OriginalMember(
      owner = "client!mh",
      name = "m",
      descriptor = "Z"
   )
   public boolean field4775;
   @OriginalMember(
      owner = "client!mh",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field4779;
   @OriginalMember(
      owner = "client!mh",
      name = "o",
      descriptor = "[[B"
   )
   public static byte[][] field4776;

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method2585(int arg0, boolean arg1) {
      boolean var2 = client.field10022;

      try {
         if (arg1) {
            if (~class7.field130 != 0) {
               class230.method2051((byte)115, class7.field130);
            }

            int var10000;
            label65: {
               class733 var3 = (class733)class139.field2228.method3102(-79);
               if (var2) {
                  var10000 = var3.method2143(29962);
               } else if (var3 == null) {
                  class7.field130 = -1;
                  class139.field2228 = new class398(8);
                  class48.method532(Integer.MIN_VALUE);
                  class7.field130 = class26.field366;
                  class487.method3707(1, false);
                  class258.method2194(-44);
                  var10000 = class7.field130;
                  if (!var2) {
                     break label65;
                  }
               } else {
                  var10000 = var3.method2143(29962);
               }

               label64:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class733)class139.field2228.method3102(84);
                        if (var3 == null) {
                           if (!var2) {
                              class7.field130 = -1;
                              class139.field2228 = new class398(8);
                              class48.method532(Integer.MIN_VALUE);
                              class7.field130 = class26.field366;
                              class487.method3707(1, false);
                              class258.method2194(-44);
                              var10000 = class7.field130;
                              break;
                           }

                           class519.method3879(true, var3, (byte)87, false);
                           var3 = (class733)class139.field2228.method3095((byte)-118);
                        } else {
                           class519.method3879(true, var3, (byte)87, false);
                           var3 = (class733)class139.field2228.method3095((byte)-118);
                        }
                     } else {
                        class519.method3879(true, var3, (byte)87, false);
                        var3 = (class733)class139.field2228.method3095((byte)-118);
                     }

                     if (var3 == null) {
                        class7.field130 = -1;
                        class139.field2228 = new class398(8);
                        class48.method532(Integer.MIN_VALUE);
                        class7.field130 = class26.field366;
                        class487.method3707(1, false);
                        class258.method2194(-44);
                        var10000 = class7.field130;
                        if (!var2) {
                           break label64;
                        }
                     } else {
                        var10000 = var3.method2143(29962);
                     }
                  }
               } while(var2);
            }

            class427.method3345(var10000);
         }

         label33: {
            ++field4777;
            class277.method2334(0);
            class208.field2957 = false;
            int var4 = -57 % ((4 - arg0) / 36);
            class370.method2908(-119);
            class357.field5276 = -1;
            class798.method5750(class316.field4726, 0);
            class117.field1849 = new class158();
            class117.field1849.field6833 = class209.field2989 * 512 / 2;
            class117.field1849.field5861[0] = class234.field3626 / 2;
            class117.field1849.field6832 = class234.field3626 * 512 / 2;
            class117.field1849.field5865[0] = class209.field2989 / 2;
            class222.field3158 = 0;
            class670.field9407 = 0;
            if (~class306.field4639 != -3) {
               class796.method5729(10501);
               if (!var2) {
                  break label33;
               }
            }

            class670.field9407 = class268.field4118 << 9;
            class222.field3158 = class768.field11025 << 9;
         }

         class215.method1854((byte)-127);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4791[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2586(int arg0) {
      try {
         field4776 = null;
         if (arg0 != 3) {
            method2585(52, true);
         }

         field4779 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4791[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(Lcu;IB)V"
   )
   private final void method2587(class65 arg0, int arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         label68: {
            if (arg1 == 1) {
               this.field4789 = arg0.method685(-2);
               if (!var4) {
                  break label68;
               }
            }

            if (~arg1 != -3) {
               if (arg1 != 3) {
                  if (arg1 == 4) {
                     this.field4787 = arg0.method665(false);
                     if (!var4) {
                        break label68;
                     }
                  }

                  if (~arg1 == -6) {
                     this.field4782 = arg0.method685(-2);
                     if (!var4) {
                        break label68;
                     }
                  }

                  if (~arg1 == -7) {
                     this.field4788 = arg0.method691((byte)-126);
                     if (!var4) {
                        break label68;
                     }
                  }

                  if (arg1 != 7) {
                     break label68;
                  }

                  this.field4784 = arg0.method655((byte)126);
                  this.field4785 = arg0.method655((byte)118);
                  this.field4781 = arg0.method655((byte)116);
                  if (!var4) {
                     break label68;
                  }
               }

               this.field4780 = arg0.method655((byte)110);
               this.field4786 = arg0.method655((byte)73);
               this.field4778 = arg0.method655((byte)113);
               if (!var4) {
                  break label68;
               }
            }

            this.field4775 = true;
         }

         ++field4783;
         int var5 = 86 / ((-31 - arg2) / 55);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4791[2] + (arg0 != null ? field4791[0] : field4791[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method2588(class65 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         while(true) {
            int var4 = arg0.method665(false);
            if (~var4 != -1) {
               this.method2587(arg0, var4, (byte)-118);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field4774;
            break;
         }

         if (arg1 > -125) {
            method2585(-119, false);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4791[6] + (arg0 != null ? field4791[0] : field4791[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2589(int arg0, int arg1) {
      try {
         ++field4790;
         class287.field4295 = 3;
         class746.field10608 = 100;
         class501.field7146 = arg1;
         class460.field6701 = -1;
         if (arg0 >= -45) {
            field4779 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4791[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2590(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2591(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
