import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class210 extends class144 {
   @OriginalMember(
      owner = "client!oe",
      name = "lb",
      descriptor = "Z"
   )
   public boolean field3119 = false;
   @OriginalMember(
      owner = "client!oe",
      name = "S",
      descriptor = "Z"
   )
   private boolean field3121 = true;
   @OriginalMember(
      owner = "client!oe",
      name = "jb",
      descriptor = "I"
   )
   private int field3128 = 0;
   @OriginalMember(
      owner = "client!oe",
      name = "O",
      descriptor = "I"
   )
   private int field3126 = 0;
   @OriginalMember(
      owner = "client!oe",
      name = "N",
      descriptor = "I"
   )
   private int field3127 = 0;
   @OriginalMember(
      owner = "client!oe",
      name = "nb",
      descriptor = "I"
   )
   private int field3134 = 0;
   @OriginalMember(
      owner = "client!oe",
      name = "M",
      descriptor = "I"
   )
   private int field3135 = -1;
   @OriginalMember(
      owner = "client!oe",
      name = "ob",
      descriptor = "I"
   )
   private int field3143 = 0;
   @OriginalMember(
      owner = "client!oe",
      name = "Z",
      descriptor = "I"
   )
   private int field3139;
   @OriginalMember(
      owner = "client!oe",
      name = "V",
      descriptor = "I"
   )
   public int field3131;
   @OriginalMember(
      owner = "client!oe",
      name = "rb",
      descriptor = "Lkd;"
   )
   private class295 field3115;
   @OriginalMember(
      owner = "client!oe",
      name = "sb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3146 = new String[]{method1791(method1790("iC7Ew")), method1791(method1790("}\b7-\"")), method1791(method1790("iC7Pw")), method1791(method1790("hSuo")), method1791(method1790("iC7Lw")), method1791(method1790("iC7Fw")), method1791(method1790("iC7Dw")), method1791(method1790("iC7@w")), method1791(method1790("iC7Vw")), method1791(method1790("iC7Uw")), method1791(method1790("iC7Hw")), method1791(method1790("iC7Gw")), method1791(method1790("iC7Rw")), method1791(method1790("iC7Aw")), method1791(method1790("iC7Ow")), method1791(method1790("iC7Jw")), method1791(method1790("iC7e6hGuj%c\u000e")), method1791(method1790("iC7Bw")), method1791(method1790("iC7Iw")), method1791(method1790("iC7?6hOm=w")), method1791(method1790("iC7Kw"))};
   @OriginalMember(
      owner = "client!oe",
      name = "ib",
      descriptor = "Luw;"
   )
   public static class435 field3132 = new class435(29, 3);
   @OriginalMember(
      owner = "client!oe",
      name = "T",
      descriptor = "I"
   )
   public static int field3114;
   @OriginalMember(
      owner = "client!oe",
      name = "cb",
      descriptor = "I"
   )
   public static int field3116;
   @OriginalMember(
      owner = "client!oe",
      name = "gb",
      descriptor = "I"
   )
   public static int field3117;
   @OriginalMember(
      owner = "client!oe",
      name = "ab",
      descriptor = "I"
   )
   public static int field3118;
   @OriginalMember(
      owner = "client!oe",
      name = "bb",
      descriptor = "I"
   )
   public static int field3120;
   @OriginalMember(
      owner = "client!oe",
      name = "U",
      descriptor = "I"
   )
   public static int field3122;
   @OriginalMember(
      owner = "client!oe",
      name = "fb",
      descriptor = "I"
   )
   public static int field3123;
   @OriginalMember(
      owner = "client!oe",
      name = "qb",
      descriptor = "I"
   )
   public static int field3124;
   @OriginalMember(
      owner = "client!oe",
      name = "eb",
      descriptor = "I"
   )
   public static int field3125;
   @OriginalMember(
      owner = "client!oe",
      name = "Y",
      descriptor = "I"
   )
   public static int field3129;
   @OriginalMember(
      owner = "client!oe",
      name = "Q",
      descriptor = "I"
   )
   public static int field3130;
   @OriginalMember(
      owner = "client!oe",
      name = "hb",
      descriptor = "I"
   )
   public static int field3133;
   @OriginalMember(
      owner = "client!oe",
      name = "R",
      descriptor = "I"
   )
   public static int field3136;
   @OriginalMember(
      owner = "client!oe",
      name = "P",
      descriptor = "I"
   )
   public static int field3137;
   @OriginalMember(
      owner = "client!oe",
      name = "kb",
      descriptor = "I"
   )
   public static int field3140;
   @OriginalMember(
      owner = "client!oe",
      name = "db",
      descriptor = "I"
   )
   public static int field3141;
   @OriginalMember(
      owner = "client!oe",
      name = "W",
      descriptor = "I"
   )
   public static int field3142;
   @OriginalMember(
      owner = "client!oe",
      name = "pb",
      descriptor = "I"
   )
   public static int field3144;
   @OriginalMember(
      owner = "client!oe",
      name = "X",
      descriptor = "I"
   )
   public static int field3145;
   @OriginalMember(
      owner = "client!oe",
      name = "mb",
      descriptor = "Lpja;"
   )
   private class42 field3138;

   @OriginalMember(
      owner = "client!oe",
      name = "g",
      descriptor = "(I)Z",
      line = 4
   )
   public final boolean method601(int arg0) {
      try {
         if (arg0 != 0) {
            return true;
         } else {
            ++field3118;
            return false;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3146[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "c",
      descriptor = "(Lha;I)Lpca;",
      line = 16
   )
   public final class744 method586(class65 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            return null;
         } else {
            ++field3145;
            return null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3146[9] + (arg0 != null ? field3146[1] : field3146[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "d",
      descriptor = "(I)V",
      line = 29
   )
   public final void method594(int arg0) {
      try {
         ++field3124;
         if (arg0 != 255) {
            method1785(117);
         }

         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3146[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "e",
      descriptor = "(I)Z",
      line = 40
   )
   public final boolean method588(int arg0) {
      try {
         if (arg0 != 1) {
            this.method586((class65)null, -33);
         }

         ++field3120;
         return this.field3121;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3146[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(ILha;II)Lka;",
      line = 52
   )
   private final class495 method1784(int arg0, class65 arg1, int arg2, int arg3) {
      try {
         ++field3137;
         if (arg2 < 87) {
            this.method598(false, (class65)null);
         }

         class745 var5 = class760.field11030.method3423(arg0, (byte)-121);
         class293 var6 = class530.field7721[super.field4090];
         class293 var7 = super.field4091 < 3 ? class530.field7721[super.field4091 + 1] : null;
         return !this.field3119 ? var5.method5403(true, this.field3135, var7, arg3, super.field4096, super.field4097, this.field3143, arg1, this.field3126, var6, (byte)-85, super.field4101, class588.field8496) : var5.method5403(true, -1, var7, arg3, super.field4096, super.field4097, -1, arg1, 0, var6, (byte)-85, super.field4101, class588.field8496);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3146[18] + arg0 + ',' + (arg1 != null ? field3146[1] : field3146[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(I)V",
      line = 70
   )
   public static final void method1785(int arg0) {
      try {
         class23.field355.method1591((byte)58);
         if (arg0 != 0) {
            method1785(-56);
         }

         ++field3125;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3146[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "c",
      descriptor = "(I)I",
      line = 83
   )
   public final int method589(int arg0) {
      try {
         ++field3130;
         if (arg0 != 19053) {
            this.field3119 = true;
         }

         return this.field3127;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3146[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "<init>",
      descriptor = "(IIIIIIIIIIIII)V",
      line = 288
   )
   public class210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte)0);

      try {
         label21: {
            this.field3139 = arg0;
            this.field3131 = arg1 + arg2;
            this.field3128 = arg12;
            class745 var14 = class760.field11030.method3423(this.field3139, (byte)-44);
            int var15 = var14.field10740;
            if (var15 == -1) {
               this.field3119 = true;
               if (!client.field4564) {
                  break label21;
               }
            }

            this.field3115 = class588.field8496.method3781(5, var15);
            this.field3119 = false;
         }

         if (this.field3131 == arg2) {
            class720.method5205(0, this, this.field3143, this.field3115);
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field3146[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(B)V",
      line = 105
   )
   public static void method1786(byte arg0) {
      try {
         field3132 = null;
         if (arg0 > -69) {
            method1786((byte)-51);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3146[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "finalize",
      descriptor = "()V",
      line = 116
   )
   protected final void finalize() {
      try {
         ++field3140;
         if (this.field3138 != null) {
            this.field3138.method499();
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3146[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(ZLha;)V",
      line = 129
   )
   public final void method598(boolean arg0, class65 arg1) {
      try {
         ++field3129;
         if (!arg0) {
            this.field3128 = -59;
         }

         class495 var3 = this.method1784(this.field3139, arg1, 100, 0);
         if (var3 != null) {
            class173 var4 = arg1.method255();
            var4.method1008(super.field4101, super.field4097, super.field4096);
            this.method1789(3, var3, var4, arg1);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3146[14] + arg0 + ',' + (arg1 != null ? field3146[1] : field3146[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "b",
      descriptor = "(B)V",
      line = 149
   )
   public final void method1787(byte arg0) {
      try {
         ++field3116;
         if (arg0 != -67) {
            this.field3135 = 6;
         }

         if (this.field3138 != null) {
            this.field3138.method499();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3146[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(IZLvca;Lha;III)V",
      line = 166
   )
   public final void method579(int arg0, boolean arg1, class294 arg2, class65 arg3, int arg4, int arg5, int arg6) {
      try {
         ++field3114;
         if (arg5 != 0) {
            this.field3128 = -25;
         }

         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3146[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3146[1] : field3146[3]) + ',' + (arg3 != null ? field3146[1] : field3146[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(ILha;)Lbv;",
      line = 180
   )
   public final class321 method599(int arg0, class65 arg1) {
      boolean var3 = client.field4564;

      try {
         ++field3142;
         class495 var4 = this.method1784(this.field3139, arg1, 126, (this.field3128 == 0 ? 0 : 5) | 2048);
         if (arg0 != 50) {
            return null;
         } else if (var4 == null) {
            return null;
         } else {
            if (~this.field3128 != -1) {
               var4.method513(this.field3128 * 2048);
            }

            class321 var6;
            label47: {
               class173 var5 = arg1.method255();
               var5.method1008(super.field4101, super.field4097, super.field4096);
               this.method1789(3, var4, var5, arg1);
               var6 = class625.method4582(1, 0, false);
               if (!class679.field9962) {
                  var4.method503(var5, var6.field4630[0], 0);
                  if (!var3) {
                     break label47;
                  }
               }

               var4.method552(var5, var6.field4630[0], class75.field1316, 0);
            }

            if (this.field3138 != null) {
               label41: {
                  class713 var7 = this.field3138.method493();
                  if (class679.field9962) {
                     arg1.method406(var7, class75.field1316);
                     if (!var3) {
                        break label41;
                     }
                  }

                  arg1.method256(var7);
               }
            }

            this.field3121 = var4.method516();
            this.field3127 = var4.method540();
            this.field3134 = var4.method548();
            return var6;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3146[2] + arg0 + ',' + (arg1 != null ? field3146[1] : field3146[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(BI)V",
      line = 226
   )
   public final void method1788(byte arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field3136;
         if (!this.field3119) {
            label49: {
               this.field3126 += arg1;
               if (var3) {
                  this.field3126 -= this.field3115.field4128[this.field3143];
                  ++this.field3143;
               } else {
                  if (~this.field3126 >= ~this.field3115.field4128[this.field3143]) {
                     break label49;
                  }

                  this.field3126 -= this.field3115.field4128[this.field3143];
                  ++this.field3143;
               }

               label48:
               while(true) {
                  while(this.field3143 >= this.field3115.field4136.length) {
                     this.field3119 = true;
                     if (!var3) {
                        if (!var3) {
                           break label48;
                        }
                        break;
                     }
                  }

                  if (~this.field3126 >= ~this.field3115.field4128[this.field3143]) {
                     break;
                  }

                  this.field3126 -= this.field3115.field4128[this.field3143];
                  ++this.field3143;
               }
            }

            if (arg0 == 45) {
               if (!this.field3119) {
                  class720.method5205(0, this, this.field3143, this.field3115);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3146[20] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(IIILha;)Z",
      line = 257
   )
   public final boolean method582(int arg0, int arg1, int arg2, class65 arg3) {
      try {
         ++field3122;
         int var5 = -103 % ((-53 - arg2) / 63);
         return false;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3146[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3146[1] : field3146[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "f",
      descriptor = "(B)I",
      line = 271
   )
   public final int method590(byte arg0) {
      try {
         ++field3144;
         if (arg0 != -79) {
            this.field3119 = false;
         }

         return this.field3134;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3146[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(ILka;Ldfa;Lha;)V",
      line = 322
   )
   private final void method1789(int arg0, class495 arg1, class173 arg2, class65 arg3) {
      try {
         arg1.method554(arg2);
         ++field3123;
         class309[] var5 = arg1.method515();
         class740[] var6 = arg1.method539();
         if ((this.field3138 == null || this.field3138.field964) && (var5 != null || var6 != null)) {
            this.field3138 = class42.method492(class29.field458, true);
         }

         if (arg0 != 3) {
            method1786((byte)62);
         }

         if (this.field3138 != null) {
            this.field3138.method491(arg3, (long)class29.field458, var5, var6, false);
            this.field3138.method501(super.field4090, super.field2354, super.field2356, super.field2347, super.field2348);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3146[5] + arg0 + ',' + (arg1 != null ? field3146[1] : field3146[3]) + ',' + (arg2 != null ? field3146[1] : field3146[3]) + ',' + (arg3 != null ? field3146[1] : field3146[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "e",
      descriptor = "(B)Z",
      line = 346
   )
   public final boolean method593(byte arg0) {
      try {
         ++field3141;
         if (arg0 != -94) {
            this.field3135 = -19;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3146[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1790(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1791(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
