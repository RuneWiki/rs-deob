import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class781 extends class188 {
   @OriginalMember(
      owner = "client!oc",
      name = "u",
      descriptor = "Lsn;"
   )
   private class675 field11454 = new class675();
   @OriginalMember(
      owner = "client!oc",
      name = "K",
      descriptor = "I"
   )
   private int field11460 = 256;
   @OriginalMember(
      owner = "client!oc",
      name = "r",
      descriptor = "I"
   )
   private int field11461 = 256;
   @OriginalMember(
      owner = "client!oc",
      name = "J",
      descriptor = "I"
   )
   private int field11463 = 0;
   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "I"
   )
   private int field11455;
   @OriginalMember(
      owner = "client!oc",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11465 = new String[]{method5685(method5684("+EX\u0017\u001c")), method5685(method5684("+EX\u001c\u001c")), method5685(method5684("+EX\u0017ul")), method5685(method5684("+EX\u0019\u001c")), method5685(method5684("+EX\u001b\u001c")), method5685(method5684("+EXd]*O\u0002f\u001c")), method5685(method5684("+EX\u0014\u001c")), method5685(method5684("+EX\u0010\u001c")), method5685(method5684("?\bXvI")), method5685(method5684("+EX\u001e\u001c")), method5685(method5684("*S\u001a4")), method5685(method5684("+EX\u0011\u001c")), method5685(method5684("+EX\u0012\u001c")), method5685(method5684("+EX\u001d\u001c")), method5685(method5684("+EX\u001cul")), method5685(method5684("+EX\u001f\u001c")), method5685(method5684("+EX\u0013\u001c")), method5685(method5684("+EX\rul")), method5685(method5684("+EX\u001a\u001c"))};
   @OriginalMember(
      owner = "client!oc",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field11445 = new int[16];
   @OriginalMember(
      owner = "client!oc",
      name = "t",
      descriptor = "I"
   )
   public static int field11440;
   @OriginalMember(
      owner = "client!oc",
      name = "A",
      descriptor = "I"
   )
   public static int field11441;
   @OriginalMember(
      owner = "client!oc",
      name = "O",
      descriptor = "I"
   )
   public static int field11442;
   @OriginalMember(
      owner = "client!oc",
      name = "B",
      descriptor = "I"
   )
   public static int field11443;
   @OriginalMember(
      owner = "client!oc",
      name = "w",
      descriptor = "I"
   )
   public static int field11444;
   @OriginalMember(
      owner = "client!oc",
      name = "H",
      descriptor = "I"
   )
   public static int field11446;
   @OriginalMember(
      owner = "client!oc",
      name = "G",
      descriptor = "I"
   )
   public static int field11447;
   @OriginalMember(
      owner = "client!oc",
      name = "N",
      descriptor = "I"
   )
   public static int field11448;
   @OriginalMember(
      owner = "client!oc",
      name = "M",
      descriptor = "I"
   )
   public static int field11449;
   @OriginalMember(
      owner = "client!oc",
      name = "s",
      descriptor = "I"
   )
   public static int field11450;
   @OriginalMember(
      owner = "client!oc",
      name = "C",
      descriptor = "I"
   )
   public static int field11451;
   @OriginalMember(
      owner = "client!oc",
      name = "F",
      descriptor = "I"
   )
   public static int field11452;
   @OriginalMember(
      owner = "client!oc",
      name = "x",
      descriptor = "I"
   )
   public static int field11453;
   @OriginalMember(
      owner = "client!oc",
      name = "D",
      descriptor = "I"
   )
   public static int field11456;
   @OriginalMember(
      owner = "client!oc",
      name = "L",
      descriptor = "I"
   )
   public static int field11458;
   @OriginalMember(
      owner = "client!oc",
      name = "v",
      descriptor = "I"
   )
   private int field11459;
   @OriginalMember(
      owner = "client!oc",
      name = "I",
      descriptor = "I"
   )
   public static int field11464;
   @OriginalMember(
      owner = "client!oc",
      name = "q",
      descriptor = "Z"
   )
   private boolean field11457;
   @OriginalMember(
      owner = "client!oc",
      name = "y",
      descriptor = "Z"
   )
   private boolean field11462;

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(B)Lpq;"
   )
   private final synchronized class664 method5673(byte arg0) {
      try {
         if (arg0 != -84) {
            this.method5673((byte)-103);
         }

         ++field11440;
         return (class664)this.field11454.method4972((byte)-84);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11465[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "c",
      descriptor = "(I)V"
   )
   private final synchronized void method5674(int arg0) {
      try {
         ++field11444;
         class664 var2 = this.method5673((byte)-84);
         if (var2 != null) {
            var2.method2477(1976);
            if (arg0 != -12914) {
               this.field11463 = -7;
            }

            --this.field11463;
            this.field11459 = 0;
            class737.field10961.method3183(var2.method4909((byte)-77), var2, (byte)95);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11465[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5675(int arg0) {
      try {
         field11445 = null;
         if (arg0 != 0) {
            method5675(99);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11465[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "([III)V"
   )
   public final synchronized void method391(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         ++field11449;
         if (!this.field11457) {
            if (this.method5673((byte)-84) == null) {
               if (this.field11462) {
                  this.method2477(1976);
                  class737.field10961.method3186(false);
               }

            } else {
               int var5 = arg1 + arg2;
               if (class262.field4308) {
                  var5 <<= 1;
               }

               byte var6 = 0;
               byte var7 = 0;
               class664 var8;
               if (this.field11455 == 2) {
                  var7 = 1;
                  if (var4) {
                     var8 = this.method5673((byte)-84);
                     if (var8 == null) {
                        return;
                     }
                  } else {
                     if (~arg1 <= ~var5) {
                        return;
                     }

                     var8 = this.method5673((byte)-84);
                     if (var8 == null) {
                        return;
                     }
                  }
               } else {
                  if (~arg1 <= ~var5) {
                     return;
                  }

                  var8 = this.method5673((byte)-84);
                  if (var8 == null) {
                     return;
                  }
               }

               label145:
               do {
                  do {
                     int var10000;
                     int var10001;
                     label136: {
                        short[][] var9 = var8.field9942;
                        if (!var4) {
                           if (var5 <= arg1) {
                              var10000 = ~var9[0].length;
                              var10001 = ~this.field11459;
                              break label136;
                           }

                           var10000 = var9[0].length;
                           var10001 = this.field11459;
                           if (var4) {
                              break label136;
                           }

                           if (var10000 <= var10001) {
                              var10000 = ~var9[0].length;
                              var10001 = ~this.field11459;
                              break label136;
                           }
                        }

                        while(true) {
                           if (!class262.field4308) {
                              var10001 = arg1++;
                              arg0[var10001] += var9[var6][this.field11459] * this.field11461 + var9[var7][this.field11459] * this.field11460;
                              if (var4) {
                                 arg0[arg1++] = var9[var6][this.field11459] * this.field11461;
                                 arg0[arg1++] = var9[var7][this.field11459] * this.field11460;
                                 ++this.field11459;
                              } else {
                                 ++this.field11459;
                              }
                           } else {
                              arg0[arg1++] = var9[var6][this.field11459] * this.field11461;
                              arg0[arg1++] = var9[var7][this.field11459] * this.field11460;
                              ++this.field11459;
                           }

                           if (var5 <= arg1) {
                              var10000 = ~var9[0].length;
                              var10001 = ~this.field11459;
                              break;
                           }

                           var10000 = var9[0].length;
                           var10001 = this.field11459;
                           if (var4) {
                              break;
                           }

                           if (var10000 <= var10001) {
                              var10000 = ~var9[0].length;
                              var10001 = ~this.field11459;
                              break;
                           }
                        }
                     }

                     if (var10000 >= var10001) {
                        if (var4) {
                           var8 = this.method5673((byte)-12914);
                           continue label145;
                        }

                        this.method5674(-12914);
                     }

                     if (~arg1 <= ~var5) {
                        return;
                     }

                     var8 = this.method5673((byte)-84);
                  } while(var8 != null);

                  return;
               } while(var8 != null);

            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field11465[9] + (arg0 != null ? field11465[8] : field11465[10]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "()Lbn;"
   )
   public final class188 method394() {
      try {
         ++field11464;
         return null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11465[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method5676(byte arg0, int arg1) {
      try {
         this.field11461 = arg1;
         this.field11460 = arg1;
         if (arg0 != 46) {
            this.method5680((class664)null, true);
         }

         ++field11447;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11465[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "h",
      descriptor = "(I)D"
   )
   public final synchronized double method5677(int arg0) {
      try {
         ++field11446;
         int var2 = -83 % ((arg0 - -75) / 34);
         if (~this.field11463 > -2) {
            return -1.0D;
         } else {
            class664 var3 = (class664)this.field11454.method4972((byte)-84);
            return var3 == null ? -1.0D : (double)(-((float)var3.field9942[0].length / (float)class752.field11155)) + var3.field9943;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11465[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "i",
      descriptor = "(I)V"
   )
   public final synchronized void method5678(int arg0) {
      try {
         ++field11441;
         this.field11462 = true;
         if (arg0 >= -33) {
            this.field11461 = 33;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11465[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(ZIZ)V"
   )
   public static final void method5679(boolean arg0, int arg1, boolean arg2) {
      try {
         if (!arg0) {
            ++field11448;
            if (!arg2) {
               class469.method3645(class212.field3204, arg1, -1);
            } else {
               class577 var3 = class218.method1888(class337.field5164, 105, class510.field7801.field361);
               var3.field8531.method2873(arg1, (byte)-34);
               class510.field7801.method211(var3, 119);
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11465[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(Lpq;Z)V"
   )
   public final synchronized void method5680(class664 arg0, boolean arg1) {
      boolean var3 = client.field1786;

      try {
         if (var3) {
            this.field11454.method4974(102);
            --this.field11463;
         }

         while(true) {
            if (this.field11463 < 100) {
               ++field11451;
               if (!var3) {
                  if (arg1) {
                     return;
                  }

                  this.field11454.method4980(arg0, 0);
                  ++this.field11463;
                  return;
               }
            } else {
               this.field11454.method4974(102);
            }

            --this.field11463;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11465[18] + (arg0 != null ? field11465[8] : field11465[10]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "c",
      descriptor = "()I"
   )
   public final int method372() {
      try {
         ++field11442;
         return 1;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11465[17] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "b",
      descriptor = "()Lbn;"
   )
   public final class188 method375() {
      try {
         ++field11443;
         return null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11465[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final synchronized void method5681(boolean arg0, int arg1) {
      try {
         if (arg1 != 16) {
            this.method372();
         }

         this.field11457 = arg0;
         ++field11453;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11465[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method383(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field11456;
         if (!this.field11457) {
            while(true) {
               class664 var3 = this.method5673((byte)-84);
               int var10000;
               if (var3 == null) {
                  var10000 = this.field11462;
                  if (!var2) {
                     if (var10000 != 0) {
                        this.method2477(1976);
                        class737.field10961.method3186(false);
                     }

                     return;
                  }
               } else {
                  var10000 = ~arg0;
               }

               if (var10000 > ~(var3.field9942[0].length + -this.field11459)) {
                  this.field11459 += arg0;
                  return;
               }

               arg0 -= var3.field9942[0].length + -this.field11459;
               this.method5674(-12914);
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11465[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(DIZ)Lpq;"
   )
   public final class664 method5682(double arg0, int arg1, boolean arg2) {
      try {
         ++field11450;
         long var5 = (long)(this.field11455 << 0 | arg1);
         class664 var7 = (class664)class737.field10961.method3178(0, var5);
         if (arg2) {
            this.field11460 = -6;
         }

         if (var7 != null) {
            var7.field9943 = arg0;
            class737.field10961.method3185(9, var5);
            if (!client.field1786) {
               return var7;
            }
         }

         var7 = new class664(new short[this.field11455][arg1], arg0);
         return var7;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field11465[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "g",
      descriptor = "(I)I"
   )
   public final synchronized int method5683(int arg0) {
      try {
         if (arg0 > -48) {
            return -81;
         } else {
            ++field11458;
            return this.field11463;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11465[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class781(int arg0) {
      try {
         this.field11455 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11465[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5684(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5685(char[] arg0) {
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
            var10005 = 38;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
