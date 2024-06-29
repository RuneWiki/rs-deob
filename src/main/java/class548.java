import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mka")
public abstract class class548 {
   @OriginalMember(
      owner = "client!mka",
      name = "u",
      descriptor = "[B"
   )
   private byte[] field7797;
   @OriginalMember(
      owner = "client!mka",
      name = "n",
      descriptor = "Ljagtheora/ogg/OggSyncState;"
   )
   private OggSyncState field7814;
   @OriginalMember(
      owner = "client!mka",
      name = "l",
      descriptor = "Ljagtheora/ogg/OggPage;"
   )
   private OggPage field7810;
   @OriginalMember(
      owner = "client!mka",
      name = "A",
      descriptor = "Ljagtheora/ogg/OggPacket;"
   )
   private OggPacket field7791;
   @OriginalMember(
      owner = "client!mka",
      name = "v",
      descriptor = "Lbga;"
   )
   private class398 field7794;
   @OriginalMember(
      owner = "client!mka",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7821 = new String[]{method4118(method4117("'>\n_\u0015b")), method4118(method4117("'>\n_\bb")), method4118(method4117("'>\n_\u001fb")), method4118(method4117("'>\n_\u0017b")), method4118(method4117("'>\n_\u0016b")), method4118(method4117("!4\u001f\u0014")), method4118(method4117("'>\n_\u0014b")), method4118(method4117("'>\n_\u001eb")), method4118(method4117("1{E_%")), method4118(method4117("$ \u0007\u001d")), method4118(method4117("'>\n_\u0010b")), method4118(method4117("\f4\u0002\u001d=.u\u001f\u001ex&:\n\u0015x 4\f\u00050/:\u0019\u0010x&<\t\u000398,")), method4118(method4117(" 4\f\u00050/:\u0019\u0010")), method4118(method4117("'>\n_d#;\u0002\u0005fb")), method4118(method4117("'>\n_\u0019b")), method4118(method4117("'>\n_\u001bb")), method4118(method4117("'>\n_\tb")), method4118(method4117("'>\n_\u001db")), method4118(method4117("'>\n_\u0012b")), method4118(method4117("'>\n_\u001ab")), method4118(method4117("'>\n_\u0013b")), method4118(method4117("'>\n_\u0011b"))};
   @OriginalMember(
      owner = "client!mka",
      name = "h",
      descriptor = "I"
   )
   public static int field7805 = 1;
   @OriginalMember(
      owner = "client!mka",
      name = "x",
      descriptor = "I"
   )
   public static int field7792;
   @OriginalMember(
      owner = "client!mka",
      name = "y",
      descriptor = "I"
   )
   public static int field7793;
   @OriginalMember(
      owner = "client!mka",
      name = "g",
      descriptor = "I"
   )
   public static int field7795;
   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "I"
   )
   public static int field7796;
   @OriginalMember(
      owner = "client!mka",
      name = "r",
      descriptor = "I"
   )
   public static int field7798;
   @OriginalMember(
      owner = "client!mka",
      name = "w",
      descriptor = "I"
   )
   public static int field7799;
   @OriginalMember(
      owner = "client!mka",
      name = "D",
      descriptor = "I"
   )
   public static int field7802;
   @OriginalMember(
      owner = "client!mka",
      name = "s",
      descriptor = "I"
   )
   public static int field7803;
   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "I"
   )
   public static int field7807;
   @OriginalMember(
      owner = "client!mka",
      name = "d",
      descriptor = "I"
   )
   public static int field7808;
   @OriginalMember(
      owner = "client!mka",
      name = "k",
      descriptor = "I"
   )
   public static int field7811;
   @OriginalMember(
      owner = "client!mka",
      name = "i",
      descriptor = "I"
   )
   public static int field7812;
   @OriginalMember(
      owner = "client!mka",
      name = "e",
      descriptor = "I"
   )
   public static int field7816;
   @OriginalMember(
      owner = "client!mka",
      name = "m",
      descriptor = "I"
   )
   public static int field7818;
   @OriginalMember(
      owner = "client!mka",
      name = "C",
      descriptor = "I"
   )
   public static int field7819;
   @OriginalMember(
      owner = "client!mka",
      name = "o",
      descriptor = "Lws;"
   )
   private class102 field7809;
   @OriginalMember(
      owner = "client!mka",
      name = "c",
      descriptor = "Lkq;"
   )
   private class40 field7820;
   @OriginalMember(
      owner = "client!mka",
      name = "p",
      descriptor = "Ljb;"
   )
   private class75 field7806;
   @OriginalMember(
      owner = "client!mka",
      name = "B",
      descriptor = "Ljava/lang/String;"
   )
   private String field7804;
   @OriginalMember(
      owner = "client!mka",
      name = "j",
      descriptor = "Z"
   )
   private boolean field7800;
   @OriginalMember(
      owner = "client!mka",
      name = "t",
      descriptor = "Z"
   )
   private boolean field7801;
   @OriginalMember(
      owner = "client!mka",
      name = "q",
      descriptor = "Z"
   )
   private boolean field7813;
   @OriginalMember(
      owner = "client!mka",
      name = "f",
      descriptor = "Z"
   )
   private boolean field7817;
   @OriginalMember(
      owner = "client!mka",
      name = "b",
      descriptor = "[Lip;"
   )
   public static class662[] field7815;

   @OriginalMember(
      owner = "client!mka",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method4101(byte arg0) throws IOException {
      boolean var2 = client.field10022;

      try {
         if (arg0 >= 84) {
            label62: {
               ++field7799;
               class47 var3;
               if (var2) {
                  var3 = this.method4104(-94);
                  if (var3 == null) {
                     break label62;
                  }
               } else {
                  if (~this.field7820.field723.packetOut(this.field7791) == -2) {
                     this.field7820.method526(true, this.field7791);
                     return;
                  }

                  var3 = this.method4104(-94);
                  if (var3 == null) {
                     break label62;
                  }
               }

               label61:
               do {
                  while(true) {
                     if (this.field7806 == var3) {
                        this.method4108(111);
                        if (var2) {
                           break;
                        }

                        if (var2) {
                           break label61;
                        }
                     }

                     if (~this.field7820.field723.packetOut(this.field7791) == -2) {
                        this.field7820.method526(true, this.field7791);
                        return;
                     }

                     var3 = this.method4104(-94);
                     if (var3 == null) {
                        break label61;
                     }
                  }
               } while(var3 != null);
            }

            if (this.field7817) {
               this.method4107((byte)85);
            }

         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7821[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(Z[B)I"
   )
   public abstract int method4011(boolean arg0, byte[] arg1) throws IOException;

   @OriginalMember(
      owner = "client!mka",
      name = "c",
      descriptor = "(I)Lkq;"
   )
   public final class40 method4102(int arg0) {
      try {
         if (arg0 >= -12) {
            return null;
         } else {
            ++field7803;
            return this.field7820;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7821[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "b",
      descriptor = "(I)Ljb;"
   )
   public final class75 method4103(int arg0) {
      try {
         ++field7793;
         if (arg0 != -18992) {
            this.field7817 = true;
         }

         return this.field7806;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7821[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "d",
      descriptor = "(I)Lcha;"
   )
   private final class47 method4104(int arg0) throws IOException {
      boolean var2 = client.field10022;

      try {
         ++field7819;
         if (this.field7801) {
            throw new IllegalStateException();
         } else if (this.field7817) {
            return null;
         } else {
            label418: {
               int var3;
               int var4;
               OggStreamState var5;
               byte[] var6;
               StringBuffer var7;
               int var8;
               String var9;
               class47 var10;
               class47 var11;
               boolean var10000;
               if (arg0 >= -84) {
                  this.field7809 = null;
                  if (var2) {
                     var3 = this.method4011(true, this.field7797);
                     if (var3 == -1) {
                        break label418;
                     }

                     if (~var3 == -1) {
                        return null;
                     }
                  } else {
                     if (~this.field7814.pageOut(this.field7810) < -1) {
                        var4 = this.field7810.getSerialNumber();
                        if (!this.field7810.isBOS()) {
                           var11 = (class47)this.field7794.method3101(-1, (long)var4);
                           if (!var11.field723.pageIn(this.field7810)) {
                              throw new IllegalStateException();
                           }

                           return var11;
                        }

                        var5 = new OggStreamState(var4);
                        if (!var5.pageIn(this.field7810)) {
                           throw new IllegalStateException();
                        }

                        if (var5.packetPeek(this.field7791) != 1) {
                           throw new IllegalStateException();
                        }

                        label451: {
                           if (this.field7820 != null || !this.field7791.isTheora()) {
                              if (this.field7809 != null || !this.field7791.isVorbis()) {
                                 label446: {
                                    var6 = this.field7791.getData();
                                    var7 = new StringBuffer();
                                    var8 = 1;
                                    if (var2) {
                                       var10000 = Character.isLetterOrDigit((char)var6[var8]);
                                    } else if (var8 >= var6.length) {
                                       var9 = var7.toString();
                                       var10000 = var9.equals(field7821[5]);
                                       if (!var2) {
                                          if (!var10000) {
                                             var10 = new class426(var5);
                                             if (!var2) {
                                                break label451;
                                             }
                                          }

                                          var10 = new class75(var5);
                                          if (!var2) {
                                             break label451;
                                          }
                                          break label446;
                                       }
                                    } else {
                                       var10000 = Character.isLetterOrDigit((char)var6[var8]);
                                    }

                                    label337:
                                    while(true) {
                                       while(!var10000) {
                                          var9 = var7.toString();
                                          var10000 = var9.equals(field7821[5]);
                                          if (!var2) {
                                             if (!var10000) {
                                                var10 = new class426(var5);
                                                if (!var2) {
                                                   break label451;
                                                }
                                             }

                                             var10 = new class75(var5);
                                             if (!var2) {
                                                break label451;
                                             }
                                             break label337;
                                          }
                                       }

                                       var7.append((char)var6[var8]);
                                       ++var8;
                                       if (var8 >= var6.length) {
                                          var9 = var7.toString();
                                          var10000 = var9.equals(field7821[5]);
                                          if (!var2) {
                                             if (!var10000) {
                                                var10 = new class426(var5);
                                                if (!var2) {
                                                   break label451;
                                                }
                                             }

                                             var10 = new class75(var5);
                                             if (!var2) {
                                                break label451;
                                             }
                                             break;
                                          }
                                       } else {
                                          var10000 = Character.isLetterOrDigit((char)var6[var8]);
                                       }
                                    }
                                 }
                              }

                              this.field7809 = new class102(var5);
                              var10 = this.field7809;
                              if (!var2) {
                                 break label451;
                              }
                           }

                           this.field7820 = new class40(var5);
                           var10 = this.field7820;
                        }

                        this.field7794.method3098((long)var4, var10, -1);
                        return var10;
                     }

                     var3 = this.method4011(true, this.field7797);
                     if (var3 == -1) {
                        break label418;
                     }

                     if (~var3 == -1) {
                        return null;
                     }
                  }
               } else {
                  if (~this.field7814.pageOut(this.field7810) < -1) {
                     var4 = this.field7810.getSerialNumber();
                     if (!this.field7810.isBOS()) {
                        var11 = (class47)this.field7794.method3101(-1, (long)var4);
                        if (!var11.field723.pageIn(this.field7810)) {
                           throw new IllegalStateException();
                        }

                        return var11;
                     }

                     var5 = new OggStreamState(var4);
                     if (!var5.pageIn(this.field7810)) {
                        throw new IllegalStateException();
                     }

                     if (var5.packetPeek(this.field7791) != 1) {
                        throw new IllegalStateException();
                     }

                     label453: {
                        if (this.field7820 != null || !this.field7791.isTheora()) {
                           if (this.field7809 != null || !this.field7791.isVorbis()) {
                              label448: {
                                 var6 = this.field7791.getData();
                                 var7 = new StringBuffer();
                                 var8 = 1;
                                 if (var2) {
                                    var10000 = Character.isLetterOrDigit((char)var6[var8]);
                                 } else if (var8 >= var6.length) {
                                    var9 = var7.toString();
                                    var10000 = var9.equals(field7821[5]);
                                    if (!var2) {
                                       if (!var10000) {
                                          var10 = new class426(var5);
                                          if (!var2) {
                                             break label453;
                                          }
                                       }

                                       var10 = new class75(var5);
                                       if (!var2) {
                                          break label453;
                                       }
                                       break label448;
                                    }
                                 } else {
                                    var10000 = Character.isLetterOrDigit((char)var6[var8]);
                                 }

                                 label208:
                                 while(true) {
                                    while(!var10000) {
                                       var9 = var7.toString();
                                       var10000 = var9.equals(field7821[5]);
                                       if (!var2) {
                                          if (!var10000) {
                                             var10 = new class426(var5);
                                             if (!var2) {
                                                break label453;
                                             }
                                          }

                                          var10 = new class75(var5);
                                          if (!var2) {
                                             break label453;
                                          }
                                          break label208;
                                       }
                                    }

                                    var7.append((char)var6[var8]);
                                    ++var8;
                                    if (var8 >= var6.length) {
                                       var9 = var7.toString();
                                       var10000 = var9.equals(field7821[5]);
                                       if (!var2) {
                                          if (!var10000) {
                                             var10 = new class426(var5);
                                             if (!var2) {
                                                break label453;
                                             }
                                          }

                                          var10 = new class75(var5);
                                          if (!var2) {
                                             break label453;
                                          }
                                          break;
                                       }
                                    } else {
                                       var10000 = Character.isLetterOrDigit((char)var6[var8]);
                                    }
                                 }
                              }
                           }

                           this.field7809 = new class102(var5);
                           var10 = this.field7809;
                           if (!var2) {
                              break label453;
                           }
                        }

                        this.field7820 = new class40(var5);
                        var10 = this.field7820;
                     }

                     this.field7794.method3098((long)var4, var10, -1);
                     return var10;
                  }

                  var3 = this.method4011(true, this.field7797);
                  if (var3 == -1) {
                     break label418;
                  }

                  if (~var3 == -1) {
                     return null;
                  }
               }

               label417:
               while(true) {
                  while(this.field7814.write(this.field7797, var3)) {
                     if (~this.field7814.pageOut(this.field7810) < -1) {
                        var4 = this.field7810.getSerialNumber();
                        if (!this.field7810.isBOS()) {
                           var11 = (class47)this.field7794.method3101(-1, (long)var4);
                           if (!var11.field723.pageIn(this.field7810)) {
                              throw new IllegalStateException();
                           }

                           return var11;
                        }

                        var5 = new OggStreamState(var4);
                        if (!var5.pageIn(this.field7810)) {
                           throw new IllegalStateException();
                        }

                        if (var5.packetPeek(this.field7791) != 1) {
                           throw new IllegalStateException();
                        }

                        label455: {
                           if (this.field7820 != null || !this.field7791.isTheora()) {
                              if (this.field7809 != null || !this.field7791.isVorbis()) {
                                 label450: {
                                    var6 = this.field7791.getData();
                                    var7 = new StringBuffer();
                                    var8 = 1;
                                    if (var2) {
                                       var10000 = Character.isLetterOrDigit((char)var6[var8]);
                                    } else if (var8 >= var6.length) {
                                       var9 = var7.toString();
                                       var10000 = var9.equals(field7821[5]);
                                       if (!var2) {
                                          if (!var10000) {
                                             var10 = new class426(var5);
                                             if (!var2) {
                                                break label455;
                                             }
                                          }

                                          var10 = new class75(var5);
                                          if (!var2) {
                                             break label455;
                                          }
                                          break label450;
                                       }
                                    } else {
                                       var10000 = Character.isLetterOrDigit((char)var6[var8]);
                                    }

                                    label110:
                                    while(true) {
                                       while(!var10000) {
                                          var9 = var7.toString();
                                          var10000 = var9.equals(field7821[5]);
                                          if (!var2) {
                                             if (!var10000) {
                                                var10 = new class426(var5);
                                                if (!var2) {
                                                   break label455;
                                                }
                                             }

                                             var10 = new class75(var5);
                                             if (!var2) {
                                                break label455;
                                             }
                                             break label110;
                                          }
                                       }

                                       var7.append((char)var6[var8]);
                                       ++var8;
                                       if (var8 >= var6.length) {
                                          var9 = var7.toString();
                                          var10000 = var9.equals(field7821[5]);
                                          if (!var2) {
                                             if (!var10000) {
                                                var10 = new class426(var5);
                                                if (!var2) {
                                                   break label455;
                                                }
                                             }

                                             var10 = new class75(var5);
                                             if (!var2) {
                                                break label455;
                                             }
                                             break;
                                          }
                                       } else {
                                          var10000 = Character.isLetterOrDigit((char)var6[var8]);
                                       }
                                    }
                                 }
                              }

                              this.field7809 = new class102(var5);
                              var10 = this.field7809;
                              if (!var2) {
                                 break label455;
                              }
                           }

                           this.field7820 = new class40(var5);
                           var10 = this.field7820;
                        }

                        this.field7794.method3098((long)var4, var10, -1);
                        return var10;
                     }

                     var3 = this.method4011(true, this.field7797);
                     if (var3 == -1) {
                        break label417;
                     }

                     if (~var3 == -1) {
                        return null;
                     }
                  }

                  if (!var2) {
                     throw new RuntimeException("");
                  }

                  if (var3 == -1) {
                     break;
                  }

                  if (~var3 == -1) {
                     return null;
                  }
               }
            }

            this.field7817 = true;
            return null;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field7821[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public final void method4105(byte param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mka",
      name = "f",
      descriptor = "(I)Z"
   )
   private final boolean method4106(int arg0) {
      try {
         ++field7811;
         if (arg0 != 1) {
            this.field7806 = null;
         }

         if (this.field7809 != null) {
            return !this.field7820.method473((byte)-88) || this.method4110(21090) > this.field7820.method467(3);
         } else {
            double var2 = (double)this.field7820.method469(1);
            return var2 == 0.0D || (double)class604.method4452(-126) >= 1000.0D / var2 + (double)this.field7820.method470(arg0 + -2);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7821[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method4107(byte arg0) {
      boolean var2 = client.field10022;

      try {
         class47 var3 = (class47)this.field7794.method3102(arg0 ^ -56);
         class40 var10000;
         int var4;
         if (var2) {
            var10000 = this.field7820;
         } else if (var3 == null) {
            ++field7818;
            var10000 = this.field7820;
            if (!var2) {
               if (var10000 == null) {
                  return;
               }

               var4 = 0;
               if (arg0 != 85) {
                  this.field7800 = true;
                  if (var2) {
                     if (this.field7820.field723.packetOut() != 1) {
                        this.method4111(105);
                        return;
                     }

                     this.field7820.method526(true, this.field7791);
                     ++var4;
                  }
               }

               while(var4 < 10) {
                  if (!this.method4106(1)) {
                     return;
                  }

                  if (this.field7820.field723.packetOut() != 1) {
                     this.method4111(105);
                     return;
                  }

                  this.field7820.method526(true, this.field7791);
                  ++var4;
               }

               return;
            }
         } else {
            var10000 = this.field7820;
         }

         while(true) {
            class47 var7;
            label140: {
               if (var10000 == var3) {
                  if (var2) {
                     var3.method526(true, this.field7791);
                  } else {
                     var7 = (class47)this.field7794.method3095((byte)-118);
                     if (!var2) {
                        break label140;
                     }

                     var7.method526(true, this.field7791);
                  }
               }

               while(true) {
                  while(~var3.field723.packetOut() == -2) {
                     var3.method526(true, this.field7791);
                  }

                  var7 = (class47)this.field7794.method3095((byte)-118);
                  if (!var2) {
                     break;
                  }

                  var7.method526(true, this.field7791);
               }
            }

            var3 = var7;
            if (var3 == null) {
               ++field7818;
               var10000 = this.field7820;
               if (!var2) {
                  if (var10000 == null) {
                     return;
                  }

                  var4 = 0;
                  if (arg0 != 85) {
                     this.field7800 = true;
                     if (var2) {
                        if (this.field7820.field723.packetOut() != 1) {
                           this.method4111(105);
                           return;
                        }

                        this.field7820.method526(true, this.field7791);
                        ++var4;
                     }
                  }

                  while(var4 < 10) {
                     if (!this.method4106(1)) {
                        return;
                     }

                     if (this.field7820.field723.packetOut() != 1) {
                        this.method4111(105);
                        return;
                     }

                     this.field7820.method526(true, this.field7791);
                     ++var4;
                  }

                  return;
               }
            } else {
               var10000 = this.field7820;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7821[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method4108(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(Lcu;B)Lkv;"
   )
   public static final class13 method4109(class65 arg0, byte arg1) {
      try {
         ++field7812;
         class377 var2 = class769.method5540((byte)-115, arg0);
         if (arg1 != -112) {
            field7805 = -11;
         }

         int var3 = arg0.method649((byte)46);
         return new class13(var2.field5516, var2.field5512, var2.field5508, var2.field5511, var2.field5513, var3);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7821[16] + (arg0 != null ? field7821[8] : field7821[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "g",
      descriptor = "(I)D"
   )
   public final double method4110(int arg0) {
      try {
         ++field7792;
         if (this.field7809 != null) {
            return this.field7809.method1004(0);
         } else if (arg0 != 21090) {
            return -0.8601382030669051D;
         } else {
            return this.field7820 != null ? this.field7820.method467(arg0 + -21087) : 0.0D;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7821[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method4111(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mka",
      name = "h",
      descriptor = "(I)Lws;"
   )
   public final class102 method4112(int arg0) {
      try {
         ++field7802;
         int var2 = 18 % ((-8 - arg0) / 39);
         return this.field7809;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7821[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method4113(byte arg0) throws IOException {
      boolean var2 = client.field10022;

      RuntimeException var10000;
      label209: {
         boolean var10001;
         try {
            ++field7795;
            if (arg0 != 59) {
               return;
            }

            if (this.field7813) {
               return;
            }
         } catch (RuntimeException var12) {
            var10000 = var12;
            var10001 = false;
            break label209;
         }

         while(true) {
            class47 var3;
            label204: {
               label203: {
                  try {
                     if (!this.field7801) {
                        if (!this.field7800) {
                           var3 = this.method4104(-89);
                           if (var3 == null) {
                              if (this.field7817) {
                                 this.method4107((byte)85);
                              }

                              return;
                           }

                           if (var3 == null) {
                              throw new IllegalStateException();
                           }

                           this.field7800 = true;
                           if (!var2) {
                              break label204;
                           }
                        }
                        break label203;
                     }
                  } catch (RuntimeException var11) {
                     var10000 = var11;
                     var10001 = false;
                     break;
                  }

                  if (!var2) {
                     return;
                  }
               }

               try {
                  var3 = (class47)this.field7794.method3101(arg0 + -60, (long)this.field7810.getSerialNumber());
               } catch (RuntimeException var9) {
                  var10000 = var9;
                  var10001 = false;
                  break;
               }
            }

            try {
               if (this.field7809 != var3) {
                  label214: {
                     if (var3 instanceof class75) {
                        this.method4108(arg0 + 20);
                        if (!var2) {
                           break label214;
                        }
                     }

                     if (this.field7820 != var3) {
                        if (var2) {
                           if (~var3.field727 == -2 && var3 instanceof class75) {
                              this.method4105((byte)58, this.field7804);
                           }

                           var3.method526(true, this.field7791);
                        }

                        while(true) {
                           while(var3.field723.packetOut(this.field7791) == 1) {
                              if (~var3.field727 == -2 && var3 instanceof class75) {
                                 this.method4105((byte)58, this.field7804);
                              }

                              var3.method526(true, this.field7791);
                           }

                           if (!var2) {
                              if (!var2) {
                                 break label214;
                              }
                              break;
                           }

                           var3.method526(true, this.field7791);
                        }
                     }

                     if (this.field7809 == null && !this.field7813) {
                        int var4 = 0;
                        if (var2 || var4 < 10 && this.method4106(1)) {
                           do {
                              this.method4101((byte)120);
                              if (this.field7801) {
                                 return;
                              }

                              ++var4;
                           } while(var4 < 10 && this.method4106(1));
                        }

                        return;
                     }
                  }
               } else {
                  if (this.field7809.method1005(true) >= 50) {
                     return;
                  }

                  label153:
                  while(~this.field7809.field723.packetOut(this.field7791) == -2) {
                     this.field7809.method526(true, this.field7791);
                     this.method4108(120);

                     do {
                        if (this.field7820 != null) {
                           int var13;
                           label222: {
                              double var5 = this.field7820.method467(3);
                              int var7 = 0;
                              if (var2) {
                                 this.method4101((byte)92);
                                 if (this.field7801) {
                                    return;
                                 }

                                 ++var7;
                              }

                              while(var7 < 10) {
                                 var13 = this.method4106(arg0 ^ 58);
                                 if (var2) {
                                    break label222;
                                 }

                                 if (var13 == 0) {
                                    break;
                                 }

                                 this.method4101((byte)92);
                                 if (this.field7801) {
                                    return;
                                 }

                                 ++var7;
                              }

                              double var14;
                              var13 = (var14 = var5 - this.field7820.method467(3)) == 0.0D ? 0 : (var14 < 0.0D ? -1 : 1);
                           }

                           if (var13 < 0) {
                              return;
                           }
                        }

                        if (this.field7809.method1005(true) < 50) {
                           continue label153;
                        }
                     } while(var2);

                     return;
                  }
               }

               this.field7800 = false;
            } catch (RuntimeException var10) {
               var10000 = var10;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var8 = var10000;
      throw class612.method4503(var8, field7821[20] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method4114(boolean arg0, int arg1) {
      try {
         if (this.field7809 != null) {
            class379 var3 = this.field7809.method1007(false);
            if (var3 != null) {
               var3.method2959(arg0, -79);
            }
         }

         if (arg1 == -1) {
            ++field7796;
            this.field7813 = !this.field7813;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7821[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method4115(byte arg0) {
      try {
         if (arg0 <= 106) {
            this.method4107((byte)79);
         }

         ++field7798;
         if (!this.field7801 && !this.field7817) {
            return false;
         } else {
            return this.field7809 == null || this.field7809.method1005(true) <= 0;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7821[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4116(byte arg0) {
      try {
         field7815 = null;
         int var1 = 105 / ((arg0 - 62) / 61);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7821[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class548(int arg0) {
      try {
         if (!class354.method2785(field7821[12], -108)) {
            throw new RuntimeException(field7821[11]);
         } else {
            this.field7797 = new byte[arg0];
            this.field7814 = new OggSyncState();
            this.field7810 = new OggPage();
            this.field7791 = new OggPacket();
            this.field7794 = new class398(8);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7821[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4117(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4118(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
