import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class48 extends class144 implements class268 {
   @OriginalMember(
      owner = "client!gs",
      name = "P",
      descriptor = "Z"
   )
   private boolean field1038 = false;
   @OriginalMember(
      owner = "client!gs",
      name = "R",
      descriptor = "Loea;"
   )
   public class621 field1020;
   @OriginalMember(
      owner = "client!gs",
      name = "hb",
      descriptor = "Z"
   )
   private boolean field1036;
   @OriginalMember(
      owner = "client!gs",
      name = "ob",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1045 = new String[]{method603(method602("X\u0017]V\u0007")), method603(method602("DJ]9R")), method603(method602("Q\u0011\u001f{")), method603(method602("X\u0017]E\u0007")), method603(method602("X\u0017]G\u0007")), method603(method602("X\u0017]C\u0007")), method603(method602("X\u0017]+FQ\r\u0007)\u0007")), method603(method602("X\u0017]_\u0007")), method603(method602("X\u0017][\u0007")), method603(method602("X\u0017]B\u0007")), method603(method602("X\u0017]Z\u0007")), method603(method602("X\u0017]S\u0007")), method603(method602("X\u0017]R\u0007")), method603(method602("X\u0017]@\u0007")), method603(method602("X\u0017]Q\u0007")), method603(method602("X\u0017]Y\u0007")), method603(method602("X\u0017]P\u0007")), method603(method602("X\u0017]A\u0007")), method603(method602("X\u0017]U\u0007")), method603(method602("X\u0017]^\u0007")), method603(method602("X\u0017]D\u0007")), method603(method602("X\u0017]\\\u0007")), method603(method602("X\u0017]T\u0007")), method603(method602("X\u0017]X\u0007")), method603(method602("X\u0017]F\u0007")), method603(method602("X\u0017]]\u0007"))};
   @OriginalMember(
      owner = "client!gs",
      name = "mb",
      descriptor = "Lqi;"
   )
   public static class591 field1042 = new class591(0);
   @OriginalMember(
      owner = "client!gs",
      name = "nb",
      descriptor = "I"
   )
   public static int field1018;
   @OriginalMember(
      owner = "client!gs",
      name = "Z",
      descriptor = "I"
   )
   public static int field1019;
   @OriginalMember(
      owner = "client!gs",
      name = "M",
      descriptor = "I"
   )
   public static int field1021;
   @OriginalMember(
      owner = "client!gs",
      name = "ib",
      descriptor = "I"
   )
   public static int field1022;
   @OriginalMember(
      owner = "client!gs",
      name = "N",
      descriptor = "I"
   )
   public static int field1023;
   @OriginalMember(
      owner = "client!gs",
      name = "Y",
      descriptor = "I"
   )
   public static int field1024;
   @OriginalMember(
      owner = "client!gs",
      name = "ab",
      descriptor = "I"
   )
   public static int field1025;
   @OriginalMember(
      owner = "client!gs",
      name = "X",
      descriptor = "I"
   )
   public static int field1026;
   @OriginalMember(
      owner = "client!gs",
      name = "U",
      descriptor = "I"
   )
   public static int field1027;
   @OriginalMember(
      owner = "client!gs",
      name = "V",
      descriptor = "I"
   )
   public static int field1028;
   @OriginalMember(
      owner = "client!gs",
      name = "S",
      descriptor = "I"
   )
   public static int field1029;
   @OriginalMember(
      owner = "client!gs",
      name = "eb",
      descriptor = "I"
   )
   public static int field1030;
   @OriginalMember(
      owner = "client!gs",
      name = "bb",
      descriptor = "I"
   )
   public static int field1031;
   @OriginalMember(
      owner = "client!gs",
      name = "Q",
      descriptor = "I"
   )
   public static int field1032;
   @OriginalMember(
      owner = "client!gs",
      name = "O",
      descriptor = "I"
   )
   public static int field1033;
   @OriginalMember(
      owner = "client!gs",
      name = "kb",
      descriptor = "I"
   )
   public static int field1034;
   @OriginalMember(
      owner = "client!gs",
      name = "gb",
      descriptor = "I"
   )
   public static int field1035;
   @OriginalMember(
      owner = "client!gs",
      name = "cb",
      descriptor = "I"
   )
   public static int field1037;
   @OriginalMember(
      owner = "client!gs",
      name = "T",
      descriptor = "I"
   )
   public static int field1039;
   @OriginalMember(
      owner = "client!gs",
      name = "fb",
      descriptor = "I"
   )
   public static int field1040;
   @OriginalMember(
      owner = "client!gs",
      name = "db",
      descriptor = "I"
   )
   public static int field1041;
   @OriginalMember(
      owner = "client!gs",
      name = "lb",
      descriptor = "I"
   )
   public static int field1043;
   @OriginalMember(
      owner = "client!gs",
      name = "W",
      descriptor = "I"
   )
   public static int field1044;
   @OriginalMember(
      owner = "client!gs",
      name = "jb",
      descriptor = "Lpca;"
   )
   private class744 field1017;

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(IZLvca;Lha;III)V"
   )
   public final void method579(int arg0, boolean arg1, class294 arg2, class65 arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg5 != 0) {
            this.method588(2);
         }

         ++field1028;
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1045[23] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1045[1] : field1045[2]) + ',' + (arg3 != null ? field1045[1] : field1045[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "k",
      descriptor = "(I)V"
   )
   public static void method580(int arg0) {
      try {
         field1042 = null;
         if (arg0 != 0) {
            method600((class65)null, 108);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1045[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public final void method581(class65 arg0, int arg1) {
      try {
         ++field1023;
         this.field1020.method4543(arg0, 9265);
         if (arg1 < 32) {
            this.field1017 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1045[7] + (arg0 != null ? field1045[1] : field1045[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(IIILha;)Z"
   )
   public final boolean method582(int arg0, int arg1, int arg2, class65 arg3) {
      try {
         ++field1021;
         class495 var5 = this.field1020.method4546(131072, false, (byte)-72, false, arg3);
         if (var5 == null) {
            return false;
         } else {
            int var6 = 93 % ((-53 - arg2) / 63);
            class173 var7 = arg3.method255();
            var7.method1008(super.field4101, super.field4097, super.field4096);
            return !class679.field9962 ? var5.method521(arg1, arg0, var7, false, 0) : var5.method551(arg1, arg0, var7, false, 0, class75.field1316);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1045[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1045[1] : field1045[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Lhw;IILhw;)V"
   )
   public static final void method583(class141 arg0, int arg1, int arg2, class141 arg3) {
      try {
         if (arg2 != 10542) {
            field1042 = null;
         }

         class418.field6108 = arg0;
         class599.field8636 = arg3;
         ++field1040;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1045[13] + (arg0 != null ? field1045[1] : field1045[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1045[1] : field1045[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Lha;Z)V"
   )
   public final void method584(class65 arg0, boolean arg1) {
      try {
         ++field1027;
         if (arg1) {
            this.field1020.method4551(arg0, (byte)2);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1045[3] + (arg0 != null ? field1045[1] : field1045[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Lwk;B)V"
   )
   public final void method585(class152 arg0, byte arg1) {
      try {
         if (arg1 == -4) {
            this.field1020.method4538(arg0, 0);
            ++field1044;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1045[5] + (arg0 != null ? field1045[1] : field1045[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "c",
      descriptor = "(Lha;I)Lpca;"
   )
   public final class744 method586(class65 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.field1038 = true;
         }

         ++field1033;
         return this.field1017;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1045[17] + (arg0 != null ? field1045[1] : field1045[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method587(boolean arg0) {
      try {
         if (!arg0) {
            this.field1017 = null;
         }

         ++field1029;
         return this.field1020.field9025;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method588(int arg0) {
      try {
         if (arg0 != 1) {
            this.field1017 = null;
         }

         ++field1018;
         return this.field1038;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method589(int arg0) {
      try {
         ++field1019;
         return arg0 != 19053 ? 16 : this.field1020.method4539(0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "f",
      descriptor = "(B)I"
   )
   public final int method590(byte arg0) {
      try {
         ++field1035;
         if (arg0 != -79) {
            this.field1036 = false;
         }

         return this.field1020.method4540((byte)71);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method591(byte arg0) {
      try {
         ++field1024;
         if (arg0 > -28) {
            this.method586((class65)null, -71);
         }

         return this.field1020.field9034;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Ljava/net/Socket;IB)Lac;"
   )
   public static final class564 method592(Socket arg0, int arg1, byte arg2) throws IOException {
      try {
         ++field1041;
         return arg2 < 22 ? null : new class255(arg0, arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1045[22] + (arg0 != null ? field1045[1] : field1045[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "e",
      descriptor = "(B)Z"
   )
   public final boolean method593(byte arg0) {
      try {
         if (arg0 != -94) {
            this.method593((byte)24);
         }

         ++field1030;
         return false;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method594(int arg0) {
      try {
         if (arg0 == 255) {
            ++field1039;
            throw new IllegalStateException();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method595(byte arg0) {
      try {
         if (arg0 != -81) {
            return true;
         } else {
            ++field1026;
            return this.field1020.method4549((byte)-32);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method596(int arg0) {
      try {
         ++field1025;
         if (arg0 != 16202) {
            this.field1020 = null;
         }

         return this.field1020.field9033;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method597(boolean arg0) {
      try {
         ++field1037;
         if (!arg0) {
            field1043 = 113;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(ZLha;)V"
   )
   public final void method598(boolean arg0, class65 arg1) {
      try {
         ++field1022;
         class495 var3 = this.field1020.method4546(262144, true, (byte)-50, arg0, arg1);
         if (var3 != null) {
            class173 var4 = arg1.method255();
            var4.method1008(super.field4101, super.field4097, super.field4096);
            this.field1020.method4550(false, arg1, super.field2348, super.field2354, -3, var4, var3, super.field2347, super.field2356);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1045[8] + arg0 + ',' + (arg1 != null ? field1045[1] : field1045[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(ILha;)Lbv;"
   )
   public final class321 method599(int arg0, class65 arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1034;
         class495 var4 = this.field1020.method4546(2048, true, (byte)-57, false, arg1);
         if (var4 == null) {
            return null;
         } else {
            class173 var5 = arg1.method255();
            if (arg0 != 50) {
               return null;
            } else {
               class321 var6;
               label58: {
                  var5.method1008(super.field4101, super.field4097, super.field4096);
                  var6 = class625.method4582(1, 0, this.field1036);
                  this.field1020.method4550(true, arg1, super.field2348, super.field2354, arg0 + -53, var5, var4, super.field2347, super.field2356);
                  if (!class679.field9962) {
                     var4.method503(var5, var6.field4630[0], 0);
                     if (!var3) {
                        break label58;
                     }
                  }

                  var4.method552(var5, var6.field4630[0], class75.field1316, 0);
               }

               if (this.field1020.field9038 != null) {
                  label52: {
                     class713 var7 = this.field1020.field9038.method493();
                     if (class679.field9962) {
                        arg1.method406(var7, class75.field1316);
                        if (!var3) {
                           break label52;
                        }
                     }

                     arg1.method256(var7);
                  }
               }

               this.field1038 = var4.method516() || this.field1020.field9038 != null;
               if (this.field1017 != null) {
                  class326.method2528(super.field4096, super.field4101, 0, super.field4097, this.field1017, var4);
                  if (!var3) {
                     return var6;
                  }
               }

               this.field1017 = class464.method3476(-27340, var4, super.field4101, super.field4096, super.field4097);
               return var6;
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1045[20] + arg0 + ',' + (arg1 != null ? field1045[1] : field1045[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "d",
      descriptor = "(Lha;I)V"
   )
   public static final void method600(class65 arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field1032;
         int var3 = 0;
         int var4 = 0;
         if (class262.field3734) {
            var3 = class124.method1174((byte)-83);
            var4 = class745.method5410(-40);
         }

         int var5 = -10660793;
         class576.method4258(class582.field8424 + var3, class733.field10544, class583.field8437 + var4, arg0, var5, (byte)-127, -16777216, class756.field10976);
         class296.field4151.method711(class582.field8424 + var3 + 3, -1, var4 + 14 + class583.field8437, 0, var5, class100.field1623.method961(class385.field5684, true));
         int var6 = class315.field4531.method1630(true) - -var3;
         int var7 = var4 + class315.field4531.method1632(-104);
         if (arg1 == 19154) {
            label105: {
               if (!class510.field7456) {
                  int var8 = 0;
                  class587 var9 = (class587)class685.field10080.method2579(arg1 + -19955);
                  if (var2 || var9 != null) {
                     do {
                        int var10 = (-var8 + -1 + class103.field1686) * 16 + class583.field8437 + var4 + 31;
                        ++var8;
                        class385.method2993(var10, var7, -1, arg0, class583.field8437 + var4, var6, -256, (byte)-41, class756.field10976, var9, class582.field8424 - -var3, class733.field10544);
                        var9 = (class587)class685.field10080.method2583(1);
                     } while(var9 != null);
                  }

                  if (!var2) {
                     break label105;
                  }
               }

               int var11 = 0;
               class59 var12 = (class59)class26.field398.method5680(false);
               if (var2 || var12 != null) {
                  do {
                     label73: {
                        int var13 = var11 * 16 + var4 + 31 + class583.field8437;
                        ++var11;
                        if (var12.field1133 != 1) {
                           class546.method4078(class756.field10976, arg0, -1, var7, var13, class582.field8424 + var3, var12, class733.field10544, var6, (byte)-45, class583.field8437 + var4, -256);
                           if (!var2) {
                              break label73;
                           }
                        }

                        class385.method2993(var13, var7, -1, arg0, class583.field8437 - -var4, var6, -256, (byte)-41, class756.field10976, (class587)var12.field1134.field11533.field4412, class582.field8424 + var3, class733.field10544);
                     }

                     var12 = (class59)class26.field398.method5676(-13612);
                  } while(var12 != null);
               }

               if (class636.field9268 != null) {
                  int var10000;
                  int var10001;
                  label60: {
                     class576.method4258(class401.field5898, class470.field6832, class82.field1380, arg0, var5, (byte)-127, -16777216, class640.field9329);
                     class296.field4151.method711(class401.field5898 + 3, -1, class82.field1380 - -14, 0, var5, class636.field9268.field1132);
                     int var14 = 0;
                     class587 var15 = (class587)class636.field9268.field1134.method5680(false);
                     if (var2) {
                        var10000 = var14 * 16 + 31;
                        var10001 = class82.field1380;
                     } else if (var15 == null) {
                        var10000 = arg1 + -19155;
                        var10001 = class401.field5898;
                        if (!var2) {
                           break label60;
                        }
                     } else {
                        var10000 = var14 * 16 + 31;
                        var10001 = class82.field1380;
                     }

                     while(true) {
                        int var16 = var10000 + var10001;
                        class385.method2993(var16, var7, -1, arg0, class82.field1380, var6, -256, (byte)-41, class640.field9329, var15, class401.field5898, class470.field6832);
                        ++var14;
                        var15 = (class587)class636.field9268.field1134.method5676(-13612);
                        if (var15 == null) {
                           var10000 = arg1 + -19155;
                           var10001 = class401.field5898;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = var14 * 16 + 31;
                           var10001 = class82.field1380;
                        }
                     }
                  }

                  class427.method3225(var10000, var10001, class470.field6832, class640.field9329, class82.field1380);
               }
            }

            class427.method3225(-1, class582.field8424 + var3, class733.field10544, class756.field10976, class583.field8437 + var4);
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field1045[19] + (arg0 != null ? field1045[1] : field1045[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "g",
      descriptor = "(I)Z"
   )
   public final boolean method601(int arg0) {
      try {
         ++field1031;
         if (arg0 != 0) {
            this.method595((byte)89);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1045[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "<init>",
      descriptor = "(Lha;Lnia;IIIIIZIIIIIII)V"
   )
   public class48(class65 arg0, class670 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field9747 == 1, class247.method2014(arg12, arg13, 6012));

      try {
         this.field1020 = new class621(arg0, arg1, arg12, arg13, super.field4090, arg3, this, arg7, arg14);
         this.field1036 = ~arg1.field9770 != -1 && !arg7;
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field1045[6] + (arg0 != null ? field1045[1] : field1045[2]) + ',' + (arg1 != null ? field1045[1] : field1045[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method602(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method603(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
