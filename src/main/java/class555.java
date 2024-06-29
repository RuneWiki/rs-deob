import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public abstract class class555 {
   @OriginalMember(
      owner = "client!iba",
      name = "j",
      descriptor = "[B"
   )
   private byte[] field8216;
   @OriginalMember(
      owner = "client!iba",
      name = "q",
      descriptor = "Ljagtheora/ogg/OggSyncState;"
   )
   private OggSyncState field8239;
   @OriginalMember(
      owner = "client!iba",
      name = "n",
      descriptor = "Ljagtheora/ogg/OggPage;"
   )
   private OggPage field8247;
   @OriginalMember(
      owner = "client!iba",
      name = "C",
      descriptor = "Ljagtheora/ogg/OggPacket;"
   )
   private OggPacket field8234;
   @OriginalMember(
      owner = "client!iba",
      name = "r",
      descriptor = "Lwia;"
   )
   private class791 field8240;
   @OriginalMember(
      owner = "client!iba",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8250 = new String[]{method4117(method4116("~w>\\J\\6#_\u000fTy6T\u000fRw0DG]y%Q\u000fT\u007f5BNJo")), method4117(method4116("Rw0DG]y%Q")), method4117(method4116("Qt6\u001e\u0013Qx>D\u0011\u0010")), method4117(method4116("Qt6\u001ed\u0010")), method4117(method4116("Qt6\u001en\u0010")), method4117(method4116("Qt6\u001ec\u0010")), method4117(method4116("Qt6\u001ei\u0010")), method4117(method4116("Qt6\u001e`\u0010")), method4117(method4116("Qt6\u001ek\u0010")), method4117(method4116("Qt6\u001eh\u0010")), method4117(method4116("Vc;\\")), method4117(method4116("C8y\u001eR")), method4117(method4116("Qt6\u001eg\u0010")), method4117(method4116("Qt6\u001eb\u0010")), method4117(method4116("Qt6\u001ef\u0010")), method4117(method4116("Sw#U")), method4117(method4116("Qt6\u001ea\u0010")), method4117(method4116("Qt6\u001e~\u0010")), method4117(method4116("Qt6\u001e\u007f\u0010")), method4117(method4116("Qt6\u001el\u0010")), method4117(method4116("Qt6\u001em\u0010")), method4117(method4116("Qt6\u001ej\u0010")), method4117(method4116("Qt6\u001e}\u0010"))};
   @OriginalMember(
      owner = "client!iba",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field8229 = new int[1];
   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field8221 = new class101(37, -1);
   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field8249 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!iba",
      name = "e",
      descriptor = "I"
   )
   public static int field8217;
   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "I"
   )
   public static int field8218;
   @OriginalMember(
      owner = "client!iba",
      name = "y",
      descriptor = "I"
   )
   public static int field8219;
   @OriginalMember(
      owner = "client!iba",
      name = "H",
      descriptor = "I"
   )
   public static int field8220;
   @OriginalMember(
      owner = "client!iba",
      name = "w",
      descriptor = "I"
   )
   public static int field8223;
   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "I"
   )
   public static int field8224;
   @OriginalMember(
      owner = "client!iba",
      name = "E",
      descriptor = "I"
   )
   public static int field8225;
   @OriginalMember(
      owner = "client!iba",
      name = "h",
      descriptor = "I"
   )
   public static int field8226;
   @OriginalMember(
      owner = "client!iba",
      name = "G",
      descriptor = "I"
   )
   public static int field8227;
   @OriginalMember(
      owner = "client!iba",
      name = "D",
      descriptor = "I"
   )
   public static int field8230;
   @OriginalMember(
      owner = "client!iba",
      name = "d",
      descriptor = "I"
   )
   public static int field8231;
   @OriginalMember(
      owner = "client!iba",
      name = "B",
      descriptor = "I"
   )
   public static int field8232;
   @OriginalMember(
      owner = "client!iba",
      name = "F",
      descriptor = "I"
   )
   public static int field8235;
   @OriginalMember(
      owner = "client!iba",
      name = "v",
      descriptor = "I"
   )
   public static int field8237;
   @OriginalMember(
      owner = "client!iba",
      name = "x",
      descriptor = "I"
   )
   public static int field8238;
   @OriginalMember(
      owner = "client!iba",
      name = "m",
      descriptor = "I"
   )
   public static int field8241;
   @OriginalMember(
      owner = "client!iba",
      name = "s",
      descriptor = "I"
   )
   public static int field8244;
   @OriginalMember(
      owner = "client!iba",
      name = "l",
      descriptor = "Lei;"
   )
   private class189 field8228;
   @OriginalMember(
      owner = "client!iba",
      name = "o",
      descriptor = "Lrm;"
   )
   private class430 field8233;
   @OriginalMember(
      owner = "client!iba",
      name = "p",
      descriptor = "Lpm;"
   )
   private class610 field8222;
   @OriginalMember(
      owner = "client!iba",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   private String field8236;
   @OriginalMember(
      owner = "client!iba",
      name = "t",
      descriptor = "Z"
   )
   private boolean field8242;
   @OriginalMember(
      owner = "client!iba",
      name = "u",
      descriptor = "Z"
   )
   private boolean field8243;
   @OriginalMember(
      owner = "client!iba",
      name = "A",
      descriptor = "Z"
   )
   private boolean field8245;
   @OriginalMember(
      owner = "client!iba",
      name = "k",
      descriptor = "Z"
   )
   private boolean field8246;
   @OriginalMember(
      owner = "client!iba",
      name = "i",
      descriptor = "[[Z"
   )
   public static boolean[][] field8248;

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V",
      line = 9
   )
   public final void method4099(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "(I)V",
      line = 60
   )
   public final void method4100(int arg0) {
      int var2 = client.field4530;

      RuntimeException var10000;
      label38: {
         boolean var10001;
         class537 var3;
         try {
            ++field8235;
            if (this.field8245) {
               return;
            }

            var3 = (class537)this.field8240.method5677((byte)44);
            if (arg0 != 15326) {
               return;
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label38;
         }

         while(true) {
            label33: {
               try {
                  if (var3 != null) {
                     var3.method1467(-25083);
                     var3.field7847.method5403();
                     break label33;
                  }

                  this.field8234.method5403();
                  this.field8247.method5403();
                  this.field8239.method5403();
                  this.field8245 = true;
               } catch (RuntimeException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }

               if (var2 == 0) {
                  return;
               }
            }

            try {
               var3 = (class537)this.field8240.method5671(arg0 + -15299);
            } catch (RuntimeException var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var4 = var10000;
      throw class670.method4877(var4, field8250[8] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!iba",
      name = "g",
      descriptor = "(I)Ljq;",
      line = 89
   )
   private final class537 method4101(int arg0) throws IOException {
      int var2 = client.field4530;

      try {
         ++field8241;
         if (this.field8245) {
            throw new IllegalStateException();
         } else if (this.field8243) {
            return null;
         } else {
            label112:
            while(~this.field8239.pageOut(this.field8247) >= -1) {
               int var3 = this.method1615((byte)123, this.field8216);

               do {
                  if (~var3 == 0) {
                     this.field8243 = true;
                     return null;
                  }

                  if (var3 == 0) {
                     return null;
                  }

                  if (this.field8239.write(this.field8216, var3)) {
                     continue label112;
                  }
               } while(var2 != 0);

               throw new RuntimeException("");
            }

            int var4 = -103 % ((arg0 - 7) / 44);
            int var5 = this.field8247.getSerialNumber();
            if (!this.field8247.isBOS()) {
               class537 var6 = (class537)this.field8240.method5681((long)var5, -1);
               if (!var6.field7847.pageIn(this.field8247)) {
                  throw new IllegalStateException();
               } else {
                  return var6;
               }
            } else {
               OggStreamState var7 = new OggStreamState(var5);
               if (!var7.pageIn(this.field8247)) {
                  throw new IllegalStateException();
               } else if (~var7.packetPeek(this.field8234) != -2) {
                  throw new IllegalStateException();
               } else {
                  class537 var8;
                  label120: {
                     if (this.field8233 == null && this.field8234.isTheora()) {
                        this.field8233 = new class430(var7);
                        var8 = this.field8233;
                        if (var2 == 0) {
                           break label120;
                        }
                     }

                     if (this.field8222 == null && this.field8234.isVorbis()) {
                        this.field8222 = new class610(var7);
                        var8 = this.field8222;
                        if (var2 == 0) {
                           break label120;
                        }
                     }

                     boolean var10000;
                     label85: {
                        byte[] var9 = this.field8234.getData();
                        StringBuffer var10 = new StringBuffer();
                        int var11 = 1;
                        String var12;
                        if (var2 != 0) {
                           var10000 = Character.isLetterOrDigit((char)var9[var11]);
                        } else if (~var11 <= ~var9.length) {
                           var12 = var10.toString();
                           var10000 = var12.equals(field8250[15]);
                           if (var2 == 0) {
                              break label85;
                           }
                        } else {
                           var10000 = Character.isLetterOrDigit((char)var9[var11]);
                        }

                        label84:
                        while(true) {
                           while(!var10000) {
                              var12 = var10.toString();
                              var10000 = var12.equals(field8250[15]);
                              if (var2 == 0) {
                                 break label84;
                              }
                           }

                           var10.append((char)var9[var11]);
                           ++var11;
                           if (~var11 <= ~var9.length) {
                              var12 = var10.toString();
                              var10000 = var12.equals(field8250[15]);
                              if (var2 == 0) {
                                 break;
                              }
                           } else {
                              var10000 = Character.isLetterOrDigit((char)var9[var11]);
                           }
                        }
                     }

                     if (!var10000) {
                        var8 = new class755(var7);
                        if (var2 == 0) {
                           break label120;
                        }
                     }

                     var8 = new class189(var7);
                  }

                  this.field8240.method5682((long)var5, var8, (byte)7);
                  return var8;
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field8250[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "i",
      descriptor = "(I)V",
      line = 205
   )
   public static void method4102(int arg0) {
      try {
         if (arg0 < 50) {
            method4102(-30);
         }

         field8248 = null;
         field8221 = null;
         field8229 = null;
         field8249 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8250[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "h",
      descriptor = "(I)V",
      line = 220
   )
   private final void method4103(int arg0) throws IOException {
      int var2 = client.field4530;

      try {
         label74: {
            ++field8217;
            class537 var3;
            if (arg0 != 1) {
               this.method4105(true, true);
               if (var2 != 0) {
                  var3 = this.method4101(-93);
                  if (var3 == null) {
                     break label74;
                  }
               } else {
                  if (this.field8233.field7847.packetOut(this.field8234) == 1) {
                     this.field8233.method3983(this.field8234, (byte)44);
                     return;
                  }

                  var3 = this.method4101(-93);
                  if (var3 == null) {
                     break label74;
                  }
               }
            } else {
               if (this.field8233.field7847.packetOut(this.field8234) == 1) {
                  this.field8233.method3983(this.field8234, (byte)44);
                  return;
               }

               var3 = this.method4101(-93);
               if (var3 == null) {
                  break label74;
               }
            }

            label73:
            do {
               while(true) {
                  if (this.field8228 == var3) {
                     this.method4106(true);
                     if (var2 != 0) {
                        break;
                     }

                     if (var2 != 0) {
                        break label73;
                     }
                  }

                  if (this.field8233.field7847.packetOut(this.field8234) == 1) {
                     this.field8233.method3983(this.field8234, (byte)44);
                     return;
                  }

                  var3 = this.method4101(-93);
                  if (var3 == null) {
                     break label73;
                  }
               }
            } while(var3 != null);
         }

         if (this.field8243) {
            this.method4114(2);
         }

      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8250[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "d",
      descriptor = "(I)Lei;",
      line = 250
   )
   public final class189 method4104(int arg0) {
      try {
         ++field8231;
         return arg0 != 557 ? null : this.field8228;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8250[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(ZZ)V",
      line = 262
   )
   public final void method4105(boolean arg0, boolean arg1) {
      try {
         if (this.field8222 != null) {
            class26 var3 = this.field8222.method4446((byte)69);
            if (var3 != null) {
               var3.method185(arg1, 2);
            }
         }

         ++field8230;
         this.field8246 = !this.field8246;
         if (arg0) {
            method4109((byte)110);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8250[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Z)V",
      line = 283
   )
   private final void method4106(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Llw;I)I",
      line = 320
   )
   public static final int method4107(class687 arg0, int arg1) {
      int var2 = client.field4530;

      try {
         ++field8219;
         int var3 = 63 / ((arg1 - -38) / 52);
         int var4 = arg0.field10304;
         class283 var5 = arg0.method3052(20733);
         if (arg0.field6078 == -1 || arg0.field6106) {
            var4 = arg0.field10339;
            if (var2 == 0) {
               return var4;
            }
         }

         if (arg0.field6078 != var5.field3959 && ~arg0.field6078 != ~var5.field3964 && arg0.field6078 != var5.field3942 && ~arg0.field6078 != ~var5.field3960) {
            if (arg0.field6078 != var5.field3950 && ~arg0.field6078 != ~var5.field3938 && arg0.field6078 != var5.field3977 && arg0.field6078 != var5.field3949) {
               return var4;
            }

            var4 = arg0.field10315;
            if (var2 == 0) {
               return var4;
            }
         }

         var4 = arg0.field10345;
         return var4;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8250[20] + (arg0 != null ? field8250[11] : field8250[10]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "(B)Lpm;",
      line = 345
   )
   public final class610 method4108(byte arg0) {
      try {
         ++field8238;
         return arg0 != -57 ? null : this.field8222;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8250[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "(B)V",
      line = 356
   )
   public static final void method4109(byte arg0) {
      try {
         ++field8244;
         if (!class231.field2938) {
            if (arg0 > -80) {
               method4109((byte)2);
            }

            class186.field2333 += (-class186.field2333 + -12.0F) / 2.0F;
            class231.field2938 = true;
            class630.field9159 = true;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8250[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "(Z)Z",
      line = 377
   )
   private final boolean method4110(boolean arg0) {
      try {
         ++field8226;
         if (!arg0) {
            this.field8243 = false;
         }

         if (this.field8222 == null) {
            double var2 = (double)this.field8233.method3275(0);
            return var2 == 0.0D || (double)class188.method1462(true) >= (double)this.field8233.method3276((byte)119) + 1000.0D / var2;
         } else {
            return !this.field8233.method3273(-2049) || this.method4115(18900) > this.field8233.method3277(false);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8250[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(B)V",
      line = 406
   )
   public final void method4111(byte arg0) throws IOException {
      int var2 = client.field4530;

      RuntimeException var10000;
      label187: {
         boolean var10001;
         try {
            if (arg0 != 76) {
               this.method4114(-19);
            }

            ++field8232;
            if (this.field8246) {
               return;
            }
         } catch (RuntimeException var12) {
            var10000 = var12;
            var10001 = false;
            break label187;
         }

         while(true) {
            class537 var3;
            label182: {
               label181: {
                  try {
                     if (!this.field8245) {
                        if (this.field8242) {
                           var3 = (class537)this.field8240.method5681((long)this.field8247.getSerialNumber(), -1);
                           if (var2 == 0) {
                              break label182;
                           }
                        }
                        break label181;
                     }
                  } catch (RuntimeException var11) {
                     var10000 = var11;
                     var10001 = false;
                     break;
                  }

                  if (var2 == 0) {
                     return;
                  }
               }

               try {
                  var3 = this.method4101(-95);
                  if (var3 == null) {
                     if (this.field8243) {
                        this.method4114(2);
                     }

                     return;
                  }

                  if (var3 == null) {
                     throw new IllegalStateException();
                  }

                  this.field8242 = true;
               } catch (RuntimeException var9) {
                  var10000 = var9;
                  var10001 = false;
                  break;
               }
            }

            try {
               label192: {
                  if (this.field8222 != var3) {
                     if (var3 instanceof class189) {
                        this.method4106(true);
                        if (var2 == 0) {
                           break label192;
                        }
                     }

                     if (this.field8233 == var3) {
                        if (this.field8222 == null && !this.field8246) {
                           int var4 = 0;
                           if (var2 != 0 || var4 < 10 && this.method4110(true)) {
                              do {
                                 this.method4103(1);
                                 if (this.field8245) {
                                    return;
                                 }

                                 ++var4;
                              } while(var4 < 10 && this.method4110(true));
                           }

                           return;
                        }
                        break label192;
                     }

                     while(true) {
                        if (~var3.field7847.packetOut(this.field8234) != -2) {
                           if (var2 == 0) {
                              if (var2 == 0) {
                                 break label192;
                              }
                              break;
                           }
                        } else if (~var3.field7848 == -2 && var3 instanceof class189) {
                           this.method4099(this.field8236, arg0 ^ 78);
                        }

                        var3.method3983(this.field8234, (byte)44);
                     }
                  }

                  if (this.field8222.method4448((byte)-9) >= 50) {
                     return;
                  }

                  label154:
                  while(this.field8222.field7847.packetOut(this.field8234) == 1) {
                     this.field8222.method3983(this.field8234, (byte)44);
                     this.method4106(true);

                     do {
                        if (this.field8233 != null) {
                           int var13;
                           label198: {
                              double var5 = this.field8233.method3277(false);
                              int var7 = 0;
                              if (var2 != 0) {
                                 this.method4103(arg0 ^ 77);
                                 if (this.field8245) {
                                    return;
                                 }

                                 ++var7;
                              }

                              while(~var7 > -11) {
                                 var13 = this.method4110(true);
                                 if (var2 != 0) {
                                    break label198;
                                 }

                                 if (var13 == 0) {
                                    break;
                                 }

                                 this.method4103(arg0 ^ 77);
                                 if (this.field8245) {
                                    return;
                                 }

                                 ++var7;
                              }

                              double var14;
                              var13 = (var14 = this.field8233.method3277(false) - var5) == 0.0D ? 0 : (var14 < 0.0D ? -1 : 1);
                           }

                           if (var13 > 0) {
                              return;
                           }
                        }

                        if (this.field8222.method4448((byte)-9) < 50) {
                           continue label154;
                        }
                     } while(var2 != 0);

                     return;
                  }
               }

               this.field8242 = false;
            } catch (RuntimeException var10) {
               var10000 = var10;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var8 = var10000;
      throw class670.method4877(var8, field8250[3] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!iba",
      name = "e",
      descriptor = "(I)Z",
      line = 526
   )
   public final boolean method4112(int arg0) {
      try {
         ++field8237;
         if (arg0 != -1) {
            this.method4100(-123);
         }

         if (!this.field8245 && !this.field8243) {
            return false;
         } else {
            return this.field8222 == null || ~this.field8222.method4448((byte)-9) >= -1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8250[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(I)Lrm;",
      line = 555
   )
   public final class430 method4113(int arg0) {
      try {
         if (arg0 != 1) {
            return null;
         } else {
            ++field8223;
            return this.field8233;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8250[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "f",
      descriptor = "(I)V",
      line = 566
   )
   private final void method4114(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "(I)D",
      line = 615
   )
   public final double method4115(int arg0) {
      try {
         ++field8218;
         if (this.field8222 != null) {
            return this.field8222.method4444(0);
         } else if (this.field8233 != null) {
            return this.field8233.method3277(false);
         } else {
            if (arg0 != 18900) {
               this.method4115(46);
            }

            return 0.0D;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8250[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "<init>",
      descriptor = "(I)V",
      line = 638
   )
   public class555(int arg0) {
      try {
         if (!class298.method2280(0, field8250[1])) {
            throw new RuntimeException(field8250[0]);
         } else {
            this.field8216 = new byte[arg0];
            this.field8239 = new OggSyncState();
            this.field8247 = new OggPage();
            this.field8234 = new OggPacket();
            this.field8240 = new class791(8);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8250[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(B[B)I"
   )
   public abstract int method1615(byte arg0, byte[] arg1) throws IOException;

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4116(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4117(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
