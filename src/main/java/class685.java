import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class685 extends class593 {
   @OriginalMember(
      owner = "client!fj",
      name = "R",
      descriptor = "Lll;"
   )
   private class387 field10083 = new class387();
   @OriginalMember(
      owner = "client!fj",
      name = "K",
      descriptor = "I"
   )
   private int field10095 = 256;
   @OriginalMember(
      owner = "client!fj",
      name = "H",
      descriptor = "I"
   )
   private int field10101 = 0;
   @OriginalMember(
      owner = "client!fj",
      name = "Q",
      descriptor = "I"
   )
   private int field10102 = 256;
   @OriginalMember(
      owner = "client!fj",
      name = "P",
      descriptor = "I"
   )
   private int field10076;
   @OriginalMember(
      owner = "client!fj",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10104 = new String[]{method5005(method5004("\\\u001d\u0004\u001f{")), method5005(method5004("\\\u001d\u0004\u001e{")), method5005(method5004("\\\u001d\u0004\u001b{")), method5005(method5004("\\\u001d\u0004\u0011{")), method5005(method5004("\\\u001d\u0004\u001f\u0012\u0012")), method5005(method5004("\\\u001d\u0004\u0019{")), method5005(method5004("\\\u001d\u0004\u000e{")), method5005(method5004("\\\u001d\u0004\u0014{")), method5005(method5004("AY\u0004v.")), method5005(method5004("\\\u001d\u0004\u0013{")), method5005(method5004("T\u0002F4")), method5005(method5004("\\\u001d\u0004\u0012{")), method5005(method5004("\\\u001d\u0004d:T\u001e^f{")), method5005(method5004("\\\u001d\u0004\u001a{")), method5005(method5004("\\\u001d\u0004\u001c{")), method5005(method5004("\\\u001d\u0004\u0011\u0012\u0012")), method5005(method5004("\\\u001d\u0004\u001d{")), method5005(method5004("\\\u001d\u0004\u0017\u0012\u0012")), method5005(method5004("\\\u001d\u0004\u0010{"))};
   @OriginalMember(
      owner = "client!fj",
      name = "I",
      descriptor = "Lek;"
   )
   public static class536 field10086 = new class536(68, 18);
   @OriginalMember(
      owner = "client!fj",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field10092 = new int[]{0, -1, 0, 1};
   @OriginalMember(
      owner = "client!fj",
      name = "F",
      descriptor = "Loi;"
   )
   public static class80 field10094 = new class80(8);
   @OriginalMember(
      owner = "client!fj",
      name = "w",
      descriptor = "Lwu;"
   )
   public static class395 field10098 = new class395(14, 0, 4, 1);
   @OriginalMember(
      owner = "client!fj",
      name = "t",
      descriptor = "I"
   )
   public static int field10077;
   @OriginalMember(
      owner = "client!fj",
      name = "v",
      descriptor = "I"
   )
   public static int field10078;
   @OriginalMember(
      owner = "client!fj",
      name = "O",
      descriptor = "I"
   )
   public static int field10079;
   @OriginalMember(
      owner = "client!fj",
      name = "B",
      descriptor = "I"
   )
   public static int field10080;
   @OriginalMember(
      owner = "client!fj",
      name = "L",
      descriptor = "I"
   )
   public static int field10081;
   @OriginalMember(
      owner = "client!fj",
      name = "r",
      descriptor = "I"
   )
   public static int field10082;
   @OriginalMember(
      owner = "client!fj",
      name = "x",
      descriptor = "I"
   )
   public static int field10084;
   @OriginalMember(
      owner = "client!fj",
      name = "C",
      descriptor = "I"
   )
   public static int field10085;
   @OriginalMember(
      owner = "client!fj",
      name = "A",
      descriptor = "I"
   )
   public static int field10087;
   @OriginalMember(
      owner = "client!fj",
      name = "G",
      descriptor = "I"
   )
   public static int field10088;
   @OriginalMember(
      owner = "client!fj",
      name = "q",
      descriptor = "I"
   )
   public static int field10089;
   @OriginalMember(
      owner = "client!fj",
      name = "D",
      descriptor = "I"
   )
   public static int field10090;
   @OriginalMember(
      owner = "client!fj",
      name = "E",
      descriptor = "I"
   )
   public static int field10091;
   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "I"
   )
   public static int field10093;
   @OriginalMember(
      owner = "client!fj",
      name = "M",
      descriptor = "I"
   )
   public static int field10100;
   @OriginalMember(
      owner = "client!fj",
      name = "J",
      descriptor = "I"
   )
   private int field10103;
   @OriginalMember(
      owner = "client!fj",
      name = "S",
      descriptor = "Lhia;"
   )
   public static class73 field10097;
   @OriginalMember(
      owner = "client!fj",
      name = "s",
      descriptor = "Z"
   )
   private boolean field10096;
   @OriginalMember(
      owner = "client!fj",
      name = "y",
      descriptor = "Z"
   )
   private boolean field10099;

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method4993(int arg0, int arg1) {
      try {
         if (arg1 != 6022) {
            field10086 = null;
         }

         this.field10102 = arg0;
         ++field10079;
         this.field10095 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10104[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "b",
      descriptor = "()Lkj;"
   )
   public final class593 method1603() {
      try {
         ++field10081;
         return null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10104[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method1606(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field10100;
         if (!this.field10099) {
            while(true) {
               class68 var3 = this.method4996(106);
               int var10000;
               if (var3 == null) {
                  var10000 = this.field10096;
                  if (!var2) {
                     if (var10000 != 0) {
                        this.method3165(126);
                        class601.field8842.method5067(-12072);
                     }

                     return;
                  }
               } else {
                  var10000 = var3.field840[0].length + -this.field10103;
               }

               if (var10000 > arg0) {
                  this.field10103 += arg0;
                  return;
               }

               arg0 -= var3.field840[0].length - this.field10103;
               this.method5002(0);
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10104[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "()I"
   )
   public final int method1602() {
      try {
         ++field10089;
         return 1;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10104[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method4994(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field10084;
         client var2 = class220.field3148;
         synchronized(class220.field3148) {
            if (arg0 <= -26) {
               if (class326.field4414 == null) {
                  Container var3;
                  label97: {
                     if (class549.field7865 != null) {
                        var3 = class549.field7865;
                        if (!var1) {
                           break label97;
                        }
                     }

                     if (class216.field3093 == null) {
                        var3 = class362.field4931;
                        if (!var1) {
                           break label97;
                        }
                     }

                     var3 = class216.field3093;
                  }

                  class79.field982 = var3.getSize().width;
                  class689.field10151 = var3.getSize().height;
                  if (class549.field7865 == var3) {
                     Insets var4 = class549.field7865.getInsets();
                     class79.field982 -= var4.right + var4.left;
                     class689.field10151 -= var4.top + var4.bottom;
                  }

                  label77: {
                     if (~class713.method5178(-111) == -2) {
                        class692.field10185 = class60.field743;
                        class150.field2097 = (-class87.field1142 + class79.field982) / 2;
                        class278.field3787 = 0;
                        class237.field3310 = class87.field1142;
                        if (!var1) {
                           break label77;
                        }
                     }

                     class153.method1277(false);
                  }

                  if (class435.field6230 != class290.field4016) {
                     boolean var10000;
                     if (class237.field3310 < 1024 && class692.field10185 < 768) {
                        var10000 = true;
                     } else {
                        var10000 = false;
                     }
                  }

                  class557.field7990.setSize(class237.field3310, class692.field10185);
                  if (class383.field5543 != null) {
                     label64: {
                        if (!class681.field10034) {
                           class383.field5543.method588(class557.field7990, class237.field3310, class692.field10185);
                           if (!var1) {
                              break label64;
                           }
                        }

                        class452.method3296(-12371, class557.field7990);
                     }
                  }

                  label59: {
                     if (class549.field7865 == var3) {
                        Insets var5 = class549.field7865.getInsets();
                        class557.field7990.setLocation(class150.field2097 + var5.left, class278.field3787 + var5.top);
                        if (!var1) {
                           break label59;
                        }
                     }

                     class557.field7990.setLocation(class150.field2097, class278.field3787);
                  }

                  if (~class185.field2623 != 0) {
                     class267.method2068(3, true);
                  }

                  class123.method994((byte)-15);
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field10104[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "g",
      descriptor = "(I)V"
   )
   public final synchronized void method4995(int arg0) {
      try {
         this.field10096 = true;
         if (arg0 == 14250) {
            ++field10088;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10104[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "c",
      descriptor = "(I)Lbd;"
   )
   private final synchronized class68 method4996(int arg0) {
      try {
         ++field10085;
         if (arg0 <= 34) {
            this.field10076 = -88;
         }

         return (class68)this.field10083.method2933(2);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10104[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "([III)V"
   )
   public final synchronized void method1607(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field10077;
         if (!this.field10099) {
            if (this.method4996(56) == null) {
               if (this.field10096) {
                  this.method3165(118);
                  class601.field8842.method5067(-12072);
               }

            } else {
               int var5 = arg1 + arg2;
               if (class65.field790) {
                  var5 <<= 1;
               }

               byte var6 = 0;
               byte var7 = 0;
               class68 var8;
               if (this.field10076 == 2) {
                  var7 = 1;
                  if (var4) {
                     var8 = this.method4996(70);
                     if (var8 == null) {
                        return;
                     }
                  } else {
                     if (~arg1 <= ~var5) {
                        return;
                     }

                     var8 = this.method4996(70);
                     if (var8 == null) {
                        return;
                     }
                  }
               } else {
                  if (~arg1 <= ~var5) {
                     return;
                  }

                  var8 = this.method4996(70);
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
                        short[][] var9 = var8.field840;
                        if (!var4) {
                           if (~var5 >= ~arg1) {
                              var10000 = var9[0].length;
                              var10001 = this.field10103;
                              break label136;
                           }

                           var10000 = var9[0].length;
                           var10001 = this.field10103;
                           if (var4) {
                              break label136;
                           }

                           if (var10000 <= var10001) {
                              var10000 = var9[0].length;
                              var10001 = this.field10103;
                              break label136;
                           }
                        }

                        while(true) {
                           if (class65.field790) {
                              arg0[arg1++] = var9[var6][this.field10103] * this.field10095;
                              arg0[arg1++] = var9[var7][this.field10103] * this.field10102;
                              if (var4) {
                                 var10001 = arg1++;
                                 arg0[var10001] += var9[var6][this.field10103] * this.field10095 + var9[var7][this.field10103] * this.field10102;
                                 ++this.field10103;
                              } else {
                                 ++this.field10103;
                              }
                           } else {
                              var10001 = arg1++;
                              arg0[var10001] += var9[var6][this.field10103] * this.field10095 + var9[var7][this.field10103] * this.field10102;
                              ++this.field10103;
                           }

                           if (~var5 >= ~arg1) {
                              var10000 = var9[0].length;
                              var10001 = this.field10103;
                              break;
                           }

                           var10000 = var9[0].length;
                           var10001 = this.field10103;
                           if (var4) {
                              break;
                           }

                           if (var10000 <= var10001) {
                              var10000 = var9[0].length;
                              var10001 = this.field10103;
                              break;
                           }
                        }
                     }

                     if (var10000 <= var10001) {
                        if (var4) {
                           var8 = this.method4996(0);
                           continue label145;
                        }

                        this.method5002(0);
                     }

                     if (~arg1 <= ~var5) {
                        return;
                     }

                     var8 = this.method4996(70);
                  } while(var8 != null);

                  return;
               } while(var8 != null);

            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field10104[17] + (arg0 != null ? field10104[8] : field10104[10]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(Z)I"
   )
   public final synchronized int method4997(boolean arg0) {
      try {
         ++field10093;
         return !arg0 ? 84 : this.field10101;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10104[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(DIB)Lbd;"
   )
   public final class68 method4998(double arg0, int arg1, byte arg2) {
      try {
         ++field10090;
         long var5 = (long)(arg1 | this.field10076 << 0);
         if (arg2 != -72) {
            this.method4996(123);
         }

         class68 var7 = (class68)class601.field8842.method5069((byte)-79, var5);
         if (var7 == null) {
            var7 = new class68(new short[this.field10076][arg1], arg0);
            if (!client.field4360) {
               return var7;
            }
         }

         var7.field837 = arg0;
         class601.field8842.method5066(var5, (byte)107);
         return var7;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field10104[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(Lbd;I)V"
   )
   public final synchronized void method4999(class68 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fj",
      name = "c",
      descriptor = "()Lkj;"
   )
   public final class593 method1605() {
      try {
         ++field10091;
         return null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10104[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5000(byte arg0) {
      try {
         field10094 = null;
         field10098 = null;
         field10086 = null;
         if (arg0 <= 77) {
            method4994(125);
         }

         field10092 = null;
         field10097 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10104[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final synchronized void method5001(boolean arg0, byte arg1) {
      try {
         ++field10087;
         this.field10099 = arg0;
         if (arg1 >= -71) {
            this.method4995(47);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10104[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "b",
      descriptor = "(I)V"
   )
   private final synchronized void method5002(int arg0) {
      try {
         ++field10078;
         class68 var2 = this.method4996(35);
         if (var2 != null) {
            var2.method3165(109);
            --this.field10101;
            this.field10103 = arg0;
            class601.field8842.method5068(var2.method639((byte)-80), var2, arg0 ^ -114);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10104[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(B)D"
   )
   public final synchronized double method5003(byte arg0) {
      try {
         if (arg0 != -120) {
            field10094 = null;
         }

         ++field10082;
         if (this.field10101 < 1) {
            return -1.0D;
         } else {
            class68 var2 = (class68)this.field10083.method2933(arg0 + 122);
            return var2 == null ? -1.0D : (double)(-((float)var2.field840[0].length / (float)class83.field1082)) + var2.field837;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10104[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class685(int arg0) {
      try {
         this.field10076 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10104[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5004(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5005(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
