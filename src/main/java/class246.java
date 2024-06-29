import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class246 extends class330 {
   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "Lrca;"
   )
   private class37 field3108 = new class37();
   @OriginalMember(
      owner = "client!tf",
      name = "C",
      descriptor = "I"
   )
   private int field3111 = 0;
   @OriginalMember(
      owner = "client!tf",
      name = "x",
      descriptor = "I"
   )
   private int field3115 = 256;
   @OriginalMember(
      owner = "client!tf",
      name = "w",
      descriptor = "I"
   )
   private int field3117 = 256;
   @OriginalMember(
      owner = "client!tf",
      name = "H",
      descriptor = "I"
   )
   private int field3096;
   @OriginalMember(
      owner = "client!tf",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3119 = new String[]{method1964(method1963("$`d[{>o>Y:")), method1964(method1963("$`d\":")), method1964(method1963("$`d+:")), method1964(method1963("$`d*:")), method1964(method1963("$`d#:")), method1964(method1963("$`d.:")), method1964(method1963("+(dIo")), method1964(method1963(">s&\u000b")), method1964(method1963("$`d&:")), method1964(method1963("$`d!:")), method1964(method1963("$`d$:")), method1964(method1963("$`d/:")), method1964(method1963("$`d :")), method1964(method1963("$`d2:")), method1964(method1963("$`d!Sx")), method1964(method1963("$`d-:")), method1964(method1963("$`d,:")), method1964(method1963("$`d%:"))};
   @OriginalMember(
      owner = "client!tf",
      name = "y",
      descriptor = "I"
   )
   public static int field3097;
   @OriginalMember(
      owner = "client!tf",
      name = "L",
      descriptor = "I"
   )
   public static int field3098;
   @OriginalMember(
      owner = "client!tf",
      name = "F",
      descriptor = "I"
   )
   public static int field3099;
   @OriginalMember(
      owner = "client!tf",
      name = "J",
      descriptor = "I"
   )
   public static int field3100;
   @OriginalMember(
      owner = "client!tf",
      name = "N",
      descriptor = "I"
   )
   public static int field3102;
   @OriginalMember(
      owner = "client!tf",
      name = "I",
      descriptor = "I"
   )
   public static int field3103;
   @OriginalMember(
      owner = "client!tf",
      name = "E",
      descriptor = "I"
   )
   public static int field3104;
   @OriginalMember(
      owner = "client!tf",
      name = "B",
      descriptor = "I"
   )
   public static int field3105;
   @OriginalMember(
      owner = "client!tf",
      name = "t",
      descriptor = "I"
   )
   public static int field3106;
   @OriginalMember(
      owner = "client!tf",
      name = "A",
      descriptor = "I"
   )
   public static int field3107;
   @OriginalMember(
      owner = "client!tf",
      name = "M",
      descriptor = "I"
   )
   public static int field3109;
   @OriginalMember(
      owner = "client!tf",
      name = "p",
      descriptor = "I"
   )
   public static int field3110;
   @OriginalMember(
      owner = "client!tf",
      name = "q",
      descriptor = "I"
   )
   private int field3112;
   @OriginalMember(
      owner = "client!tf",
      name = "s",
      descriptor = "I"
   )
   public static int field3113;
   @OriginalMember(
      owner = "client!tf",
      name = "v",
      descriptor = "I"
   )
   public static int field3114;
   @OriginalMember(
      owner = "client!tf",
      name = "u",
      descriptor = "Z"
   )
   private boolean field3116;
   @OriginalMember(
      owner = "client!tf",
      name = "r",
      descriptor = "Z"
   )
   private boolean field3118;
   @OriginalMember(
      owner = "client!tf",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field3101;

   @OriginalMember(
      owner = "client!tf",
      name = "b",
      descriptor = "([III)V"
   )
   public final synchronized void method1948(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field3104;
         if (!this.field3118) {
            if (this.method1952(0) == null) {
               if (this.field3116) {
                  this.method4924(-2970);
                  class430.field5848.method2948(-9206);
               }

            } else {
               int var5 = arg1 - -arg2;
               if (class243.field3061) {
                  var5 <<= 1;
               }

               byte var6 = 0;
               byte var7 = 0;
               class123 var8;
               if (this.field3096 == 2) {
                  var7 = 1;
                  if (var4) {
                     var8 = this.method1952(0);
                     if (var8 == null) {
                        return;
                     }
                  } else {
                     if (var5 <= arg1) {
                        return;
                     }

                     var8 = this.method1952(0);
                     if (var8 == null) {
                        return;
                     }
                  }
               } else {
                  if (var5 <= arg1) {
                     return;
                  }

                  var8 = this.method1952(0);
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
                        short[][] var9 = var8.field1615;
                        if (!var4) {
                           if (~var5 >= ~arg1) {
                              var10000 = this.field3112;
                              var10001 = var9[0].length;
                              break label136;
                           }

                           var10000 = ~this.field3112;
                           var10001 = ~var9[0].length;
                           if (var4) {
                              break label136;
                           }

                           if (var10000 <= var10001) {
                              var10000 = this.field3112;
                              var10001 = var9[0].length;
                              break label136;
                           }
                        }

                        while(true) {
                           if (class243.field3061) {
                              arg0[arg1++] = var9[var6][this.field3112] * this.field3117;
                              arg0[arg1++] = var9[var7][this.field3112] * this.field3115;
                              if (var4) {
                                 var10001 = arg1++;
                                 arg0[var10001] += var9[var6][this.field3112] * this.field3117 + var9[var7][this.field3112] * this.field3115;
                                 ++this.field3112;
                              } else {
                                 ++this.field3112;
                              }
                           } else {
                              var10001 = arg1++;
                              arg0[var10001] += var9[var6][this.field3112] * this.field3117 + var9[var7][this.field3112] * this.field3115;
                              ++this.field3112;
                           }

                           if (~var5 >= ~arg1) {
                              var10000 = this.field3112;
                              var10001 = var9[0].length;
                              break;
                           }

                           var10000 = ~this.field3112;
                           var10001 = ~var9[0].length;
                           if (var4) {
                              break;
                           }

                           if (var10000 <= var10001) {
                              var10000 = this.field3112;
                              var10001 = var9[0].length;
                              break;
                           }
                        }
                     }

                     if (var10000 >= var10001) {
                        if (var4) {
                           var8 = this.method1952(0);
                           continue label145;
                        }

                        this.method1953(0);
                     }

                     if (var5 <= arg1) {
                        return;
                     }

                     var8 = this.method1952(0);
                  } while(var8 != null);

                  return;
               } while(var8 != null);

            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3119[14] + (arg0 != null ? field3119[6] : field3119[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "()Lmv;"
   )
   public final class330 method1949() {
      try {
         ++field3103;
         return null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3119[13] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "b",
      descriptor = "()I"
   )
   public final int method1950() {
      try {
         ++field3106;
         return 1;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3119[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(Lbk;B)V"
   )
   public final synchronized void method1951(class123 arg0, byte arg1) {
      boolean var3 = client.field1481;

      try {
         if (var3) {
            this.field3108.method281(true);
            --this.field3111;
         }

         while(true) {
            if (this.field3111 < 100) {
               ++field3114;
               this.field3108.method279(false, arg0);
               ++this.field3111;
               if (!var3) {
                  if (arg1 <= 106) {
                     this.method1959(-95);
                     return;
                  }

                  return;
               }
            } else {
               this.field3108.method281(true);
            }

            --this.field3111;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3119[8] + (arg0 != null ? field3119[6] : field3119[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "d",
      descriptor = "(I)Lbk;"
   )
   private final synchronized class123 method1952(int arg0) {
      try {
         if (arg0 != 0) {
            this.method1958(58);
         }

         ++field3105;
         return (class123)this.field3108.method288(0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3119[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "b",
      descriptor = "(I)V"
   )
   private final synchronized void method1953(int arg0) {
      try {
         ++field3102;
         class123 var2 = this.method1952(0);
         if (var2 != null) {
            var2.method4924(-2970);
            --this.field3111;
            this.field3112 = arg0;
            class430.field5848.method2946(var2, true, var2.method1075((byte)-128));
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3119[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method1954(int arg0, boolean arg1) {
      try {
         ++field3109;
         this.field3117 = arg0;
         this.field3115 = arg0;
         if (arg1) {
            this.field3117 = 59;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3119[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1955(byte arg0) {
      try {
         if (arg0 != -9) {
            field3101 = null;
         }

         field3101 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3119[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(Z)V"
   )
   public final synchronized void method1956(boolean arg0) {
      try {
         this.field3116 = arg0;
         ++field3099;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3119[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(BDI)Lbk;"
   )
   public final class123 method1957(byte arg0, double arg1, int arg2) {
      try {
         ++field3098;
         if (arg0 != 109) {
            this.field3116 = true;
         }

         long var5 = (long)(arg2 | this.field3096 << 0);
         class123 var7 = (class123)class430.field5848.method2947(var5, 28581);
         if (var7 != null) {
            var7.field1617 = arg1;
            class430.field5848.method2945(true, var5);
            if (!client.field1481) {
               return var7;
            }
         }

         var7 = new class123(new short[this.field3096][arg2], arg1);
         return var7;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3119[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "h",
      descriptor = "(I)D"
   )
   public final synchronized double method1958(int arg0) {
      try {
         ++field3107;
         if (~this.field3111 > -2) {
            return -1.0D;
         } else {
            class123 var2 = (class123)this.field3108.method288(0);
            if (var2 == null) {
               return -1.0D;
            } else {
               return arg0 != -6639 ? -0.8582262192902047D : var2.field1617 - (double)((float)var2.field1615[0].length / (float)class36.field514);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3119[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method1959(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field3097;
         if (!this.field3118) {
            while(true) {
               class123 var3 = this.method1952(0);
               int var10000;
               if (var3 == null) {
                  var10000 = this.field3116;
                  if (!var2) {
                     if (var10000 != 0) {
                        this.method4924(-2970);
                        class430.field5848.method2948(-9206);
                     }

                     return;
                  }
               } else {
                  var10000 = ~(var3.field1615[0].length + -this.field3112);
               }

               if (var10000 < ~arg0) {
                  this.field3112 += arg0;
                  return;
               }

               arg0 -= var3.field1615[0].length + -this.field3112;
               this.method1953(0);
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3119[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final synchronized void method1960(int arg0, boolean arg1) {
      try {
         if (arg0 >= 125) {
            ++field3113;
            this.field3118 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3119[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "c",
      descriptor = "()Lmv;"
   )
   public final class330 method1961() {
      try {
         ++field3100;
         return null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3119[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "c",
      descriptor = "(I)I"
   )
   public final synchronized int method1962(int arg0) {
      try {
         ++field3110;
         if (arg0 != 256) {
            this.method1949();
         }

         return this.field3111;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3119[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class246(int arg0) {
      try {
         this.field3096 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3119[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1963(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1964(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
