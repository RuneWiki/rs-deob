import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class342 {
   @OriginalMember(
      owner = "client!nha",
      name = "c",
      descriptor = "Loe;"
   )
   private class214 field4639 = null;
   @OriginalMember(
      owner = "client!nha",
      name = "k",
      descriptor = "Loe;"
   )
   private class214 field4636 = null;
   @OriginalMember(
      owner = "client!nha",
      name = "h",
      descriptor = "I"
   )
   private int field4649 = 65000;
   @OriginalMember(
      owner = "client!nha",
      name = "g",
      descriptor = "I"
   )
   private int field4646;
   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4652 = new String[]{method2515(method2514("6\"uf1p")), method2515(method2514("#d:f\b")), method2515(method2514("6\"uf6p")), method2515(method2514("6?x$")), method2515(method2514("\u001b+w \u0010b")), method2515(method2514("6\"uf\u00017\u0019`:\u001c6-<")), method2515(method2514("6\"uf4p")), method2515(method2514("6\"uf2p")), method2515(method2514("6\"ufI1$}<Kp")), method2515(method2514("6\"uf3p")), method2515(method2514("6\"uf7p")), method2515(method2514("6\"uf0p")), method2515(method2514("6\"uf=p"))};
   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "I"
   )
   public static int field4637;
   @OriginalMember(
      owner = "client!nha",
      name = "j",
      descriptor = "I"
   )
   public static int field4640;
   @OriginalMember(
      owner = "client!nha",
      name = "l",
      descriptor = "I"
   )
   public static int field4641;
   @OriginalMember(
      owner = "client!nha",
      name = "e",
      descriptor = "I"
   )
   public static int field4642;
   @OriginalMember(
      owner = "client!nha",
      name = "i",
      descriptor = "I"
   )
   public static int field4644;
   @OriginalMember(
      owner = "client!nha",
      name = "m",
      descriptor = "I"
   )
   public static int field4645;
   @OriginalMember(
      owner = "client!nha",
      name = "d",
      descriptor = "I"
   )
   public static int field4647;
   @OriginalMember(
      owner = "client!nha",
      name = "p",
      descriptor = "I"
   )
   public static int field4648;
   @OriginalMember(
      owner = "client!nha",
      name = "f",
      descriptor = "I"
   )
   public static int field4650;
   @OriginalMember(
      owner = "client!nha",
      name = "o",
      descriptor = "I"
   )
   public static int field4651;
   @OriginalMember(
      owner = "client!nha",
      name = "b",
      descriptor = "Lkf;"
   )
   public static class266 field4638;
   @OriginalMember(
      owner = "client!nha",
      name = "n",
      descriptor = "[[Lgt;"
   )
   public static class483[][] field4643;

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(ZII[BI)Z",
      line = 3
   )
   private final boolean method2506(boolean param1, int param2, int param3, byte[] param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(Ljava/lang/String;IZI)V",
      line = 127
   )
   public static final void method2507(String arg0, int arg1, boolean arg2, int arg3) {
      try {
         class311.method2299(-127);
         ++field4640;
         if (~arg1 == -1) {
            class383.field5543 = class182.method1445(2 * class300.field4107.field6421.method3555(116), 0, class387.field5601, class271.field3742, class557.field7990, true);
            if (arg0 != null) {
               class383.field5543.method495(0);
               class206 var13 = class31.method278(class351.field4726, 2780, class487.field6954, 0);
               class67 var14 = class383.field5543.method502(var13, class439.method3237(class281.field3904, class351.field4726, 0), true);
               class123.method994((byte)-15);
               class626.method4545(class383.field5543, true, var13, 2, arg0, var14);
            }
         } else {
            class66 var4 = null;
            if (arg0 != null) {
               var4 = class182.method1445(0, 0, class387.field5601, class271.field3742, class557.field7990, true);
               var4.method495(0);
               class206 var5 = class31.method278(class351.field4726, arg3 ^ 2780, class487.field6954, 0);
               class67 var6 = var4.method502(var5, class439.method3237(class281.field3904, class351.field4726, 0), true);
               class123.method994((byte)-15);
               class626.method4545(var4, true, var5, 2, arg0, var6);
            }

            boolean var26 = false;

            label251: {
               try {
                  var26 = true;
                  class383.field5543 = class182.method1445(class300.field4107.field6421.method3555(arg3 + 89) * 2, arg1, class387.field5601, class271.field3742, class557.field7990, true);
                  if (arg0 != null) {
                     var4.method495(0);
                     class206 var7 = class31.method278(class351.field4726, 2780, class487.field6954, 0);
                     class67 var8 = var4.method502(var7, class439.method3237(class281.field3904, class351.field4726, 0), true);
                     class123.method994((byte)-15);
                     class626.method4545(var4, true, var7, arg3 + 2, arg0, var8);
                  }

                  if (class383.field5543.method508()) {
                     boolean var9 = true;

                     try {
                        var9 = ~class169.field2360.field1162 < -257;
                     } catch (Throwable var30) {
                     }

                     class438 var10;
                     label231: {
                        if (var9) {
                           var10 = class383.field5543.method594(146800640);
                           if (!client.field4360) {
                              break label231;
                           }
                        }

                        var10 = class383.field5543.method594(104857600);
                     }

                     class383.field5543.method614(var10);
                     var26 = false;
                  } else {
                     var26 = false;
                  }
                  break label251;
               } catch (Throwable var31) {
                  int var11 = class300.field4107.field6419.method391(-12);
                  if (~var11 == -3) {
                     class380.field5468 = true;
                  }

                  class300.field4107.method3301(25349, class300.field4107.field6419, 0);
                  method2507(arg0, var11, arg2, arg3);
                  Object var10000 = null;
                  var26 = false;
               } finally {
                  if (var26) {
                     Object var18 = null;
                     if (var4 != null) {
                        try {
                           var4.method567((byte)-69);
                        } catch (Throwable var28) {
                        }
                     }

                  }
               }

               if (var4 != null) {
                  try {
                     var4.method567((byte)-69);
                  } catch (Throwable var27) {
                  }
               }

               return;
            }

            Object var17 = null;
            if (var4 != null) {
               try {
                  var4.method567((byte)-69);
               } catch (Throwable var29) {
               }
            }
         }

         class300.field4107.field6419.method388(-12062, !arg2);
         class300.field4107.method3301(arg3 + 25349, class300.field4107.field6419, arg1);
         class258.method1969(false);
         class383.field5543.method604(10000);
         class383.field5543.method587(32);
         class89.field1160 = class383.field5543.method596();
         class405.field5861 = class383.field5543.method596();
         class352.method2568(0);
         class383.field5543.method516(~class300.field4107.field6422.method5534(82) == -2);
         if (class383.field5543.method511()) {
            class137.method1087(class300.field4107.field6450.method5375(88) == 1, arg3);
         }

         class426.method3157(5174, class644.field9403 >> 3, class337.field4594 >> 3, class383.field5543);
         class85.method760(arg3);
         class101.field1292 = true;
         class539.field7710 = false;
         class746.field10946 = null;
         class217.method1712(28041);
      } catch (RuntimeException var33) {
         throw class237.method1823(var33, field4652[12] + (arg0 != null ? field4652[1] : field4652[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(II[BZ)Z",
      line = 244
   )
   public final boolean method2508(int arg0, int arg1, byte[] arg2, boolean arg3) {
      try {
         ++field4648;
         class214 var5 = this.field4636;
         synchronized(this.field4636) {
            if (arg1 >= 0 && this.field4649 >= arg1) {
               boolean var6 = this.method2506(true, 127, arg0, arg2, arg1);
               if (arg3) {
                  return true;
               } else {
                  if (!var6) {
                     var6 = this.method2506(false, 126, arg0, arg2, arg1);
                  }

                  return var6;
               }
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field4652[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4652[1] : field4652[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(IB)V",
      line = 269
   )
   public static final void method2509(int arg0, byte arg1) {
      try {
         if (arg1 <= 46) {
            field4643 = null;
         }

         ++field4637;
         class699 var2 = (class699)class148.field1935.method329((byte)-91, (long)arg0);
         if (var2 != null) {
            var2.field10230.method4673(false);
            class542.method3900(var2.field10231, var2.field10227, -106);
            var2.method3165(113);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4652[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(BI)Z",
      line = 289
   )
   public static final boolean method2510(byte arg0, int arg1) {
      try {
         ++field4650;
         int var2 = 255 & arg0;
         if (var2 == 0) {
            return false;
         } else {
            return arg1 < ~var2 || ~var2 <= -161 || ~class361.field4923[var2 + -128] != -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4652[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(IIIII)V",
      line = 311
   )
   public static final void method2511(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4641;
         int var5 = class81.field1061;
         if (arg1 < -57) {
            int var6 = class481.field6892;
            if (class681.field10034) {
               var5 += class85.method755((byte)89);
               var6 += class592.method4305((byte)127);
            }

            if (class600.field8819 == 1) {
               class492 var7 = class264.field3636[class618.field9107 / 100];
               var7.method3575(var5 - 8, var6 + -8);
               class193.method1520(var6 + -8, -121, -8 + (var6 - -var7.method957()), var7.method960() + var5 + -8, var5 + -8);
            }

            if (class600.field8819 == 2) {
               class492 var8 = class264.field3636[class618.field9107 / 100 + 4];
               var8.method3575(var5 + -8, var6 + -8);
               class193.method1520(var6 + -8, -124, -8 + (var6 - -var8.method957()), var5 - (8 - var8.method960()), var5 + -8);
            }

            class592.method4302(-46);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field4652[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(I)V",
      line = 355
   )
   public static void method2512(int arg0) {
      try {
         field4643 = null;
         if (arg0 != 0) {
            field4638 = null;
         }

         field4638 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4652[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "<init>",
      descriptor = "(ILoe;Loe;I)V",
      line = 471
   )
   public class342(int arg0, class214 arg1, class214 arg2, int arg3) {
      try {
         this.field4646 = arg0;
         this.field4649 = arg3;
         this.field4636 = arg1;
         this.field4639 = arg2;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4652[8] + arg0 + ',' + (arg1 != null ? field4652[1] : field4652[3]) + ',' + (arg2 != null ? field4652[1] : field4652[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "a",
      descriptor = "(ZI)[B",
      line = 370
   )
   public final byte[] method2513(boolean arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field4642;
         class214 var4 = this.field4636;
         synchronized(this.field4636) {
            try {
               if (~((long)(arg1 * 6 - -6)) < ~this.field4639.method1691(5640)) {
                  return null;
               } else {
                  this.field4639.method1686(true, (long)(arg1 * 6));
                  this.field4639.method1687(6, class227.field3211, 0, 0);
                  int var6 = ((255 & class227.field3211[0]) << 16) - (-((class227.field3211[1] & 255) << 8) + -(255 & class227.field3211[2]));
                  int var7 = (255 & class227.field3211[5]) + ((class227.field3211[4] & 255) << 8) + (16711680 & class227.field3211[3] << 16);
                  if (var6 >= 0 && this.field4649 >= var6) {
                     if (~var7 < -1 && ~((long)var7) >= ~(this.field4636.method1691(5640) / 520L)) {
                        byte[] var10 = new byte[var6];
                        int var11 = 0;
                        if (!arg0) {
                           this.field4646 = 67;
                        }

                        int var12 = 0;
                        if (var3) {
                           if (~var7 == -1) {
                              return null;
                           }

                           this.field4636.method1686(true, (long)(var7 * 520));
                        } else if (var11 >= var6) {
                           if (!var3) {
                              return var10;
                           }
                        } else {
                           if (~var7 == -1) {
                              return null;
                           }

                           this.field4636.method1686(true, (long)(var7 * 520));
                        }

                        while(true) {
                           int var14 = var6 - var11;
                           if (var14 > 512) {
                              var14 = 512;
                           }

                           this.field4636.method1687(var14 + 8, class227.field3211, 0, 0);
                           int var15 = ((255 & class227.field3211[0]) << 8) + (255 & class227.field3211[1]);
                           int var16 = (65280 & class227.field3211[2] << 8) + (class227.field3211[3] & 255);
                           int var17 = (65280 & class227.field3211[5] << 8) + ((class227.field3211[4] & 255) << 16) + (class227.field3211[6] & 255);
                           int var18 = class227.field3211[7] & 255;
                           if (~arg1 != ~var15 || ~var12 != ~var16 || ~this.field4646 != ~var18) {
                              return null;
                           }

                           if (var17 < 0 || ~((long)var17) < ~(this.field4636.method1691(5640) / 520L)) {
                              return null;
                           }

                           ++var12;
                           int var21 = 0;
                           if (var3) {
                              var10[var11++] = class227.field3211[var21 + 8];
                              ++var21;
                           }

                           while(var14 > var21) {
                              var10[var11++] = class227.field3211[var21 + 8];
                              ++var21;
                           }

                           if (var11 >= var6) {
                              if (!var3) {
                                 return var10;
                              }
                           } else {
                              if (~var17 == -1) {
                                 return null;
                              }

                              this.field4636.method1686(true, (long)(var17 * 520));
                           }
                        }
                     } else {
                        return null;
                     }
                  } else {
                     return null;
                  }
               }
            } catch (IOException var41) {
               return null;
            }
         }
      } catch (RuntimeException var43) {
         throw class237.method1823(var43, field4652[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 454
   )
   public final String toString() {
      try {
         ++field4644;
         return field4652[4] + this.field4646;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4652[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2514(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2515(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
