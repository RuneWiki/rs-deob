import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class342 {
   @OriginalMember(
      owner = "client!nha",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   private String field4887 = field4904[4];
   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4904 = new String[]{method2718(method2717("0\u00036J\"v")), method2718(method2717("0\u00036J+v")), method2718(method2717("0\u00036J(v")), method2718(method2717("0\u00036J#v")), method2718(method2717("0\u001e;\b")), method2718(method2717("%EyJ\u0017")), method2718(method2717("0\u00036J.v")), method2718(method2717("0\u00036J/v")), method2718(method2717("0\u00036J)v")), method2718(method2717("0\u00036J,v")), method2718(method2717("0\u00036J v")), method2718(method2717("0\u00036J!v")), method2718(method2717("0\u00036J-v"))};
   @OriginalMember(
      owner = "client!nha",
      name = "c",
      descriptor = "C"
   )
   public char field4886;
   @OriginalMember(
      owner = "client!nha",
      name = "k",
      descriptor = "C"
   )
   public char field4900;
   @OriginalMember(
      owner = "client!nha",
      name = "n",
      descriptor = "I"
   )
   public static int field4885;
   @OriginalMember(
      owner = "client!nha",
      name = "l",
      descriptor = "I"
   )
   private int field4888;
   @OriginalMember(
      owner = "client!nha",
      name = "m",
      descriptor = "I"
   )
   public static int field4890;
   @OriginalMember(
      owner = "client!nha",
      name = "s",
      descriptor = "I"
   )
   public static int field4891;
   @OriginalMember(
      owner = "client!nha",
      name = "p",
      descriptor = "I"
   )
   public static int field4892;
   @OriginalMember(
      owner = "client!nha",
      name = "h",
      descriptor = "I"
   )
   public static int field4893;
   @OriginalMember(
      owner = "client!nha",
      name = "j",
      descriptor = "I"
   )
   public static int field4894;
   @OriginalMember(
      owner = "client!nha",
      name = "i",
      descriptor = "I"
   )
   public static int field4895;
   @OriginalMember(
      owner = "client!nha",
      name = "q",
      descriptor = "I"
   )
   private int field4896;
   @OriginalMember(
      owner = "client!nha",
      name = "e",
      descriptor = "I"
   )
   public static int field4898;
   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "I"
   )
   public static int field4899;
   @OriginalMember(
      owner = "client!nha",
      name = "d",
      descriptor = "I"
   )
   public static int field4901;
   @OriginalMember(
      owner = "client!nha",
      name = "g",
      descriptor = "I"
   )
   public static int field4902;
   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "I"
   )
   public static int field4903;
   @OriginalMember(
      owner = "client!nha",
      name = "r",
      descriptor = "Ldia;"
   )
   private class245 field4889;
   @OriginalMember(
      owner = "client!nha",
      name = "o",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field4897;

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Z"
   )
   public final boolean method2706(String arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field4890;
         if (this.field4897 == null) {
            return false;
         } else {
            if (this.field4889 == null) {
               this.method2711(true);
            }

            class299 var4 = (class299)this.field4889.method1839(-114, class282.method2150(57, arg0));
            if (var3) {
               if (var4.field3951.equals(arg0)) {
                  return true;
               }

               var4 = (class299)this.field4889.method1844(false);
            }

            while(true) {
               byte var10000;
               if (var4 == null) {
                  var10000 = arg1;
                  if (!var3) {
                     if (arg1 <= 68) {
                        this.method2709((class594)null, false);
                     }

                     return false;
                  }
               } else {
                  var10000 = var4.field3951.equals(arg0);
               }

               if (var10000 != 0) {
                  return true;
               }

               var4 = (class299)this.field4889.method1844(false);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4904[8] + (arg0 != null ? field4904[5] : field4904[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(III)Lfg;"
   )
   public static final class138 method2707(int arg0, int arg1, int arg2) {
      try {
         ++field4894;
         class138 var3 = new class138();
         var3.field1785 = -1;
         var3.field1790 = -1;
         var3.field1801 = arg2 + 5 + 1;
         var3.field1806 = arg1 - -5 + 1;
         if (arg0 != -2) {
            return null;
         } else {
            var3.field1807 = new int[var3.field1806][var3.field1801];
            var3.method1158((byte)-116);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4904[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2708(int arg0) {
      try {
         if (arg0 != -1) {
            return 32;
         } else {
            ++field4892;
            return this.field4896;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4904[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Lwm;Z)V"
   )
   public final void method2709(class594 arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         while(true) {
            int var4 = arg0.method4288((byte)80);
            if (~var4 != -1) {
               this.method2712(arg0, 115, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field4885;
            break;
         }

         if (!arg1) {
            this.field4889 = null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4904[6] + (arg0 != null ? field4904[5] : field4904[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "(II)Z"
   )
   public final boolean method2710(int arg0, int arg1) {
      try {
         ++field4891;
         if (this.field4897 == null) {
            return false;
         } else {
            if (this.field4889 == null) {
               this.method2714(-126);
            }

            if (arg0 != 1323) {
               this.field4896 = 53;
            }

            class144 var3 = (class144)this.field4889.method1839(-2, (long)arg1);
            return var3 != null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4904[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Z)V"
   )
   private final void method2711(boolean arg0) {
      boolean var2 = client.field4273;

      try {
         label69: {
            if (!(this.field4897 instanceof class245)) {
               String[] var3 = (String[])this.field4897;
               this.field4889 = new class245(class546.method3944(10, var3.length));
               int var4 = 0;
               class299 var5;
               if (var2) {
                  if (var3[var4] != null) {
                     var5 = new class299(var3[var4], var4);
                     this.field4889.method1841(class282.method2150(65, var3[var4]), true, var5);
                  }

                  ++var4;
               }

               while(true) {
                  while(var3.length > var4) {
                     if (var3[var4] != null) {
                        var5 = new class299(var3[var4], var4);
                        this.field4889.method1841(class282.method2150(65, var3[var4]), true, var5);
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

            class245 var6 = (class245)this.field4897;
            this.field4889 = new class245(var6.method1845(-1));
            class154 var7 = (class154)var6.method1850(0);
            if (var2 || var7 != null) {
               do {
                  class299 var8 = new class299(var7.field1990, (int)var7.field6862);
                  this.field4889.method1841(class282.method2150(61, var7.field1990), true, var8);
                  var7 = (class154)var6.method1847(124);
               } while(var7 != null);
            }
         }

         ++field4901;
         if (!arg0) {
            this.method2715(-121, 55);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4904[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   private final void method2712(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label129: {
            if (~arg2 == -2) {
               this.field4886 = class90.method855(arg0.method4340(409855200), (byte)-85);
               if (!var4) {
                  break label129;
               }
            }

            if (~arg2 != -3) {
               if (arg2 == 3) {
                  this.field4887 = arg0.method4291(-49);
                  if (!var4) {
                     break label129;
                  }
               }

               if (arg2 == 4) {
                  this.field4888 = arg0.method4302(true);
                  if (!var4) {
                     break label129;
                  }
               }

               if (~arg2 != -6 && arg2 != 6) {
                  if (arg2 == 7) {
                     int var5 = arg0.method4280(-19104);
                     this.field4896 = arg0.method4280(-19104);
                     String[] var6 = new String[var5];
                     int var7 = 0;
                     if (var4 || ~this.field4896 < ~var7) {
                        do {
                           int var8 = arg0.method4280(-19104);
                           var6[var8] = arg0.method4291(-105);
                           ++var7;
                        } while(~this.field4896 < ~var7);
                     }

                     this.field4897 = var6;
                     if (!var4) {
                        break label129;
                     }
                  }

                  if (~arg2 != -9) {
                     break label129;
                  }

                  int var9 = arg0.method4280(-19104);
                  this.field4896 = arg0.method4280(-19104);
                  Integer[] var10 = new Integer[var9];
                  int var11 = 0;
                  if (!var4 && ~this.field4896 >= ~var11) {
                     this.field4897 = var10;
                     if (!var4) {
                        break label129;
                     }
                  } else {
                     while(true) {
                        int var12 = arg0.method4280(-19104);
                        var10[var12] = new Integer(arg0.method4302(true));
                        ++var11;
                        if (~this.field4896 >= ~var11) {
                           this.field4897 = var10;
                           if (!var4) {
                              break label129;
                           }
                           break;
                        }
                     }
                  }
               }

               this.field4896 = arg0.method4280(-19104);
               class245 var13 = new class245(class546.method3944(10, this.field4896));
               int var14 = 0;
               if (var4 || ~this.field4896 < ~var14) {
                  do {
                     int var15 = arg0.method4302(true);
                     class144 var20;
                     if (~arg2 == -6) {
                        class154 var16 = new class154(arg0.method4291(-62));
                        if (var4) {
                           var20 = new class144(arg0.method4302(true));
                           var13.method1841((long)var15, true, var20);
                           ++var14;
                        } else {
                           var13.method1841((long)var15, true, var16);
                           ++var14;
                        }
                     } else {
                        var20 = new class144(arg0.method4302(true));
                        var13.method1841((long)var15, true, var20);
                        ++var14;
                     }
                  } while(~this.field4896 < ~var14);
               }

               this.field4897 = var13;
               if (!var4) {
                  break label129;
               }
            }

            this.field4900 = class90.method855(arg0.method4340(409855200), (byte)106);
         }

         int var17 = 68 / (arg1 / 60);
         ++field4898;
      } catch (RuntimeException var19) {
         throw class534.method3846(var19, field4904[12] + (arg0 != null ? field4904[5] : field4904[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2713(byte arg0) {
      boolean var1 = client.field4273;

      try {
         class383.method2943(false, class602.field8398);
         int var2 = 28 % ((23 - arg0) / 54);
         ++field4895;
         ++class624.field8710;
         if (class89.field1134 && class565.field7705) {
            int var3 = 0;
            int var4 = 0;
            if (class775.field11283) {
               var3 = class101.method916(-115);
               var4 = class291.method2190(96);
            }

            int var5 = class242.field3026.method1581(69) - -var3;
            int var6 = class242.field3026.method1572(false) + var4;
            int var7 = var6 - class508.field7039;
            int var8 = var5 - class670.field9552;
            if (var8 < class527.field7209) {
               var8 = class527.field7209;
            }

            if (class527.field7209 + class611.field8543.field9379 < class602.field8398.field9379 + var8) {
               var8 = class527.field7209 + class611.field8543.field9379 + -class602.field8398.field9379;
            }

            if (~var7 > ~class299.field3955) {
               var7 = class299.field3955;
            }

            if (~(class299.field3955 + class611.field8543.field9360) > ~(class602.field8398.field9360 + var7)) {
               var7 = class299.field3955 - (-class611.field8543.field9360 + class602.field8398.field9360);
            }

            int var9 = -class527.field7209 + var8 + class611.field8543.field9271;
            int var10 = -class299.field3955 + var7 + class611.field8543.field9255;
            if (!class242.field3026.method3930(-85)) {
               label115: {
                  if (!class120.field1475) {
                     if (~class196.field2377 != -2 && !class481.method3505(9611) || ~class234.field2899 >= -3) {
                        if (!class621.method4517((byte)-64)) {
                           break label115;
                        }

                        class283.method2154(false, class742.field10815 + class508.field7039, class768.field11079 + class670.field9552);
                        if (!var1) {
                           break label115;
                        }
                     }

                     class283.method2154(false, class508.field7039 - -class742.field10815, class768.field11079 + class670.field9552);
                     if (!var1) {
                        break label115;
                     }
                  }

                  class239.method1790(82);
                  if (class602.field8398.field9294 != null) {
                     class589 var11 = new class589();
                     var11.field8110 = class602.field8398;
                     var11.field8117 = var9;
                     var11.field8116 = class602.field8398.field9294;
                     var11.field8114 = var10;
                     var11.field8124 = class481.field6644;
                     class16.method121(var11);
                  }

                  if (class481.field6644 != null && client.method2409(class602.field8398) != null) {
                     class4.method23(class481.field6644, class602.field8398, 0);
                  }
               }

               class602.field8398 = null;
            } else {
               if (class624.field8710 > class602.field8398.field9268) {
                  int var12 = -class768.field11079 + var8;
                  int var13 = -class742.field10815 + var7;
                  if (class602.field8398.field9223 < var12 || ~(-class602.field8398.field9223) < ~var12 || class602.field8398.field9223 < var13 || ~(-class602.field8398.field9223) < ~var13) {
                     class120.field1475 = true;
                  }
               }

               if (class602.field8398.field9292 != null && class120.field1475) {
                  class589 var14 = new class589();
                  var14.field8110 = class602.field8398;
                  var14.field8117 = var9;
                  var14.field8116 = class602.field8398.field9292;
                  var14.field8114 = var10;
                  class16.method121(var14);
               }
            }
         } else {
            if (~class624.field8710 < -2) {
               class602.field8398 = null;
            }

         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field4904[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method2714(int arg0) {
      boolean var2 = client.field4273;

      try {
         label69: {
            if (!(this.field4897 instanceof class245)) {
               Integer[] var3 = (Integer[])this.field4897;
               this.field4889 = new class245(class546.method3944(10, var3.length));
               int var4 = 0;
               class144 var5;
               if (var2) {
                  if (var3[var4] != null) {
                     var5 = new class144(var4);
                     this.field4889.method1841((long)var3[var4], true, var5);
                  }

                  ++var4;
               }

               while(true) {
                  while(var3.length > var4) {
                     if (var3[var4] != null) {
                        var5 = new class144(var4);
                        this.field4889.method1841((long)var3[var4], true, var5);
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

            class245 var6 = (class245)this.field4897;
            this.field4889 = new class245(var6.method1845(-1));
            class144 var7 = (class144)var6.method1850(0);
            if (var2 || var7 != null) {
               do {
                  class144 var8 = new class144((int)var7.field6862);
                  this.field4889.method1841((long)var7.field1905, true, var8);
                  var7 = (class144)var6.method1847(126);
               } while(var7 != null);
            }
         }

         ++field4903;
         if (arg0 >= -88) {
            this.field4897 = null;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4904[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public final String method2715(int arg0, int arg1) {
      try {
         ++field4893;
         if (this.field4897 == null) {
            return this.field4887;
         } else {
            if (arg1 != -6) {
               this.field4887 = null;
            }

            if (!(this.field4897 instanceof class245)) {
               String[] var3 = (String[])this.field4897;
               if (arg0 >= 0 && ~var3.length < ~arg0) {
                  String var4 = var3[arg0];
                  return var4 != null ? var4 : this.field4887;
               } else {
                  return this.field4887;
               }
            } else {
               class154 var5 = (class154)((class245)this.field4897).method1839(arg1 ^ 117, (long)arg0);
               return var5 != null ? var5.field1990 : this.field4887;
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4904[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method2716(byte arg0, int arg1) {
      try {
         int var3 = -14 % ((arg0 - 54) / 62);
         ++field4902;
         if (this.field4897 == null) {
            return this.field4888;
         } else if (this.field4897 instanceof class245) {
            class144 var4 = (class144)((class245)this.field4897).method1839(-117, (long)arg1);
            return var4 != null ? var4.field1905 : this.field4888;
         } else {
            Integer[] var5 = (Integer[])this.field4897;
            if (arg1 >= 0 && var5.length > arg1) {
               Integer var6 = var5[arg1];
               return var6 != null ? var6 : this.field4888;
            } else {
               return this.field4888;
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4904[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2717(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2718(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
