import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class623 {
   @OriginalMember(
      owner = "client!ww",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   private String field8900 = field8916[3];
   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8916 = new String[]{method4595(method4594("\u0011\f[O\u0010")), method4595(method4594("\u0011\f[I\u0010")), method4595(method4594("\u001dU[+E")), method4595(method4594("\b\u000e\u0019i")), method4595(method4594("\u0011\f[N\u0010")), method4595(method4594("\u0011\f[G\u0010")), method4595(method4594("\u0011\f[@\u0010")), method4595(method4594("\u0011\f[B\u0010")), method4595(method4594("\u0011\f[A\u0010")), method4595(method4594("\u0011\f[M\u0010")), method4595(method4594("\u0011\f[D\u0010")), method4595(method4594("\u0011\f[F\u0010")), method4595(method4594("\u0011\f[L\u0010")), method4595(method4594("\u0011\f[C\u0010"))};
   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "I"
   )
   public static int field8911 = 0;
   @OriginalMember(
      owner = "client!ww",
      name = "e",
      descriptor = "C"
   )
   public char field8907;
   @OriginalMember(
      owner = "client!ww",
      name = "i",
      descriptor = "C"
   )
   public char field8908;
   @OriginalMember(
      owner = "client!ww",
      name = "m",
      descriptor = "I"
   )
   public static int field8896;
   @OriginalMember(
      owner = "client!ww",
      name = "g",
      descriptor = "I"
   )
   public static int field8897;
   @OriginalMember(
      owner = "client!ww",
      name = "k",
      descriptor = "I"
   )
   public static int field8898;
   @OriginalMember(
      owner = "client!ww",
      name = "n",
      descriptor = "I"
   )
   public static int field8899;
   @OriginalMember(
      owner = "client!ww",
      name = "b",
      descriptor = "I"
   )
   public static int field8901;
   @OriginalMember(
      owner = "client!ww",
      name = "q",
      descriptor = "I"
   )
   public static int field8902;
   @OriginalMember(
      owner = "client!ww",
      name = "r",
      descriptor = "I"
   )
   public static int field8903;
   @OriginalMember(
      owner = "client!ww",
      name = "s",
      descriptor = "I"
   )
   private int field8904;
   @OriginalMember(
      owner = "client!ww",
      name = "c",
      descriptor = "I"
   )
   public static int field8905;
   @OriginalMember(
      owner = "client!ww",
      name = "d",
      descriptor = "I"
   )
   public static int field8909;
   @OriginalMember(
      owner = "client!ww",
      name = "o",
      descriptor = "I"
   )
   public static int field8910;
   @OriginalMember(
      owner = "client!ww",
      name = "j",
      descriptor = "I"
   )
   public static int field8913;
   @OriginalMember(
      owner = "client!ww",
      name = "l",
      descriptor = "I"
   )
   public static int field8914;
   @OriginalMember(
      owner = "client!ww",
      name = "p",
      descriptor = "I"
   )
   private int field8915;
   @OriginalMember(
      owner = "client!ww",
      name = "h",
      descriptor = "Lbga;"
   )
   private class398 field8912;
   @OriginalMember(
      owner = "client!ww",
      name = "t",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field8906;

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(BI)Ljava/lang/String;"
   )
   public final String method4582(byte arg0, int arg1) {
      try {
         ++field8901;
         if (arg0 != 76) {
            this.field8900 = null;
         }

         if (this.field8906 == null) {
            return this.field8900;
         } else if (!(this.field8906 instanceof class398)) {
            String[] var3 = (String[])this.field8906;
            if (~arg1 <= -1 && ~var3.length < ~arg1) {
               String var4 = var3[arg1];
               return var4 != null ? var4 : this.field8900;
            } else {
               return this.field8900;
            }
         } else {
            class354 var5 = (class354)((class398)this.field8906).method3101(-1, (long)arg1);
            return var5 != null ? var5.field5236 : this.field8900;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8916[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)Z"
   )
   public final boolean method4583(String arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg1) {
            this.method4583((String)null, true);
         }

         ++field8913;
         if (this.field8906 == null) {
            return false;
         } else {
            if (this.field8912 == null) {
               this.method4591((byte)48);
            }

            class671 var4 = (class671)this.field8912.method3101(-1, class178.method1622(0, arg0));
            if (var3) {
               if (var4.field9416.equals(arg0)) {
                  return true;
               }

               var4 = (class671)this.field8912.method3103(0);
            }

            while(true) {
               boolean var10000;
               if (var4 == null) {
                  var10000 = false;
                  if (!var3) {
                     return false;
                  }
               } else {
                  var10000 = var4.field9416.equals(arg0);
               }

               if (var10000) {
                  return true;
               }

               var4 = (class671)this.field8912.method3103(0);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8916[11] + (arg0 != null ? field8916[2] : field8916[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method4584(byte arg0) {
      boolean var2 = client.field10022;

      try {
         int var3 = 27 / ((arg0 - 18) / 59);
         ++field8896;
         if (this.field8906 instanceof class398) {
            class398 var7 = (class398)this.field8906;
            this.field8912 = new class398(var7.method3099((byte)121));
            class288 var8 = (class288)var7.method3102(-128);
            if (var2 || var8 != null) {
               do {
                  class288 var9 = new class288((int)var8.field3777);
                  this.field8912.method3098((long)var8.field4298, var9, -1);
                  var8 = (class288)var7.method3095((byte)-118);
               } while(var8 != null);

            }
         } else {
            Integer[] var4 = (Integer[])this.field8906;
            this.field8912 = new class398(class645.method4694(var4.length, (byte)-128));
            int var5 = 0;
            class288 var6;
            if (var2) {
               if (var4[var5] != null) {
                  var6 = new class288(var5);
                  this.field8912.method3098((long)var4[var5], var6, -1);
               }

               ++var5;
            }

            while(true) {
               while(~var5 > ~var4.length) {
                  if (var4[var5] != null) {
                     var6 = new class288(var5);
                     this.field8912.method3098((long)var4[var5], var6, -1);
                  }

                  ++var5;
               }

               if (!var2) {
                  return;
               }

               ++var5;
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field8916[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(IIILjga;)V"
   )
   public static final void method4585(int arg0, int arg1, int arg2, class91 arg3) {
      try {
         ++field8897;
         if (arg3 != null) {
            if (arg3.field1383 != null) {
               class536 var4 = new class536();
               var4.field7524 = arg3;
               var4.field7529 = arg3.field1383;
               class427.method3337(var4);
            }

            class37.field543 = true;
            if (arg2 == -27461) {
               class224.field3183 = arg3.field1356;
               class704.field10135 = arg3.field1362;
               class394.field5716 = arg0;
               class466.field6762 = arg1;
               class357.field5276 = arg3.field1415;
               class451.field6582 = arg3.field1428;
               class127.field2038 = arg3.field1474;
               class566.method4205(1727005542, arg3);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8916[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8916[2] : field8916[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(Lcu;B)V"
   )
   public final void method4586(class65 arg0, byte arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg1 != -65) {
            method4592(-87, true, -1, -97, -2);
         }

         ++field8905;

         do {
            int var4 = arg0.method665(false);
            if (~var4 == -1) {
               break;
            }

            this.method4589(var4, true, arg0);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8916[5] + (arg0 != null ? field8916[2] : field8916[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method4587(int arg0) {
      try {
         if (arg0 != 6) {
            this.method4582((byte)-70, -85);
         }

         ++field8902;
         return this.field8904;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8916[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method4588(int arg0, boolean arg1) {
      try {
         ++field8910;
         if (!arg1) {
            this.field8915 = 0;
         }

         if (this.field8906 == null) {
            return this.field8915;
         } else if (!(this.field8906 instanceof class398)) {
            Integer[] var3 = (Integer[])this.field8906;
            if (~arg0 <= -1 && ~arg0 > ~var3.length) {
               Integer var4 = var3[arg0];
               return var4 != null ? var4 : this.field8915;
            } else {
               return this.field8915;
            }
         } else {
            class288 var5 = (class288)((class398)this.field8906).method3101(-1, (long)arg0);
            return var5 != null ? var5.field4298 : this.field8915;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8916[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(IZLcu;)V"
   )
   private final void method4589(int arg0, boolean arg1, class65 arg2) {
      boolean var4 = client.field10022;

      try {
         label122: {
            if (arg0 != 1) {
               if (arg0 != 2) {
                  if (~arg0 != -4) {
                     if (arg0 != 4) {
                        if (arg0 == 5 || arg0 == 6) {
                           this.field8904 = arg2.method685(-2);
                           class398 var5 = new class398(class645.method4694(this.field8904, (byte)-128));
                           int var6 = 0;
                           if (var4 || var6 < this.field8904) {
                              do {
                                 int var7;
                                 class247 var8;
                                 label105: {
                                    var7 = arg2.method701(255);
                                    if (arg0 == 5) {
                                       var8 = new class354(arg2.method640((byte)51));
                                       if (!var4) {
                                          break label105;
                                       }
                                    }

                                    var8 = new class288(arg2.method701(255));
                                 }

                                 var5.method3098((long)var7, var8, -1);
                                 ++var6;
                              } while(var6 < this.field8904);
                           }

                           this.field8906 = var5;
                           if (!var4) {
                              break label122;
                           }
                        }

                        if (arg0 != 7) {
                           if (~arg0 != -9) {
                              break label122;
                           }

                           int var9 = arg2.method685(-2);
                           this.field8904 = arg2.method685(-2);
                           Integer[] var10 = new Integer[var9];
                           int var11 = 0;
                           if (var4 || ~this.field8904 < ~var11) {
                              do {
                                 int var12 = arg2.method685(-2);
                                 var10[var12] = new Integer(arg2.method701(255));
                                 ++var11;
                              } while(~this.field8904 < ~var11);
                           }

                           this.field8906 = var10;
                           if (!var4) {
                              break label122;
                           }
                        }

                        int var13 = arg2.method685(-2);
                        this.field8904 = arg2.method685(-2);
                        String[] var14 = new String[var13];
                        int var15 = 0;
                        int var16;
                        if (var4) {
                           var16 = arg2.method685(-2);
                           var14[var16] = arg2.method640((byte)51);
                           ++var15;
                        }

                        while(true) {
                           if (~var15 <= ~this.field8904) {
                              this.field8906 = var14;
                              if (!var4) {
                                 break label122;
                              }
                              break;
                           }

                           var16 = arg2.method685(-2);
                           var14[var16] = arg2.method640((byte)51);
                           ++var15;
                        }
                     }

                     this.field8915 = arg2.method701(255);
                     if (!var4) {
                        break label122;
                     }
                  }

                  this.field8900 = arg2.method640((byte)51);
                  if (!var4) {
                     break label122;
                  }
               }

               this.field8907 = class571.method4230(arg2.method638(true), 0);
               if (!var4) {
                  break label122;
               }
            }

            this.field8908 = class571.method4230(arg2.method638(true), -120);
         }

         if (!arg1) {
            this.method4593(-128, (byte)-15);
         }

         ++field8898;
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field8916[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8916[2] : field8916[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(ZJ)V"
   )
   public static final void method4590(boolean arg0, long arg1) {
      try {
         class309.field4659.setTime(new Date(arg1));
         if (arg0) {
            field8911 = -103;
         }

         ++field8903;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8916[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method4591(byte arg0) {
      boolean var2 = client.field10022;

      try {
         label69: {
            ++field8909;
            if (!(this.field8906 instanceof class398)) {
               String[] var3 = (String[])this.field8906;
               this.field8912 = new class398(class645.method4694(var3.length, (byte)-128));
               int var4 = 0;
               class671 var5;
               if (var2) {
                  if (var3[var4] != null) {
                     var5 = new class671(var3[var4], var4);
                     this.field8912.method3098(class178.method1622(arg0 + -48, var3[var4]), var5, -1);
                  }

                  ++var4;
               }

               while(true) {
                  while(~var3.length < ~var4) {
                     if (var3[var4] != null) {
                        var5 = new class671(var3[var4], var4);
                        this.field8912.method3098(class178.method1622(arg0 + -48, var3[var4]), var5, -1);
                     }

                     ++var4;
                  }

                  if (!var2) {
                     if (!var2) {
                        break label69;
                     }
                     break;
                  }

                  ++var4;
               }
            }

            class398 var6 = (class398)this.field8906;
            this.field8912 = new class398(var6.method3099((byte)87));
            class354 var7 = (class354)var6.method3102(arg0 ^ 83);
            if (var2 || var7 != null) {
               do {
                  class671 var8 = new class671(var7.field5236, (int)var7.field3777);
                  this.field8912.method3098(class178.method1622(arg0 ^ 48, var7.field5236), var8, arg0 + -49);
                  var7 = (class354)var6.method3095((byte)-118);
               } while(var7 != null);
            }
         }

         if (arg0 != 48) {
            method4592(-106, true, -8, 31, -10);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field8916[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(IZIII)V"
   )
   public static final void method4592(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg1) {
            if (~class587.field8239 >= ~arg4 && arg4 <= class767.field11011) {
               int var7 = class437.method3398(class729.field10384, (byte)-92, arg0, class604.field8618);
               int var8 = class437.method3398(class729.field10384, (byte)-81, arg3, class604.field8618);
               class799.method5754(arg4, var8, var7, arg2, -105);
            }

            ++field8914;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8916[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(IB)Z"
   )
   public final boolean method4593(int arg0, byte arg1) {
      try {
         if (arg1 >= -103) {
            field8911 = -94;
         }

         ++field8899;
         if (this.field8906 == null) {
            return false;
         } else {
            if (this.field8912 == null) {
               this.method4584((byte)108);
            }

            class288 var3 = (class288)this.field8912.method3101(-1, (long)arg0);
            return var3 != null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8916[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4594(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4595(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
