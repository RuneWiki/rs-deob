import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class561 extends class70 {
   @OriginalMember(
      owner = "client!hb",
      name = "N",
      descriptor = "I"
   )
   private int field8207 = 0;
   @OriginalMember(
      owner = "client!hb",
      name = "ab",
      descriptor = "I"
   )
   private int field8208 = 20;
   @OriginalMember(
      owner = "client!hb",
      name = "S",
      descriptor = "I"
   )
   private int field8212 = 0;
   @OriginalMember(
      owner = "client!hb",
      name = "O",
      descriptor = "I"
   )
   private int field8215 = 1365;
   @OriginalMember(
      owner = "client!hb",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8232 = new String[]{method4226(method4225("H\u0002\u001e>&")), method4226(method4225("H\u0002\u001e9&")), method4226(method4225("H\u0002\u001e1&")), method4226(method4225("T\u0002B\u0013hR\u0005C\u001e")), method4226(method4225("H\u0002\u001e3&")), method4226(method4225("H\u0002\u001e2&")), method4226(method4225("H\u0002\u001e5&")), method4226(method4225("N\u0015\\\u001a")), method4226(method4225("[N\u001eXs"))};
   @OriginalMember(
      owner = "client!hb",
      name = "J",
      descriptor = "I"
   )
   public static int field8209 = -1;
   @OriginalMember(
      owner = "client!hb",
      name = "V",
      descriptor = "Luha;"
   )
   public static class5 field8216 = new class5(14, 0);
   @OriginalMember(
      owner = "client!hb",
      name = "Z",
      descriptor = "Luha;"
   )
   public static class5 field8217 = new class5(15, 4);
   @OriginalMember(
      owner = "client!hb",
      name = "bb",
      descriptor = "Luha;"
   )
   public static class5 field8219 = new class5(16, -2);
   @OriginalMember(
      owner = "client!hb",
      name = "M",
      descriptor = "Luha;"
   )
   public static class5 field8220 = new class5(17, 0);
   @OriginalMember(
      owner = "client!hb",
      name = "cb",
      descriptor = "Luha;"
   )
   public static class5 field8221 = new class5(19, -2);
   @OriginalMember(
      owner = "client!hb",
      name = "W",
      descriptor = "Luha;"
   )
   public static class5 field8222 = new class5(22, -2);
   @OriginalMember(
      owner = "client!hb",
      name = "I",
      descriptor = "Luha;"
   )
   public static class5 field8223 = new class5(23, 4);
   @OriginalMember(
      owner = "client!hb",
      name = "K",
      descriptor = "Luha;"
   )
   public static class5 field8224 = new class5(24, -1);
   @OriginalMember(
      owner = "client!hb",
      name = "db",
      descriptor = "Luha;"
   )
   public static class5 field8225 = new class5(26, 0);
   @OriginalMember(
      owner = "client!hb",
      name = "Y",
      descriptor = "Luha;"
   )
   public static class5 field8226 = new class5(27, 0);
   @OriginalMember(
      owner = "client!hb",
      name = "L",
      descriptor = "Luha;"
   )
   public static class5 field8227 = new class5(28, -2);
   @OriginalMember(
      owner = "client!hb",
      name = "fb",
      descriptor = "Luha;"
   )
   public static class5 field8228 = new class5(29, -2);
   @OriginalMember(
      owner = "client!hb",
      name = "T",
      descriptor = "Luha;"
   )
   public static class5 field8229 = new class5(30, -2);
   @OriginalMember(
      owner = "client!hb",
      name = "X",
      descriptor = "[Luha;"
   )
   private static class5[] field8230 = new class5[32];
   @OriginalMember(
      owner = "client!hb",
      name = "Q",
      descriptor = "Laka;"
   )
   public static class418 field8231;
   @OriginalMember(
      owner = "client!hb",
      name = "gb",
      descriptor = "I"
   )
   public static int field8210;
   @OriginalMember(
      owner = "client!hb",
      name = "eb",
      descriptor = "I"
   )
   public static int field8211;
   @OriginalMember(
      owner = "client!hb",
      name = "hb",
      descriptor = "I"
   )
   public static int field8213;
   @OriginalMember(
      owner = "client!hb",
      name = "P",
      descriptor = "I"
   )
   public static int field8214;
   @OriginalMember(
      owner = "client!hb",
      name = "U",
      descriptor = "I"
   )
   public static int field8218;

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field8218;
         if (arg0 != -63) {
            method4222(-51, 85);
         }

         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int var5 = 0;
            int var10000;
            int var10001;
            if (var3 || var5 < class262.field3328) {
               label67:
               do {
                  do {
                     int var14;
                     label63: {
                        int var6 = (class17.field290[var5] << 12) / this.field8215 + this.field8212;
                        int var7 = (class502.field6979[arg1] << 12) / this.field8215 + this.field8207;
                        int var8 = var6;
                        int var9 = var7;
                        int var10 = var6;
                        int var11 = var7;
                        int var12 = var6 * var6 >> 12;
                        int var13 = var7 * var7 >> 12;
                        var14 = 0;
                        if (!var3) {
                           if (~(var12 + var13) <= -16385) {
                              break label63;
                           }

                           var10000 = var14;
                           var10001 = this.field8208;
                           if (var3) {
                              continue label67;
                           }

                           if (var14 >= var10001) {
                              break label63;
                           }
                        }

                        do {
                           var11 = (var10 * var11 >> 12) * 2 - -var9;
                           var10 = -var13 + var8 + var12;
                           ++var14;
                           var13 = var11 * var11 >> 12;
                           var12 = var10 * var10 >> 12;
                           if (~(var12 + var13) <= -16385) {
                              break;
                           }

                           var10000 = var14;
                           var10001 = this.field8208;
                           if (var3) {
                              continue label67;
                           }
                        } while(var14 < var10001);
                     }

                     var4[var5] = ~(this.field8208 + -1) < ~var14 ? (var14 << 12) / this.field8208 : 0;
                     ++var5;
                  } while(var5 < class262.field3328);

                  return var4;
               } while(var10000 < var10001);
            }
         }

         return var4;
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field8232[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "<init>",
      descriptor = "()V"
   )
   public class561() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!hb",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method4221(int arg0) {
      try {
         field8225 = null;
         field8219 = null;
         field8227 = null;
         field8222 = null;
         field8220 = null;
         if (arg0 >= 98) {
            field8217 = null;
            field8230 = null;
            field8226 = null;
            field8221 = null;
            field8223 = null;
            field8231 = null;
            field8216 = null;
            field8228 = null;
            field8224 = null;
            field8229 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8232[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method4222(int arg0, int arg1) {
      try {
         ++field8213;
         int var2 = -77 / ((arg1 - 71) / 38);
         if (~arg0 != -6408 && arg0 != 34843 && ~arg0 != -34838) {
            if (~arg0 != -6409 && ~arg0 != -34843 && ~arg0 != -34837) {
               if (arg0 != 6406 && arg0 != 34844) {
                  if (~arg0 != -6410 && ~arg0 != -34847) {
                     if (~arg0 != -6411 && ~arg0 != -34848) {
                        if (arg0 == 6402) {
                           return 6402;
                        } else {
                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 6410;
                     }
                  } else {
                     return 6409;
                  }
               } else {
                  return 6406;
               }
            } else {
               return 6408;
            }
         } else {
            return 6407;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8232[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label55: {
            label54: {
               label53: {
                  label52: {
                     if (~arg2 != -1) {
                        if (arg2 == 1) {
                           break label52;
                        }

                        if (~arg2 == -3) {
                           break label53;
                        }

                        if (arg2 != 3) {
                           break label55;
                        }

                        if (!var4) {
                           break label54;
                        }
                     }

                     this.field8215 = arg1.method603(-2);
                     if (!var4) {
                        break label55;
                     }
                  }

                  this.field8208 = arg1.method603(-2);
                  if (!var4) {
                     break label55;
                  }
               }

               this.field8212 = arg1.method603(-2);
               if (!var4) {
                  break label55;
               }
            }

            this.field8207 = arg1.method603(-2);
         }

         if (arg0 > -34) {
            this.field8215 = -45;
         }

         ++field8211;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8232[6] + arg0 + ',' + (arg1 != null ? field8232[8] : field8232[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method4223(boolean arg0) {
      try {
         if (!arg0) {
            ++field8210;
            if (class585.field8634 != class583.field8611) {
               try {
                  class537.method4076(field8232[3], class107.field1426, arg0);
               } catch (Throwable var2) {
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8232[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hb",
      name = "d",
      descriptor = "(III)Z"
   )
   public static final boolean method4224(int arg0, int arg1, int arg2) {
      try {
         ++field8214;
         if (arg1 != 33) {
            return true;
         } else {
            return (arg0 & 33) != 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8232[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   static {
      class5[] var0 = class161.method1346((byte)-124);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         field8230[var0[var1].field69] = var0[var1];
      }

      field8231 = new class418(64, 3);
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4225(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4226(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
