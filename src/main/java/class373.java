import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class373 {
   @OriginalMember(
      owner = "client!tc",
      name = "k",
      descriptor = "Ltv;"
   )
   private class590 field5259 = new class590(64);
   @OriginalMember(
      owner = "client!tc",
      name = "b",
      descriptor = "Lqh;"
   )
   private class74 field5254;
   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5262 = new String[]{method2895(method2894("-\u000b\u0002\u0011\u001c")), method2895(method2894("-\u000b\u0002\u0013\u001c")), method2895(method2894("-\u000b\u0002\u0012\u001c")), method2895(method2894("-\u000b\u0002\u0016\u001c")), method2895(method2894("-\u000b\u0002\u0010\u001c")), method2895(method2894("-\u000b\u0002\u0017\u001c")), method2895(method2894("7\u001d@8")), method2895(method2894("\"F\u0002zI")), method2895(method2894("-\u000b\u0002h]7\u0001Xj\u001c")), method2895(method2894("-\u000b\u0002\u0015\u001c"))};
   @OriginalMember(
      owner = "client!tc",
      name = "h",
      descriptor = "I"
   )
   public static int field5261 = -2;
   @OriginalMember(
      owner = "client!tc",
      name = "i",
      descriptor = "I"
   )
   public static int field5251;
   @OriginalMember(
      owner = "client!tc",
      name = "j",
      descriptor = "I"
   )
   public static int field5252;
   @OriginalMember(
      owner = "client!tc",
      name = "g",
      descriptor = "I"
   )
   public static int field5253;
   @OriginalMember(
      owner = "client!tc",
      name = "f",
      descriptor = "I"
   )
   public static int field5255;
   @OriginalMember(
      owner = "client!tc",
      name = "d",
      descriptor = "I"
   )
   public static int field5256;
   @OriginalMember(
      owner = "client!tc",
      name = "e",
      descriptor = "I"
   )
   public static int field5257;
   @OriginalMember(
      owner = "client!tc",
      name = "c",
      descriptor = "I"
   )
   public static int field5258;
   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "I"
   )
   public static int field5260;

   @OriginalMember(
      owner = "client!tc",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2887(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field5252;
         short var2 = 1024;
         short var3 = 3072;
         if (class33.field392) {
            if (class624.field8717) {
               var2 = 2048;
            }

            var3 = 4096;
         }

         if ((float)var2 > class676.field9918) {
            class676.field9918 = (float)var2;
         }

         if ((float)var3 < class676.field9918) {
            class676.field9918 = (float)var3;
            if (var1) {
               class363.field5142 -= 16384.0F;
            }
         }

         while(class363.field5142 >= 16384.0F) {
            class363.field5142 -= 16384.0F;
         }

         if (var1) {
            class363.field5142 += 16384.0F;
         }

         while(class363.field5142 < 0.0F) {
            class363.field5142 += 16384.0F;
         }

         int var4 = class109.field1383 >> 9;
         int var5 = class682.field10004 >> 9;
         if (arg0 >= -99) {
            field5253 = 27;
         }

         int var6 = class687.method5016(class109.field1383, class239.field2981, class682.field10004, 2);
         int var7 = 0;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var10000;
         if (var4 > 3) {
            if (~var5 < -4) {
               if (~var4 > ~(class507.field7030 + -4)) {
                  if (class215.field2667 - 4 > var5) {
                     var8 = var4 + -4;
                     if (var1) {
                        var9 = var5 + -4;
                        if (var1) {
                           var10 = class239.field2981;
                           if (~var10 > -4 && class407.method3090(var8, 1, var9)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class620.field8662.field10142 != null && class620.field8662.field10142[var10] != null) {
                              var11 = (class620.field8662.field10142[var10][var8][var9] & 255) * 8 << 2;
                           }

                           if (class93.field1241 != null && class93.field1241[var10] != null) {
                              var12 = -class93.field1241[var10].method2221(false, var9, var8) - -var11 + var6;
                              if (var12 > var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     } else if (~var8 < ~(var4 - -4)) {
                        var8 = (var7 >> 2) * 1536;
                        var10000 = ~var8;
                        if (!var1) {
                           if (var10000 < -786433) {
                              var8 = 786432;
                           }

                           if (var8 < 262144) {
                              var8 = 262144;
                           }

                           if (~var8 < ~class524.field7180) {
                              class524.field7180 += (-class524.field7180 + var8) / 24;
                              return;
                           }

                           if (class524.field7180 > var8) {
                              class524.field7180 += (-class524.field7180 + var8) / 80;
                              return;
                           }

                           return;
                        }

                        var9 = var10000 + -786433;
                        if (var1) {
                           var10 = class239.field2981;
                           if (~var10 > -4 && class407.method3090(var8, 1, var9)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class620.field8662.field10142 != null && class620.field8662.field10142[var10] != null) {
                              var11 = (class620.field8662.field10142[var10][var8][var9] & 255) * 8 << 2;
                           }

                           if (class93.field1241 != null && class93.field1241[var10] != null) {
                              var12 = -class93.field1241[var10].method2221(false, var9, var8) - -var11 + var6;
                              if (var12 > var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     } else {
                        var9 = var5 + -4;
                        if (var1) {
                           var10 = class239.field2981;
                           if (~var10 > -4 && class407.method3090(var8, 1, var9)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class620.field8662.field10142 != null && class620.field8662.field10142[var10] != null) {
                              var11 = (class620.field8662.field10142[var10][var8][var9] & 255) * 8 << 2;
                           }

                           if (class93.field1241 != null && class93.field1241[var10] != null) {
                              var12 = -class93.field1241[var10].method2221(false, var9, var8) - -var11 + var6;
                              if (var12 > var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     }
                  } else {
                     var8 = (var7 >> 2) * 1536;
                     var10000 = ~var8;
                     if (!var1) {
                        if (var10000 < -786433) {
                           var8 = 786432;
                        }

                        if (var8 < 262144) {
                           var8 = 262144;
                        }

                        if (~var8 < ~class524.field7180) {
                           class524.field7180 += (-class524.field7180 + var8) / 24;
                           return;
                        }

                        if (class524.field7180 > var8) {
                           class524.field7180 += (-class524.field7180 + var8) / 80;
                           return;
                        }

                        return;
                     }

                     var9 = var10000 + -786433;
                     if (var1) {
                        var10 = class239.field2981;
                        if (~var10 > -4 && class407.method3090(var8, 1, var9)) {
                           ++var10;
                        }

                        var11 = 0;
                        if (class620.field8662.field10142 != null && class620.field8662.field10142[var10] != null) {
                           var11 = (class620.field8662.field10142[var10][var8][var9] & 255) * 8 << 2;
                        }

                        if (class93.field1241 != null && class93.field1241[var10] != null) {
                           var12 = -class93.field1241[var10].method2221(false, var9, var8) - -var11 + var6;
                           if (var12 > var7) {
                              var7 = var12;
                           }
                        }

                        ++var9;
                     }
                  }
               } else {
                  var8 = (var7 >> 2) * 1536;
                  var10000 = ~var8;
                  if (!var1) {
                     if (var10000 < -786433) {
                        var8 = 786432;
                     }

                     if (var8 < 262144) {
                        var8 = 262144;
                     }

                     if (~var8 < ~class524.field7180) {
                        class524.field7180 += (-class524.field7180 + var8) / 24;
                        return;
                     }

                     if (class524.field7180 > var8) {
                        class524.field7180 += (-class524.field7180 + var8) / 80;
                        return;
                     }

                     return;
                  }

                  var9 = var10000 + -786433;
                  if (var1) {
                     var10 = class239.field2981;
                     if (~var10 > -4 && class407.method3090(var8, 1, var9)) {
                        ++var10;
                     }

                     var11 = 0;
                     if (class620.field8662.field10142 != null && class620.field8662.field10142[var10] != null) {
                        var11 = (class620.field8662.field10142[var10][var8][var9] & 255) * 8 << 2;
                     }

                     if (class93.field1241 != null && class93.field1241[var10] != null) {
                        var12 = -class93.field1241[var10].method2221(false, var9, var8) - -var11 + var6;
                        if (var12 > var7) {
                           var7 = var12;
                        }
                     }

                     ++var9;
                  }
               }
            } else {
               var8 = (var7 >> 2) * 1536;
               var10000 = ~var8;
               if (!var1) {
                  if (var10000 < -786433) {
                     var8 = 786432;
                  }

                  if (var8 < 262144) {
                     var8 = 262144;
                  }

                  if (~var8 < ~class524.field7180) {
                     class524.field7180 += (-class524.field7180 + var8) / 24;
                     return;
                  }

                  if (class524.field7180 > var8) {
                     class524.field7180 += (-class524.field7180 + var8) / 80;
                     return;
                  }

                  return;
               }

               var9 = var10000 + -786433;
               if (var1) {
                  var10 = class239.field2981;
                  if (~var10 > -4 && class407.method3090(var8, 1, var9)) {
                     ++var10;
                  }

                  var11 = 0;
                  if (class620.field8662.field10142 != null && class620.field8662.field10142[var10] != null) {
                     var11 = (class620.field8662.field10142[var10][var8][var9] & 255) * 8 << 2;
                  }

                  if (class93.field1241 != null && class93.field1241[var10] != null) {
                     var12 = -class93.field1241[var10].method2221(false, var9, var8) - -var11 + var6;
                     if (var12 > var7) {
                        var7 = var12;
                     }
                  }

                  ++var9;
               }
            }
         } else {
            var8 = (var7 >> 2) * 1536;
            var10000 = ~var8;
            if (!var1) {
               if (var10000 < -786433) {
                  var8 = 786432;
               }

               if (var8 < 262144) {
                  var8 = 262144;
               }

               if (~var8 < ~class524.field7180) {
                  class524.field7180 += (-class524.field7180 + var8) / 24;
                  return;
               }

               if (class524.field7180 > var8) {
                  class524.field7180 += (-class524.field7180 + var8) / 80;
                  return;
               }

               return;
            }

            var9 = var10000 + -786433;
            if (var1) {
               var10 = class239.field2981;
               if (~var10 > -4 && class407.method3090(var8, 1, var9)) {
                  ++var10;
               }

               var11 = 0;
               if (class620.field8662.field10142 != null && class620.field8662.field10142[var10] != null) {
                  var11 = (class620.field8662.field10142[var10][var8][var9] & 255) * 8 << 2;
               }

               if (class93.field1241 != null && class93.field1241[var10] != null) {
                  var12 = -class93.field1241[var10].method2221(false, var9, var8) - -var11 + var6;
                  if (var12 > var7) {
                     var7 = var12;
                  }
               }

               ++var9;
            }
         }

         while(true) {
            while(~var9 >= ~(var5 - -4)) {
               var10 = class239.field2981;
               if (~var10 > -4 && class407.method3090(var8, 1, var9)) {
                  ++var10;
               }

               var11 = 0;
               if (class620.field8662.field10142 != null && class620.field8662.field10142[var10] != null) {
                  var11 = (class620.field8662.field10142[var10][var8][var9] & 255) * 8 << 2;
               }

               if (class93.field1241 != null && class93.field1241[var10] != null) {
                  var12 = -class93.field1241[var10].method2221(false, var9, var8) - -var11 + var6;
                  if (var12 > var7) {
                     var7 = var12;
                  }
               }

               ++var9;
            }

            ++var8;
            if (~var8 < ~(var4 - -4)) {
               var8 = (var7 >> 2) * 1536;
               var10000 = ~var8;
               if (!var1) {
                  if (var10000 < -786433) {
                     var8 = 786432;
                  }

                  if (var8 < 262144) {
                     var8 = 262144;
                  }

                  if (~var8 < ~class524.field7180) {
                     class524.field7180 += (-class524.field7180 + var8) / 24;
                     return;
                  }

                  if (class524.field7180 > var8) {
                     class524.field7180 += (-class524.field7180 + var8) / 80;
                     return;
                  }

                  return;
               }

               var9 = var10000 + -786433;
               if (var1) {
                  var10 = class239.field2981;
                  if (~var10 > -4 && class407.method3090(var8, 1, var9)) {
                     ++var10;
                  }

                  var11 = 0;
                  if (class620.field8662.field10142 != null && class620.field8662.field10142[var10] != null) {
                     var11 = (class620.field8662.field10142[var10][var8][var9] & 255) * 8 << 2;
                  }

                  if (class93.field1241 != null && class93.field1241[var10] != null) {
                     var12 = -class93.field1241[var10].method2221(false, var9, var8) - -var11 + var6;
                     if (var12 > var7) {
                        var7 = var12;
                     }
                  }

                  ++var9;
               }
            } else {
               var9 = var5 + -4;
               if (var1) {
                  var10 = class239.field2981;
                  if (~var10 > -4 && class407.method3090(var8, 1, var9)) {
                     ++var10;
                  }

                  var11 = 0;
                  if (class620.field8662.field10142 != null && class620.field8662.field10142[var10] != null) {
                     var11 = (class620.field8662.field10142[var10][var8][var9] & 255) * 8 << 2;
                  }

                  if (class93.field1241 != null && class93.field1241[var10] != null) {
                     var12 = -class93.field1241[var10].method2221(false, var9, var8) - -var11 + var6;
                     if (var12 > var7) {
                        var7 = var12;
                     }
                  }

                  ++var9;
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field5262[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2888(int arg0, int arg1) {
      try {
         class590 var3 = this.field5259;
         synchronized(this.field5259) {
            if (arg1 != 10) {
               return;
            }

            this.field5259.method4234(arg1 ^ 8, arg0);
         }

         ++field5251;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field5262[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2889(int arg0) {
      try {
         ++field5258;
         class590 var2 = this.field5259;
         synchronized(this.field5259) {
            this.field5259.method4245(true);
         }

         if (arg0 != -4) {
            method2887(36);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5262[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(IBJ)Ljava/lang/String;"
   )
   public static final String method2890(int arg0, byte arg1, long arg2) {
      try {
         class621.method4518((byte)-2, arg2);
         ++field5260;
         int var4 = class624.field8714.get(5);
         int var5 = class624.field8714.get(2);
         int var6 = class624.field8714.get(1);
         if (arg0 == 3) {
            return class231.method1750(arg0, -1, arg2);
         } else {
            int var7 = -14 % ((arg1 - 16) / 56);
            return Integer.toString(var4 / 10) + var4 % 10 + "-" + class429.field5981[arg0][var5] + "-" + var6;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field5262[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2891(int arg0) {
      try {
         class590 var2 = this.field5259;
         synchronized(this.field5259) {
            this.field5259.method4244(true);
         }

         if (arg0 != 54) {
            field5261 = -34;
         }

         ++field5256;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5262[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2892(int arg0, int arg1, int arg2) {
      try {
         ++field5255;
         class446 var3 = class635.method4607(118, (long)arg1, arg2);
         var3.method3311(true);
         var3.field6167 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5262[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(IZ)Lah;"
   )
   public final class407 method2893(int arg0, boolean arg1) {
      try {
         ++field5257;
         class590 var3 = this.field5259;
         class407 var4;
         synchronized(this.field5259) {
            var4 = (class407)this.field5259.method4239((long)arg0, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field5254;
            byte[] var6;
            synchronized(this.field5254) {
               var6 = this.field5254.method732(arg0, 54, (byte)121);
            }

            class407 var7 = new class407();
            if (var6 != null) {
               var7.method3087(new class594(var6), (byte)113);
            }

            class590 var8 = this.field5259;
            synchronized(this.field5259) {
               this.field5259.method4238(87, var7, (long)arg0);
            }

            if (!arg1) {
               this.field5259 = null;
            }

            return var7;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field5262[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class373(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field5254 = arg2;
         if (this.field5254 != null) {
            this.field5254.method727(54, -32767);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5262[8] + (arg0 != null ? field5262[7] : field5262[6]) + ',' + arg1 + ',' + (arg2 != null ? field5262[7] : field5262[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2894(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2895(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
