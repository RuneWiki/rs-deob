import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class720 {
   @OriginalMember(
      owner = "client!cj",
      name = "n",
      descriptor = "[B"
   )
   private byte[] field10399;
   @OriginalMember(
      owner = "client!cj",
      name = "B",
      descriptor = "Ljagtheora/ogg/OggSyncState;"
   )
   private OggSyncState field10388;
   @OriginalMember(
      owner = "client!cj",
      name = "d",
      descriptor = "Ljagtheora/ogg/OggPage;"
   )
   private OggPage field10382;
   @OriginalMember(
      owner = "client!cj",
      name = "u",
      descriptor = "Ljagtheora/ogg/OggPacket;"
   )
   private OggPacket field10410;
   @OriginalMember(
      owner = "client!cj",
      name = "c",
      descriptor = "Lld;"
   )
   private class178 field10407;
   @OriginalMember(
      owner = "client!cj",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10415 = new String[]{method5216(method5215(",\u0002N=B")), method5216(method5215(",\u0002N\"B")), method5216(method5215(",\u0002N'B")), method5216(method5215(",\u0002N#B")), method5216(method5215(",\u0002NT\u0003!\u0001\u0014VB")), method5216(method5215("%\t\u0007\u001c\u0002*\u0007\u0012\t")), method5216(method5215("\t\t\t\u0004\u000f+H\u0014\u0007J#\u0007\u0001\fJ%\t\u0007\u001c\u0002*\u0007\u0012\tJ#\u0001\u0002\u001a\u000b=\u0011")), method5216(method5215("$\t\u0014\r")), method5216(method5215(",\u0002N$B")), method5216(method5215(",\u0002N!B")), method5216(method5215(",\u0002N:B")), method5216(method5215(",\u0002N<B")), method5216(method5215(",\u0002N/B")), method5216(method5215(",\u0002N B")), method5216(method5215(",\u0002N%B")), method5216(method5215(",\u0002N.B")), method5216(method5215(",\u0002N9B")), method5216(method5215("4FNF\u0017")), method5216(method5215("!\u001d\f\u0004")), method5216(method5215(",\u0002N8B")), method5216(method5215(",\u0002N;B")), method5216(method5215(",\u0002N-B")), method5216(method5215(",\u0002N&B"))};
   @OriginalMember(
      owner = "client!cj",
      name = "A",
      descriptor = "Lgh;"
   )
   public static class572 field10389 = new class572(98, 1);
   @OriginalMember(
      owner = "client!cj",
      name = "C",
      descriptor = "[Lgg;"
   )
   public static class184[] field10414 = new class184[75];
   @OriginalMember(
      owner = "client!cj",
      name = "t",
      descriptor = "I"
   )
   public static int field10413 = 0;
   @OriginalMember(
      owner = "client!cj",
      name = "b",
      descriptor = "I"
   )
   public static int field10384;
   @OriginalMember(
      owner = "client!cj",
      name = "j",
      descriptor = "I"
   )
   public static int field10386;
   @OriginalMember(
      owner = "client!cj",
      name = "y",
      descriptor = "I"
   )
   public static int field10387;
   @OriginalMember(
      owner = "client!cj",
      name = "k",
      descriptor = "I"
   )
   public static int field10390;
   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "I"
   )
   public static int field10391;
   @OriginalMember(
      owner = "client!cj",
      name = "m",
      descriptor = "I"
   )
   public static int field10392;
   @OriginalMember(
      owner = "client!cj",
      name = "s",
      descriptor = "I"
   )
   public static int field10396;
   @OriginalMember(
      owner = "client!cj",
      name = "x",
      descriptor = "I"
   )
   public static int field10397;
   @OriginalMember(
      owner = "client!cj",
      name = "h",
      descriptor = "I"
   )
   public static int field10398;
   @OriginalMember(
      owner = "client!cj",
      name = "E",
      descriptor = "I"
   )
   public static int field10400;
   @OriginalMember(
      owner = "client!cj",
      name = "l",
      descriptor = "I"
   )
   public static int field10402;
   @OriginalMember(
      owner = "client!cj",
      name = "e",
      descriptor = "I"
   )
   public static int field10403;
   @OriginalMember(
      owner = "client!cj",
      name = "o",
      descriptor = "I"
   )
   public static int field10404;
   @OriginalMember(
      owner = "client!cj",
      name = "v",
      descriptor = "I"
   )
   public static int field10406;
   @OriginalMember(
      owner = "client!cj",
      name = "g",
      descriptor = "I"
   )
   public static int field10409;
   @OriginalMember(
      owner = "client!cj",
      name = "r",
      descriptor = "I"
   )
   public static int field10411;
   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "I"
   )
   public static int field10412;
   @OriginalMember(
      owner = "client!cj",
      name = "f",
      descriptor = "Lrc;"
   )
   private class562 field10393;
   @OriginalMember(
      owner = "client!cj",
      name = "G",
      descriptor = "Lkha;"
   )
   private class607 field10394;
   @OriginalMember(
      owner = "client!cj",
      name = "D",
      descriptor = "Lbca;"
   )
   private class688 field10401;
   @OriginalMember(
      owner = "client!cj",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   private String field10408;
   @OriginalMember(
      owner = "client!cj",
      name = "q",
      descriptor = "Z"
   )
   private boolean field10383;
   @OriginalMember(
      owner = "client!cj",
      name = "F",
      descriptor = "Z"
   )
   private boolean field10385;
   @OriginalMember(
      owner = "client!cj",
      name = "i",
      descriptor = "Z"
   )
   private boolean field10395;
   @OriginalMember(
      owner = "client!cj",
      name = "p",
      descriptor = "Z"
   )
   private boolean field10405;

   @OriginalMember(
      owner = "client!cj",
      name = "h",
      descriptor = "(I)Lmr;",
      line = 5
   )
   private final class153 method5198(int arg0) throws IOException {
      boolean var2 = client.field4564;

      try {
         if (arg0 != -1) {
            return null;
         } else {
            ++field10397;
            if (this.field10405) {
               throw new IllegalStateException();
            } else if (this.field10395) {
               return null;
            } else {
               label116:
               while(~this.field10388.pageOut(this.field10382) >= -1) {
                  int var3 = this.method1449(this.field10399, (byte)107);

                  do {
                     if (var3 == -1) {
                        this.field10395 = true;
                        return null;
                     }

                     if (var3 == 0) {
                        return null;
                     }

                     if (this.field10388.write(this.field10399, var3)) {
                        continue label116;
                     }
                  } while(var2);

                  throw new RuntimeException("");
               }

               int var4 = this.field10382.getSerialNumber();
               if (!this.field10382.isBOS()) {
                  class153 var5 = (class153)this.field10407.method1572((long)var4, arg0 + -16288);
                  if (!var5.field2439.pageIn(this.field10382)) {
                     throw new IllegalStateException();
                  } else {
                     return var5;
                  }
               } else {
                  OggStreamState var6 = new OggStreamState(var4);
                  if (!var6.pageIn(this.field10382)) {
                     throw new IllegalStateException();
                  } else if (~var6.packetPeek(this.field10410) != -2) {
                     throw new IllegalStateException();
                  } else {
                     class153 var7;
                     label124: {
                        if (this.field10401 == null && this.field10410.isTheora()) {
                           this.field10401 = new class688(var6);
                           var7 = this.field10401;
                           if (!var2) {
                              break label124;
                           }
                        }

                        if (this.field10393 == null && this.field10410.isVorbis()) {
                           this.field10393 = new class562(var6);
                           var7 = this.field10393;
                           if (!var2) {
                              break label124;
                           }
                        }

                        boolean var10000;
                        label89: {
                           byte[] var8 = this.field10410.getData();
                           StringBuffer var9 = new StringBuffer();
                           int var10 = 1;
                           String var11;
                           if (var2) {
                              var10000 = Character.isLetterOrDigit((char)var8[var10]);
                           } else if (~var10 <= ~var8.length) {
                              var11 = var9.toString();
                              var10000 = var11.equals(field10415[7]);
                              if (!var2) {
                                 break label89;
                              }
                           } else {
                              var10000 = Character.isLetterOrDigit((char)var8[var10]);
                           }

                           label88:
                           while(true) {
                              while(!var10000) {
                                 var11 = var9.toString();
                                 var10000 = var11.equals(field10415[7]);
                                 if (!var2) {
                                    break label88;
                                 }
                              }

                              var9.append((char)var8[var10]);
                              ++var10;
                              if (~var10 <= ~var8.length) {
                                 var11 = var9.toString();
                                 var10000 = var11.equals(field10415[7]);
                                 if (!var2) {
                                    break;
                                 }
                              } else {
                                 var10000 = Character.isLetterOrDigit((char)var8[var10]);
                              }
                           }
                        }

                        if (!var10000) {
                           var7 = new class487(var6);
                           if (!var2) {
                              break label124;
                           }
                        }

                        var7 = new class607(var6);
                     }

                     this.field10407.method1566(var7, arg0 + 24743, (long)var4);
                     return var7;
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field10415[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "b",
      descriptor = "(B)V",
      line = 122
   )
   public final void method5199(byte param1) throws IOException {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cj",
      name = "c",
      descriptor = "(I)V",
      line = 247
   )
   public final void method5200(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cj",
      name = "g",
      descriptor = "(I)I",
      line = 275
   )
   public static final int method5201(int arg0) {
      try {
         if (arg0 < 126) {
            method5205(-8, (class294)null, 101, (class295)null);
         }

         ++field10412;
         return 16;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10415[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "d",
      descriptor = "(B)V",
      line = 286
   )
   private final void method5202(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cj",
      name = "e",
      descriptor = "(I)Z",
      line = 323
   )
   public final boolean method5203(int arg0) {
      try {
         ++field10400;
         if (!this.field10405 && !this.field10395) {
            return false;
         } else if (this.field10393 != null && ~this.field10393.method4192(0) < -1) {
            return false;
         } else {
            return arg0 != -1 ? true : true;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10415[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "d",
      descriptor = "(I)V",
      line = 341
   )
   private final void method5204(int arg0) throws IOException {
      boolean var2 = client.field4564;

      try {
         label69: {
            ++field10384;
            class153 var3;
            if (var2) {
               var3 = this.method5198(-1);
               if (var3 == null) {
                  break label69;
               }
            } else {
               if (this.field10401.field2439.packetOut(this.field10410) == 1) {
                  this.field10401.method1422(this.field10410, arg0 + -128);
                  if (arg0 != 1) {
                     this.field10410 = null;
                     return;
                  }

                  return;
               }

               var3 = this.method5198(-1);
               if (var3 == null) {
                  break label69;
               }
            }

            label68:
            do {
               while(true) {
                  if (this.field10394 == var3) {
                     this.method5202((byte)-94);
                     if (var2) {
                        break;
                     }

                     if (var2) {
                        break label68;
                     }
                  }

                  if (this.field10401.field2439.packetOut(this.field10410) == 1) {
                     this.field10401.method1422(this.field10410, arg0 + -128);
                     if (arg0 != 1) {
                        this.field10410 = null;
                        return;
                     }

                     return;
                  }

                  var3 = this.method5198(-1);
                  if (var3 == null) {
                     break label68;
                  }
               }
            } while(var3 != null);
         }

         if (this.field10395) {
            this.method5207((byte)-37);
         }

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10415[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(ILvca;ILkd;)V",
      line = 375
   )
   public static final void method5205(int arg0, class294 arg1, int arg2, class295 arg3) {
      try {
         ++field10386;
         if (class621.field9054 < 50) {
            if (arg3 != null && arg3.field4109 != null && arg3.field4109.length > arg2 && arg3.field4109[arg2] != null) {
               int var4 = arg3.field4109[arg2][0];
               int var5 = var4 >> 8;
               int var6 = var4 >> 5 & 7;
               int var7 = var4 & 31;
               if (arg3.field4109[arg2].length > 1) {
                  int var8 = (int)((double)arg3.field4109[arg2].length * Math.random());
                  if (~var8 < -1) {
                     var5 = arg3.field4109[arg2][var8];
                  }
               }

               int var9 = 256;
               if (arg3.field4118 != null && arg3.field4105 != null) {
                  var9 = arg3.field4118[arg2] + (int)(Math.random() * (double)(arg3.field4105[arg2] - arg3.field4118[arg2]));
               }

               int var10 = arg3.field4138 == null ? 255 : arg3.field4138[arg2];
               if (arg0 == var7) {
                  if (class304.field4398 == arg1) {
                     if (!arg3.field4112) {
                        class14.method95(var6, 0, var10, -1, var9, var5);
                        return;
                     }

                     class1.method4(false, var6, var5, var9, 0, var10, 19491);
                  }

               } else if (class510.field7454.field11164.method684(false) != 0) {
                  int var11 = arg1.field4101 + -256 >> 9;
                  int var12 = arg1.field4096 - 256 >> 9;
                  int var13 = class304.field4398 == arg1 ? 0 : (var12 << 8) + (arg1.field4090 << 24) + (var11 << 16) + var7;
                  class123.field1969[class621.field9054++] = new class377((byte)(arg3.field4112 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg1);
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field10415[16] + arg0 + ',' + (arg1 != null ? field10415[17] : field10415[18]) + ',' + arg2 + ',' + (arg3 != null ? field10415[17] : field10415[18]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(Z)Lkha;",
      line = 443
   )
   public final class607 method5206(boolean arg0) {
      try {
         ++field10391;
         return !arg0 ? null : this.field10394;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10415[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "e",
      descriptor = "(B)V",
      line = 455
   )
   private final void method5207(byte arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 == -37) {
            class153 var3 = (class153)this.field10407.method1567((byte)-44);
            class153 var10000;
            int var4;
            if (var2) {
               var10000 = var3;
            } else if (var3 == null) {
               ++field10392;
               var10000 = this.field10401;
               if (!var2) {
                  if (var10000 == null) {
                     return;
                  }

                  var4 = 0;
                  if (!var2) {
                     if (var4 >= 10) {
                        return;
                     }

                     if (!this.method5208((byte)-71)) {
                        return;
                     }
                  }

                  while(~this.field10401.field2439.packetOut() == -2) {
                     this.field10401.method1422(this.field10410, -127);
                     if (var2) {
                        break;
                     }

                     ++var4;
                     if (var4 >= 10) {
                        return;
                     }

                     if (!this.method5208((byte)-71)) {
                        return;
                     }
                  }

                  this.method5200(50);
                  return;
               }
            } else {
               var10000 = var3;
            }

            while(true) {
               label153: {
                  if (var10000 == this.field10401) {
                     if (var2) {
                        var3.method1422(this.field10410, -127);
                     } else {
                        var10000 = (class153)this.field10407.method1575((byte)-117);
                        if (!var2) {
                           break label153;
                        }

                        var10000.method1422(this.field10410, -127);
                     }
                  }

                  while(true) {
                     while(var3.field2439.packetOut() == 1) {
                        var3.method1422(this.field10410, -127);
                     }

                     var10000 = (class153)this.field10407.method1575((byte)-117);
                     if (!var2) {
                        break;
                     }

                     var10000.method1422(this.field10410, -127);
                  }
               }

               var3 = var10000;
               if (var3 == null) {
                  ++field10392;
                  var10000 = this.field10401;
                  if (!var2) {
                     if (var10000 == null) {
                        return;
                     }

                     var4 = 0;
                     if (!var2) {
                        if (var4 >= 10) {
                           return;
                        }

                        if (!this.method5208((byte)-71)) {
                           return;
                        }
                     }

                     while(~this.field10401.field2439.packetOut() == -2) {
                        this.field10401.method1422(this.field10410, -127);
                        if (var2) {
                           break;
                        }

                        ++var4;
                        if (var4 >= 10) {
                           return;
                        }

                        if (!this.method5208((byte)-71)) {
                           return;
                        }
                     }

                     this.method5200(50);
                     return;
                  }
               } else {
                  var10000 = var3;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10415[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "c",
      descriptor = "(B)Z",
      line = 501
   )
   private final boolean method5208(byte arg0) {
      try {
         if (arg0 != -71) {
            this.method5202((byte)-125);
         }

         ++field10398;
         if (this.field10393 != null) {
            return !this.field10401.method5014((byte)-13) || this.method5211(0) > this.field10401.method5015(96);
         } else {
            double var2 = (double)this.field10401.method5010((byte)109);
            return var2 == 0.0D || (double)class57.method650(116) >= 1000.0D / var2 + (double)this.field10401.method5009(arg0 ^ -57);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10415[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(B)V",
      line = 523
   )
   public static void method5209(byte arg0) {
      try {
         if (arg0 != -23) {
            field10406 = -61;
         }

         field10389 = null;
         field10414 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10415[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V",
      line = 538
   )
   public final void method5210(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cj",
      name = "f",
      descriptor = "(I)D",
      line = 593
   )
   public final double method5211(int arg0) {
      try {
         ++field10402;
         if (this.field10393 != null) {
            return this.field10393.method4193(true);
         } else if (arg0 != 0) {
            return 0.6861343892891112D;
         } else {
            return this.field10401 != null ? this.field10401.method5015(109) : 0.0D;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10415[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(ZI)V",
      line = 614
   )
   public final void method5212(boolean arg0, int arg1) {
      try {
         ++field10403;
         if (arg1 != 0) {
            this.field10394 = null;
         }

         if (this.field10393 != null) {
            class247 var3 = this.field10393.method4194(-12988);
            if (var3 != null) {
               var3.method2013((byte)-117, arg0);
            }
         }

         this.field10383 = !this.field10383;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10415[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(I)Lbca;",
      line = 638
   )
   public final class688 method5213(int arg0) {
      try {
         ++field10396;
         if (arg0 != -1) {
            field10406 = 126;
         }

         return this.field10401;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10415[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "b",
      descriptor = "(I)Lrc;",
      line = 655
   )
   public final class562 method5214(int arg0) {
      try {
         ++field10387;
         if (arg0 >= -26) {
            method5205(43, (class294)null, 74, (class295)null);
         }

         return this.field10393;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10415[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "<init>",
      descriptor = "(I)V",
      line = 665
   )
   public class720(int arg0) {
      try {
         if (!class621.method4548((byte)105, field10415[5])) {
            throw new RuntimeException(field10415[6]);
         } else {
            this.field10399 = new byte[arg0];
            this.field10388 = new OggSyncState();
            this.field10382 = new OggPage();
            this.field10410 = new OggPacket();
            this.field10407 = new class178(8);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10415[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "([BB)I"
   )
   public abstract int method1449(byte[] arg0, byte arg1) throws IOException;

   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5215(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5216(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
