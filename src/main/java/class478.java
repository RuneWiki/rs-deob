import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class478 {
   @OriginalMember(
      owner = "client!uda",
      name = "l",
      descriptor = "Lsga;"
   )
   public class76 field6868 = new class76();
   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6881 = new String[]{method3493(method3492("\u0015<6!hH")), method3493(method3492("\u0015<6!eH")), method3493(method3492("\u000e-;c")), method3493(method3492("\u001bvy!_")), method3493(method3492("\u0015<6!aH")), method3493(method3492("\u0015<6!\u001e\t6>{\u001cH")), method3493(method3492("\u0015<6!dH")), method3493(method3492("\u0015<6!kH")), method3493(method3492("\u0015<6!gH")), method3493(method3492("\u0015<6!`H")), method3493(method3492("\u0015<6!cH")), method3493(method3492("\u0015<6!fH")), method3493(method3492("\u0015<6!jH"))};
   @OriginalMember(
      owner = "client!uda",
      name = "f",
      descriptor = "I"
   )
   public static int field6866 = -1;
   @OriginalMember(
      owner = "client!uda",
      name = "c",
      descriptor = "I"
   )
   public static int field6867;
   @OriginalMember(
      owner = "client!uda",
      name = "d",
      descriptor = "I"
   )
   public static int field6869;
   @OriginalMember(
      owner = "client!uda",
      name = "i",
      descriptor = "I"
   )
   public static int field6870;
   @OriginalMember(
      owner = "client!uda",
      name = "b",
      descriptor = "I"
   )
   public static int field6871;
   @OriginalMember(
      owner = "client!uda",
      name = "k",
      descriptor = "I"
   )
   public static int field6873;
   @OriginalMember(
      owner = "client!uda",
      name = "m",
      descriptor = "I"
   )
   public static int field6876;
   @OriginalMember(
      owner = "client!uda",
      name = "e",
      descriptor = "I"
   )
   public static int field6877;
   @OriginalMember(
      owner = "client!uda",
      name = "j",
      descriptor = "I"
   )
   public static int field6878;
   @OriginalMember(
      owner = "client!uda",
      name = "o",
      descriptor = "I"
   )
   public static int field6879;
   @OriginalMember(
      owner = "client!uda",
      name = "g",
      descriptor = "I"
   )
   public static int field6880;
   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "Leia;"
   )
   public static class255 field6875;
   @OriginalMember(
      owner = "client!uda",
      name = "n",
      descriptor = "Lsga;"
   )
   private class76 field6874;
   @OriginalMember(
      owner = "client!uda",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field6872;

   @OriginalMember(
      owner = "client!uda",
      name = "f",
      descriptor = "(I)V",
      line = 4
   )
   public static final void method3482(int arg0) {
      boolean var1 = client.field4360;

      RuntimeException var10000;
      label86: {
         boolean var10001;
         class294 var2;
         try {
            int var8;
            label66: {
               ++field6869;
               var2 = (class294)class402.field5818.method2933(2);
               if (var1) {
                  var8 = var2.field4060;
               } else if (var2 == null) {
                  var2 = (class294)class761.field11242.method2933(2);
                  var8 = arg0;
                  if (!var1) {
                     break label66;
                  }
               } else {
                  var8 = var2.field4060;
               }

               while(true) {
                  if (var8 == 0) {
                     var2.field4054 = true;
                     if (var2.field4051 >= 0 && var2.field4056 >= 0 && ~var2.field4051 > ~class644.field9403 && ~class337.field4594 < ~var2.field4056) {
                        class183.method1455(var2, (byte)57);
                        if (var1) {
                           var2.method3165(116);
                        }
                     }
                  } else {
                     var2.method3165(116);
                  }

                  var2 = (class294)class402.field5818.method2940(false);
                  if (var2 == null) {
                     var2 = (class294)class761.field11242.method2933(2);
                     var8 = arg0;
                     if (!var1) {
                        break;
                     }
                  } else {
                     var8 = var2.field4060;
                  }
               }
            }

            if (var8 != 0) {
               return;
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label86;
         }

         while(true) {
            label81: {
               label80: {
                  try {
                     if (var2 != null) {
                        if (!var2.field4060) {
                           var2.field4054 = true;
                           if (!var1) {
                              break label81;
                           }
                        }
                        break label80;
                     }
                  } catch (RuntimeException var6) {
                     var10000 = var6;
                     var10001 = false;
                     break;
                  }

                  if (!var1) {
                     return;
                  }
               }

               try {
                  var2.method3165(arg0 ^ 117);
               } catch (RuntimeException var5) {
                  var10000 = var5;
                  var10001 = false;
                  break;
               }
            }

            try {
               var2 = (class294)class761.field11242.method2940(false);
            } catch (RuntimeException var4) {
               var10000 = var4;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var3 = var10000;
      throw class237.method1823(var3, field6881[10] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(I)V",
      line = 45
   )
   public static void method3483(int arg0) {
      try {
         field6875 = null;
         field6872 = null;
         if (arg0 < 15) {
            field6872 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6881[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "e",
      descriptor = "(I)Lsga;",
      line = 60
   )
   public final class76 method3484(int arg0) {
      try {
         ++field6876;
         class76 var2 = this.field6874;
         if (this.field6868 == var2) {
            this.field6874 = null;
            return null;
         } else {
            if (arg0 != 0) {
               field6875 = null;
            }

            this.field6874 = var2.field950;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6881[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(ILdha;ILgn;)V",
      line = 80
   )
   public static final void method3485(int arg0, class85 arg1, int arg2, class731 arg3) {
      try {
         ++field6871;
         if (class673.field9755 < 50) {
            if (arg1 != null && arg1.field1116 != null && ~arg1.field1116.length < ~arg0 && arg1.field1116[arg0] != null) {
               int var4 = arg1.field1116[arg0][0];
               int var5 = var4 >> 8;
               int var6 = var4 >> 5 & 7;
               if (arg1.field1116[arg0].length > 1) {
                  int var7 = (int)((double)arg1.field1116[arg0].length * Math.random());
                  if (var7 > 0) {
                     var5 = arg1.field1116[arg0][var7];
                  }
               }

               int var8 = 31 & var4;
               int var9 = 256;
               if (arg1.field1099 != null && arg1.field1126 != null) {
                  var9 = (int)(Math.random() * (double)(arg1.field1126[arg0] + -arg1.field1099[arg0])) - -arg1.field1099[arg0];
               }

               int var10 = arg1.field1110 == null ? 255 : arg1.field1110[arg0];
               if (~var8 == -1) {
                  if (class564.field8045 == arg3) {
                     if (!arg1.field1124) {
                        class43.method365(var5, 0, (byte)-10, var10, var9, var6);
                        return;
                     }

                     class241.method1843((byte)85, 0, var9, var6, var10, var5, false);
                  }

               } else if (class300.field4107.field6438.method4286(arg2 ^ -734475359) != 0) {
                  if (arg2 == 734475305) {
                     int var11 = arg3.field10694 + -256 >> 9;
                     int var12 = arg3.field10693 - 256 >> 9;
                     int var13 = class564.field8045 != arg3 ? (var11 << 16) - -(var12 << 8) + (arg3.field10701 << 24) + var8 : 0;
                     class534.field7614[class673.field9755++] = new class245((byte)(!arg1.field1124 ? 1 : 2), var5, var6, 0, var10, var13, var9, arg3);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field6881[1] + arg0 + ',' + (arg1 != null ? field6881[3] : field6881[2]) + ',' + arg2 + ',' + (arg3 != null ? field6881[3] : field6881[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(Lsga;I)V",
      line = 154
   )
   public final void method3486(class76 arg0, int arg1) {
      try {
         ++field6878;
         if (arg1 != 1779380172) {
            field6866 = 100;
         }

         if (arg0.field946 != null) {
            arg0.method693((byte)-95);
         }

         arg0.field946 = this.field6868.field946;
         arg0.field950 = this.field6868;
         arg0.field946.field950 = arg0;
         arg0.field950.field946 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6881[8] + (arg0 != null ? field6881[3] : field6881[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "d",
      descriptor = "(I)Lsga;",
      line = 174
   )
   public final class76 method3487(int arg0) {
      try {
         int var2 = -124 / ((54 - arg0) / 38);
         ++field6880;
         class76 var3 = this.field6868.field950;
         if (this.field6868 == var3) {
            return null;
         } else {
            var3.method693((byte)-16);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6881[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(B)Lsga;",
      line = 192
   )
   public final class76 method3488(byte arg0) {
      try {
         ++field6873;
         class76 var2 = this.field6868.field950;
         if (this.field6868 == var2) {
            this.field6874 = null;
            return null;
         } else {
            if (arg0 >= -112) {
               method3489(-117, -108);
            }

            this.field6874 = var2.field950;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6881[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "a",
      descriptor = "(II)I",
      line = 212
   )
   public static final int method3489(int arg0, int arg1) {
      try {
         ++field6867;
         int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
         if (arg1 != 4123) {
            method3483(27);
         }

         int var3 = arg0 * 6 + -61440;
         int var4 = (arg0 * var3 >> 12) + 40960;
         return var2 * var4 >> 12;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6881[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "<init>",
      descriptor = "()V",
      line = 237
   )
   public class478() {
      try {
         this.field6868.field950 = this.field6868;
         this.field6868.field946 = this.field6868;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6881[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "b",
      descriptor = "(I)V",
      line = 253
   )
   public final void method3490(int arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0 != -1413238680) {
            this.method3484(16);
         }

         while(true) {
            class76 var3 = this.field6868.field950;
            if (this.field6868 != var3) {
               var3.method693((byte)-111);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            ++field6877;
            this.field6874 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6881[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "c",
      descriptor = "(I)I",
      line = 278
   )
   public final int method3491(int arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0 != 256) {
            return -94;
         } else {
            ++field6870;
            int var3 = 0;
            class76 var4 = this.field6868.field950;
            if (var2) {
               ++var3;
               var4 = var4.field950;
            }

            while(true) {
               if (this.field6868 == var4) {
                  if (!var2) {
                     return var3;
                  }
               } else {
                  ++var3;
               }

               var4 = var4.field950;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6881[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3492(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3493(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
