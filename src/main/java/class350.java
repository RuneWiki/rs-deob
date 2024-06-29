import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class350 {
   @OriginalMember(
      owner = "client!fk",
      name = "b",
      descriptor = "[B"
   )
   private byte[] field4783;
   @OriginalMember(
      owner = "client!fk",
      name = "q",
      descriptor = "Ljagtheora/ogg/OggSyncState;"
   )
   private OggSyncState field4777;
   @OriginalMember(
      owner = "client!fk",
      name = "x",
      descriptor = "Ljagtheora/ogg/OggPage;"
   )
   private OggPage field4801;
   @OriginalMember(
      owner = "client!fk",
      name = "h",
      descriptor = "Ljagtheora/ogg/OggPacket;"
   )
   private OggPacket field4807;
   @OriginalMember(
      owner = "client!fk",
      name = "w",
      descriptor = "Lhv;"
   )
   private class227 field4785;
   @OriginalMember(
      owner = "client!fk",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4809 = new String[]{method2785(method2784("\u000e\u00005KF")), method2785(method2784("\u000e\u00005MF")), method2785(method2784("\u000e\u00005BF")), method2785(method2784("\u000e\u00005LF")), method2785(method2784("\u000e\u00005WF")), method2785(method2784("\u0003\noc")), method2785(method2784("\u000e\u00005EF")), method2785(method2784("\u000e\u00005IF")), method2785(method2784("\u000e\u00005TF")), method2785(method2784("\u000e\u00005OF")), method2785(method2784("\u000e\u00005HF")), method2785(method2784("\u0013E5(\u0013")), method2785(method2784("\u000e\u00005DF")), method2785(method2784("\u0006\u001ewj")), method2785(method2784("\u000e\u00005GF")), method2785(method2784("\u000e\u00005:\u0007\u0006\u0002o8F")), method2785(method2784(".\nrj\u000b\fKoiN\u0004\u0004zbN\u0002\n|r\u0006\r\u0004igN\u0004\u0002yt\u000f\u001a\u0012")), method2785(method2784("\u0002\n|r\u0006\r\u0004ig")), method2785(method2784("\u000e\u00005@F")), method2785(method2784("\u000e\u00005UF")), method2785(method2784("<X;+N")), method2785(method2784("\u000e\u00005CF")), method2785(method2784("\u000e\u00005AF")), method2785(method2784("\u000e\u00005VF")), method2785(method2784("\u000e\u00005JF"))};
   @OriginalMember(
      owner = "client!fk",
      name = "F",
      descriptor = "Z"
   )
   public static boolean field4799 = false;
   @OriginalMember(
      owner = "client!fk",
      name = "B",
      descriptor = "I"
   )
   public static int field4778;
   @OriginalMember(
      owner = "client!fk",
      name = "u",
      descriptor = "I"
   )
   public static int field4779;
   @OriginalMember(
      owner = "client!fk",
      name = "A",
      descriptor = "I"
   )
   public static int field4781;
   @OriginalMember(
      owner = "client!fk",
      name = "m",
      descriptor = "I"
   )
   public static int field4789;
   @OriginalMember(
      owner = "client!fk",
      name = "y",
      descriptor = "I"
   )
   public static int field4790;
   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "I"
   )
   public static int field4791;
   @OriginalMember(
      owner = "client!fk",
      name = "D",
      descriptor = "I"
   )
   public static int field4792;
   @OriginalMember(
      owner = "client!fk",
      name = "r",
      descriptor = "I"
   )
   public static int field4793;
   @OriginalMember(
      owner = "client!fk",
      name = "d",
      descriptor = "I"
   )
   public static int field4794;
   @OriginalMember(
      owner = "client!fk",
      name = "j",
      descriptor = "I"
   )
   public static int field4795;
   @OriginalMember(
      owner = "client!fk",
      name = "C",
      descriptor = "I"
   )
   public static int field4796;
   @OriginalMember(
      owner = "client!fk",
      name = "f",
      descriptor = "I"
   )
   public static int field4797;
   @OriginalMember(
      owner = "client!fk",
      name = "p",
      descriptor = "I"
   )
   public static int field4798;
   @OriginalMember(
      owner = "client!fk",
      name = "s",
      descriptor = "I"
   )
   public static int field4803;
   @OriginalMember(
      owner = "client!fk",
      name = "g",
      descriptor = "I"
   )
   public static int field4804;
   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "I"
   )
   public static int field4805;
   @OriginalMember(
      owner = "client!fk",
      name = "o",
      descriptor = "I"
   )
   public static int field4806;
   @OriginalMember(
      owner = "client!fk",
      name = "E",
      descriptor = "Lee;"
   )
   private class509 field4784;
   @OriginalMember(
      owner = "client!fk",
      name = "v",
      descriptor = "Lpd;"
   )
   public static class648 field4787;
   @OriginalMember(
      owner = "client!fk",
      name = "c",
      descriptor = "Lab;"
   )
   private class652 field4800;
   @OriginalMember(
      owner = "client!fk",
      name = "l",
      descriptor = "Low;"
   )
   private class667 field4788;
   @OriginalMember(
      owner = "client!fk",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   private String field4808;
   @OriginalMember(
      owner = "client!fk",
      name = "t",
      descriptor = "Z"
   )
   private boolean field4780;
   @OriginalMember(
      owner = "client!fk",
      name = "e",
      descriptor = "Z"
   )
   private boolean field4782;
   @OriginalMember(
      owner = "client!fk",
      name = "n",
      descriptor = "Z"
   )
   private boolean field4786;
   @OriginalMember(
      owner = "client!fk",
      name = "i",
      descriptor = "Z"
   )
   private boolean field4802;

   @OriginalMember(
      owner = "client!fk",
      name = "c",
      descriptor = "(B)Lee;"
   )
   public final class509 method2765(byte arg0) {
      try {
         ++field4804;
         if (arg0 < 43) {
            this.field4783 = null;
         }

         return this.field4784;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4809[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2766(int arg0) throws IOException {
      boolean var2 = client.field1481;

      try {
         ++field4797;
         if (!this.field4802) {
            while(true) {
               int var10000;
               if (this.field4780) {
                  var10000 = arg0;
                  if (!var2) {
                     if (arg0 != 1) {
                        this.method2778((byte)72);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = this.field4786;
               }

               class409 var3;
               label157: {
                  if (var10000 == 0) {
                     var3 = this.method2780(-110);
                     if (var3 == null) {
                        if (this.field4782) {
                           this.method2769(arg0 ^ 16192);
                        }

                        return;
                     }

                     if (var3 == null) {
                        throw new IllegalStateException();
                     }

                     this.field4786 = true;
                     if (!var2) {
                        break label157;
                     }
                  }

                  var3 = (class409)this.field4785.method1818(-1, (long)this.field4801.getSerialNumber());
               }

               label230: {
                  if (this.field4800 == var3) {
                     if (this.field4800.method4792((byte)31) >= 50) {
                        return;
                     }

                     label151:
                     while(~this.field4800.field5642.packetOut(this.field4807) == -2) {
                        this.field4800.method3213(-125, this.field4807);
                        this.method2772(false);

                        do {
                           if (this.field4784 != null) {
                              label235: {
                                 double var4 = this.field4784.method3842((byte)-101);
                                 int var6 = 0;
                                 if (var2) {
                                    this.method2776((byte)51);
                                    if (this.field4780) {
                                       return;
                                    }

                                    ++var6;
                                 }

                                 while(var6 < 10) {
                                    var10000 = this.method2779(-101);
                                    if (var2) {
                                       break label235;
                                    }

                                    if (var10000 == 0) {
                                       break;
                                    }

                                    this.method2776((byte)51);
                                    if (this.field4780) {
                                       return;
                                    }

                                    ++var6;
                                 }

                                 double var10;
                                 var10000 = (var10 = this.field4784.method3842((byte)-93) - var4) == 0.0D ? 0 : (var10 < 0.0D ? -1 : 1);
                              }

                              if (var10000 > 0) {
                                 return;
                              }
                           }

                           if (this.field4800.method4792((byte)-18) < 50) {
                              continue label151;
                           }
                        } while(var2);

                        return;
                     }

                     if (!var2) {
                        if (!var2) {
                           this.field4786 = false;
                           continue;
                        }

                        this.method2775(this.field4808, true);
                        var3.method3213(arg0 + -106, this.field4807);
                        break label230;
                     }
                  }

                  if (var3 instanceof class667) {
                     this.method2772(false);
                     if (!var2) {
                        if (!var2) {
                           this.field4786 = false;
                           continue;
                        }

                        this.method2775(this.field4808, true);
                        var3.method3213(arg0 + -106, this.field4807);
                        break label230;
                     }
                  }

                  if (this.field4784 == var3) {
                     if (this.field4800 == null && !this.field4802) {
                        int var7 = 0;
                        if (var2 || var7 < 10 && this.method2779(-101)) {
                           do {
                              this.method2776((byte)51);
                              if (this.field4780) {
                                 return;
                              }

                              ++var7;
                           } while(var7 < 10 && this.method2779(-101));
                        }

                        return;
                     }

                     if (!var2) {
                        this.field4786 = false;
                        continue;
                     }

                     this.method2775(this.field4808, true);
                     var3.method3213(arg0 + -106, this.field4807);
                  }
               }

               while(true) {
                  while(var3.field5642.packetOut(this.field4807) == 1) {
                     if (var3.field5640 == 1 && var3 instanceof class667) {
                        this.method2775(this.field4808, true);
                     }

                     var3.method3213(arg0 + -106, this.field4807);
                  }

                  if (!var2) {
                     this.field4786 = false;
                     break;
                  }

                  this.method2775(this.field4808, true);
                  var3.method3213(arg0 + -106, this.field4807);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4809[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(B)Lab;"
   )
   public final class652 method2767(byte arg0) {
      try {
         if (arg0 >= -99) {
            this.field4783 = null;
         }

         ++field4795;
         return this.field4800;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4809[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "h",
      descriptor = "(I)Z"
   )
   public final boolean method2768(int arg0) {
      try {
         ++field4803;
         if (!this.field4780 && !this.field4782) {
            return false;
         } else if (this.field4800 != null && this.field4800.method4792((byte)20) > 0) {
            return false;
         } else {
            int var2 = -4 % ((arg0 - 35) / 54);
            return true;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4809[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method2769(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field4779;
         if (arg0 != 16193) {
            this.field4802 = false;
         }

         class409 var3 = (class409)this.field4785.method1817(-34);
         class409 var10000;
         int var4;
         if (var2) {
            var10000 = var3;
         } else if (var3 == null) {
            var10000 = this.field4784;
            if (!var2) {
               if (var10000 == null) {
                  return;
               }

               var4 = 0;
               if (!var2) {
                  if (var4 >= 10) {
                     return;
                  }

                  if (!this.method2779(-124)) {
                     return;
                  }
               }

               while(this.field4784.field5642.packetOut() == 1) {
                  this.field4784.method3213(-87, this.field4807);
                  if (var2) {
                     break;
                  }

                  ++var4;
                  if (var4 >= 10) {
                     return;
                  }

                  if (!this.method2779(-124)) {
                     return;
                  }
               }

               this.method2778((byte)126);
               return;
            }
         } else {
            var10000 = var3;
         }

         while(true) {
            label153: {
               if (var10000 == this.field4784) {
                  if (var2) {
                     var3.method3213(arg0 ^ -16150, this.field4807);
                  } else {
                     var10000 = (class409)this.field4785.method1812(353);
                     if (!var2) {
                        break label153;
                     }

                     var10000.method3213(arg0 ^ -16150, this.field4807);
                  }
               }

               while(true) {
                  while(var3.field5642.packetOut() == 1) {
                     var3.method3213(arg0 ^ -16150, this.field4807);
                  }

                  var10000 = (class409)this.field4785.method1812(353);
                  if (!var2) {
                     break;
                  }

                  var10000.method3213(arg0 ^ -16150, this.field4807);
               }
            }

            var3 = var10000;
            if (var3 == null) {
               var10000 = this.field4784;
               if (!var2) {
                  if (var10000 == null) {
                     return;
                  }

                  var4 = 0;
                  if (!var2) {
                     if (var4 >= 10) {
                        return;
                     }

                     if (!this.method2779(-124)) {
                        return;
                     }
                  }

                  while(this.field4784.field5642.packetOut() == 1) {
                     this.field4784.method3213(-87, this.field4807);
                     if (var2) {
                        break;
                     }

                     ++var4;
                     if (var4 >= 10) {
                        return;
                     }

                     if (!this.method2779(-124)) {
                        return;
                     }
                  }

                  this.method2778((byte)126);
                  return;
               }
            } else {
               var10000 = var3;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4809[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "([Lpd;B)V"
   )
   public static final void method2770(class648[] param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fk",
      name = "e",
      descriptor = "(I)D"
   )
   public final double method2771(int arg0) {
      try {
         ++field4793;
         if (this.field4800 != null) {
            return this.field4800.method4791(arg0 ^ 117);
         } else {
            if (arg0 != 0) {
               method2782((class519)null, -27, (class160)null, (class479)null);
            }

            return this.field4784 != null ? this.field4784.method3842((byte)-78) : 0.0D;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4809[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(Z)V"
   )
   private final void method2772(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(I[B)I"
   )
   public abstract int method2773(int arg0, byte[] arg1) throws IOException;

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method2774(byte arg0, boolean arg1) {
      try {
         if (arg0 < 42) {
            this.field4786 = false;
         }

         if (this.field4800 != null) {
            class246 var3 = this.field4800.method4790(-2985);
            if (var3 != null) {
               var3.method1960(126, arg1);
            }
         }

         ++field4796;
         this.field4802 = !this.field4802;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4809[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)V"
   )
   public final void method2775(String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fk",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method2776(byte arg0) throws IOException {
      boolean var2 = client.field1481;

      try {
         label69: {
            ++field4805;
            class409 var3;
            if (var2) {
               var3 = this.method2780(-110);
               if (var3 == null) {
                  break label69;
               }
            } else {
               if (this.field4784.field5642.packetOut(this.field4807) == 1) {
                  if (arg0 != 51) {
                     this.field4785 = null;
                  }

                  this.field4784.method3213(-98, this.field4807);
                  return;
               }

               var3 = this.method2780(-110);
               if (var3 == null) {
                  break label69;
               }
            }

            label68:
            do {
               while(true) {
                  if (this.field4788 == var3) {
                     this.method2772(false);
                     if (var2) {
                        break;
                     }

                     if (var2) {
                        break label68;
                     }
                  }

                  if (this.field4784.field5642.packetOut(this.field4807) == 1) {
                     if (arg0 != 51) {
                        this.field4785 = null;
                     }

                     this.field4784.method3213(-98, this.field4807);
                     return;
                  }

                  var3 = this.method2780(-110);
                  if (var3 == null) {
                     break label68;
                  }
               }
            } while(var3 != null);
         }

         if (this.field4782) {
            this.method2769(16193);
         }

      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4809[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(I)Low;"
   )
   public final class667 method2777(int arg0) {
      try {
         ++field4781;
         if (arg0 != -689277144) {
            this.method2775((String)null, true);
         }

         return this.field4788;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4809[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method2778(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fk",
      name = "d",
      descriptor = "(I)Z"
   )
   private final boolean method2779(int arg0) {
      try {
         ++field4806;
         if (arg0 > -97) {
            method2782((class519)null, -49, (class160)null, (class479)null);
         }

         if (this.field4800 == null) {
            double var2 = (double)this.field4784.method3837((byte)45);
            return var2 == 0.0D || (double)class163.method1353(-127) >= (double)this.field4784.method3845(0) + 1000.0D / var2;
         } else {
            return !this.field4784.method3838(28885) || this.method2771(0) > this.field4784.method3842((byte)-50);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4809[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "f",
      descriptor = "(I)Lhca;"
   )
   private final class409 method2780(int arg0) throws IOException {
      boolean var2 = client.field1481;

      try {
         ++field4798;
         if (this.field4780) {
            throw new IllegalStateException();
         } else if (this.field4782) {
            return null;
         } else {
            label357: {
               int var3;
               int var4;
               class409 var5;
               OggStreamState var6;
               class409 var7;
               byte[] var8;
               StringBuffer var9;
               int var10;
               String var11;
               boolean var10000;
               if (arg0 > -99) {
                  this.field4784 = null;
                  if (var2) {
                     var3 = this.method2773(70, this.field4783);
                     if (var3 == -1) {
                        break label357;
                     }

                     if (~var3 == -1) {
                        return null;
                     }
                  } else {
                     if (this.field4777.pageOut(this.field4801) > 0) {
                        var4 = this.field4801.getSerialNumber();
                        if (!this.field4801.isBOS()) {
                           var5 = (class409)this.field4785.method1818(-1, (long)var4);
                           if (!var5.field5642.pageIn(this.field4801)) {
                              throw new IllegalStateException();
                           }

                           return var5;
                        }

                        var6 = new OggStreamState(var4);
                        if (!var6.pageIn(this.field4801)) {
                           throw new IllegalStateException();
                        }

                        if (var6.packetPeek(this.field4807) != 1) {
                           throw new IllegalStateException();
                        }

                        label384: {
                           if (this.field4784 != null || !this.field4807.isTheora()) {
                              if (this.field4800 == null && this.field4807.isVorbis()) {
                                 this.field4800 = new class652(var6);
                                 var7 = this.field4800;
                                 if (!var2) {
                                    break label384;
                                 }
                              }

                              label296: {
                                 var8 = this.field4807.getData();
                                 var9 = new StringBuffer();
                                 var10 = 1;
                                 if (var2) {
                                    var10000 = Character.isLetterOrDigit((char)var8[var10]);
                                 } else if (var8.length <= var10) {
                                    var11 = var9.toString();
                                    var10000 = var11.equals(field4809[5]);
                                    if (!var2) {
                                       break label296;
                                    }
                                 } else {
                                    var10000 = Character.isLetterOrDigit((char)var8[var10]);
                                 }

                                 label299:
                                 while(true) {
                                    while(!var10000) {
                                       var11 = var9.toString();
                                       var10000 = var11.equals(field4809[5]);
                                       if (!var2) {
                                          break label299;
                                       }
                                    }

                                    var9.append((char)var8[var10]);
                                    ++var10;
                                    if (var8.length <= var10) {
                                       var11 = var9.toString();
                                       var10000 = var11.equals(field4809[5]);
                                       if (!var2) {
                                          break;
                                       }
                                    } else {
                                       var10000 = Character.isLetterOrDigit((char)var8[var10]);
                                    }
                                 }
                              }

                              if (var10000) {
                                 var7 = new class667(var6);
                                 if (!var2) {
                                    break label384;
                                 }
                              }

                              var7 = new class113(var6);
                              if (!var2) {
                                 break label384;
                              }
                           }

                           this.field4784 = new class509(var6);
                           var7 = this.field4784;
                        }

                        this.field4785.method1808((long)var4, var7, 26459);
                        return var7;
                     }

                     var3 = this.method2773(70, this.field4783);
                     if (var3 == -1) {
                        break label357;
                     }

                     if (~var3 == -1) {
                        return null;
                     }
                  }
               } else {
                  if (this.field4777.pageOut(this.field4801) > 0) {
                     var4 = this.field4801.getSerialNumber();
                     if (!this.field4801.isBOS()) {
                        var5 = (class409)this.field4785.method1818(-1, (long)var4);
                        if (!var5.field5642.pageIn(this.field4801)) {
                           throw new IllegalStateException();
                        }

                        return var5;
                     }

                     var6 = new OggStreamState(var4);
                     if (!var6.pageIn(this.field4801)) {
                        throw new IllegalStateException();
                     }

                     if (var6.packetPeek(this.field4807) != 1) {
                        throw new IllegalStateException();
                     }

                     label385: {
                        if (this.field4784 != null || !this.field4807.isTheora()) {
                           if (this.field4800 == null && this.field4807.isVorbis()) {
                              this.field4800 = new class652(var6);
                              var7 = this.field4800;
                              if (!var2) {
                                 break label385;
                              }
                           }

                           label187: {
                              var8 = this.field4807.getData();
                              var9 = new StringBuffer();
                              var10 = 1;
                              if (var2) {
                                 var10000 = Character.isLetterOrDigit((char)var8[var10]);
                              } else if (var8.length <= var10) {
                                 var11 = var9.toString();
                                 var10000 = var11.equals(field4809[5]);
                                 if (!var2) {
                                    break label187;
                                 }
                              } else {
                                 var10000 = Character.isLetterOrDigit((char)var8[var10]);
                              }

                              label190:
                              while(true) {
                                 while(!var10000) {
                                    var11 = var9.toString();
                                    var10000 = var11.equals(field4809[5]);
                                    if (!var2) {
                                       break label190;
                                    }
                                 }

                                 var9.append((char)var8[var10]);
                                 ++var10;
                                 if (var8.length <= var10) {
                                    var11 = var9.toString();
                                    var10000 = var11.equals(field4809[5]);
                                    if (!var2) {
                                       break;
                                    }
                                 } else {
                                    var10000 = Character.isLetterOrDigit((char)var8[var10]);
                                 }
                              }
                           }

                           if (var10000) {
                              var7 = new class667(var6);
                              if (!var2) {
                                 break label385;
                              }
                           }

                           var7 = new class113(var6);
                           if (!var2) {
                              break label385;
                           }
                        }

                        this.field4784 = new class509(var6);
                        var7 = this.field4784;
                     }

                     this.field4785.method1808((long)var4, var7, 26459);
                     return var7;
                  }

                  var3 = this.method2773(70, this.field4783);
                  if (var3 == -1) {
                     break label357;
                  }

                  if (~var3 == -1) {
                     return null;
                  }
               }

               label356:
               while(true) {
                  while(this.field4777.write(this.field4783, var3)) {
                     if (this.field4777.pageOut(this.field4801) > 0) {
                        var4 = this.field4801.getSerialNumber();
                        if (!this.field4801.isBOS()) {
                           var5 = (class409)this.field4785.method1818(-1, (long)var4);
                           if (!var5.field5642.pageIn(this.field4801)) {
                              throw new IllegalStateException();
                           }

                           return var5;
                        }

                        var6 = new OggStreamState(var4);
                        if (!var6.pageIn(this.field4801)) {
                           throw new IllegalStateException();
                        }

                        if (var6.packetPeek(this.field4807) != 1) {
                           throw new IllegalStateException();
                        }

                        label386: {
                           if (this.field4784 != null || !this.field4807.isTheora()) {
                              if (this.field4800 == null && this.field4807.isVorbis()) {
                                 this.field4800 = new class652(var6);
                                 var7 = this.field4800;
                                 if (!var2) {
                                    break label386;
                                 }
                              }

                              label90: {
                                 var8 = this.field4807.getData();
                                 var9 = new StringBuffer();
                                 var10 = 1;
                                 if (var2) {
                                    var10000 = Character.isLetterOrDigit((char)var8[var10]);
                                 } else if (var8.length <= var10) {
                                    var11 = var9.toString();
                                    var10000 = var11.equals(field4809[5]);
                                    if (!var2) {
                                       break label90;
                                    }
                                 } else {
                                    var10000 = Character.isLetterOrDigit((char)var8[var10]);
                                 }

                                 label89:
                                 while(true) {
                                    while(!var10000) {
                                       var11 = var9.toString();
                                       var10000 = var11.equals(field4809[5]);
                                       if (!var2) {
                                          break label89;
                                       }
                                    }

                                    var9.append((char)var8[var10]);
                                    ++var10;
                                    if (var8.length <= var10) {
                                       var11 = var9.toString();
                                       var10000 = var11.equals(field4809[5]);
                                       if (!var2) {
                                          break;
                                       }
                                    } else {
                                       var10000 = Character.isLetterOrDigit((char)var8[var10]);
                                    }
                                 }
                              }

                              if (var10000) {
                                 var7 = new class667(var6);
                                 if (!var2) {
                                    break label386;
                                 }
                              }

                              var7 = new class113(var6);
                              if (!var2) {
                                 break label386;
                              }
                           }

                           this.field4784 = new class509(var6);
                           var7 = this.field4784;
                        }

                        this.field4785.method1808((long)var4, var7, 26459);
                        return var7;
                     }

                     var3 = this.method2773(70, this.field4783);
                     if (var3 == -1) {
                        break label356;
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

            this.field4782 = true;
            return null;
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field4809[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2781(int arg0) {
      try {
         field4787 = null;
         if (arg0 != -65536) {
            field4799 = true;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4809[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(Lkka;ILija;Lha;)V"
   )
   public static final void method2782(class519 arg0, int arg1, class160 arg2, class479 arg3) {
      boolean var4 = client.field1481;

      try {
         int var5 = -79 / ((59 - arg1) / 59);
         ++field4778;
         class648 var6 = arg0.method3902(arg3, -6);
         if (var6 != null) {
            int var7 = var6.method2394();
            if (var6.method2404() > var7) {
               var7 = var6.method2404();
            }

            byte var8 = 10;
            int var9 = arg2.field2045;
            int var10 = arg2.field2049;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            if (arg0.field7289 != null) {
               var11 = class13.field253.method149(arg0.field7289, (class648[])null, class616.field9070, (int[])null, 75);
               int var14 = 0;
               if (var4 || ~var14 > ~var11) {
                  do {
                     String var15 = class616.field9070[var14];
                     if (var11 + -1 > var14) {
                        var15 = var15.substring(0, -4 + var15.length());
                     }

                     int var16 = class783.field11427.method3106(var15);
                     if (~var12 > ~var16) {
                        var12 = var16;
                     }

                     ++var14;
                  } while(~var14 > ~var11);
               }

               var13 = class783.field11427.method3107() * var11 + class783.field11427.method3108() / 2;
            }

            int var17;
            label102: {
               var17 = var7 / 2 + arg2.field2045;
               if (~var9 > ~(class326.field4498 + var7)) {
                  var9 = class326.field4498;
                  var17 = var7 / 2 + class326.field4498 + var12 / 2 + var8 - -5;
                  if (!var4) {
                     break label102;
                  }
               }

               if (-var7 + class326.field4501 < var9) {
                  var9 = class326.field4501 - var7;
                  var17 = -(var12 / 2) + class326.field4501 + -(var7 / 2) + -var8 + -5;
               }
            }

            int var18;
            label97: {
               var18 = arg2.field2049;
               if (var10 >= class326.field4506 - -var7) {
                  if (~(-var7 + class326.field4494) <= ~var10) {
                     break label97;
                  }

                  var10 = -var7 + class326.field4494;
                  var18 = -(var7 / 2) + class326.field4494 + -var13 + -var8;
                  if (!var4) {
                     break label97;
                  }
               }

               var18 = var7 / 2 + class326.field4506 + var8;
               var10 = class326.field4506;
            }

            int var19 = 65535 & (int)(32767.0D * (Math.atan2((double)(var9 - arg2.field2045), (double)(var10 - arg2.field2049)) / 3.141592653589793D));
            var6.method4763((float)var7 / 2.0F + (float)var9, (float)var7 / 2.0F + (float)var10, 4096, var19);
            int var20 = -2;
            int var21 = -2;
            int var22 = -2;
            int var23 = -2;
            if (arg0.field7289 != null) {
               var20 = var17 + -5 - var12 / 2;
               var21 = var18;
               var22 = var20 - -var12 + 10;
               var23 = var18 + class783.field11427.method3107() * var11 - -3;
               if (arg0.field7298 != 0) {
                  arg3.method3643(false, var18, arg0.field7298, var20, -var20 + var22, -var18 + var23);
               }

               if (~arg0.field7275 != -1) {
                  arg3.method3645(-var18 + var23, var20, arg0.field7275, -var20 + var22, (byte)66, var18);
               }

               int var24 = 0;
               if (var4 || var24 < var11) {
                  do {
                     String var25 = class616.field9070[var24];
                     if (var11 - 1 > var24) {
                        var25 = var25.substring(0, -4 + var25.length());
                     }

                     class783.field11427.method3109(arg3, var25, var17, var18, arg0.field7262, true);
                     var18 += class783.field11427.method3107();
                     ++var24;
                  } while(var24 < var11);
               }
            }

            if (~arg0.field7279 != 0 || arg0.field7289 != null) {
               int var26 = var7 >> 1;
               class387 var27 = new class387(arg2);
               var27.field5364 = var20;
               var27.field5358 = var10 + var26;
               var27.field5353 = var21;
               var27.field5352 = -var26 + var10;
               var27.field5349 = var9 - -var26;
               var27.field5351 = var23;
               var27.field5354 = var22;
               var27.field5361 = var9 - var26;
               class138.field1748.method279(false, var27);
            }

         }
      } catch (RuntimeException var29) {
         throw class93.method866(var29, field4809[24] + (arg0 != null ? field4809[11] : field4809[13]) + ',' + arg1 + ',' + (arg2 != null ? field4809[11] : field4809[13]) + ',' + (arg3 != null ? field4809[11] : field4809[13]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(Lifa;B)V"
   )
   public static final void method2783(class75 arg0, byte arg1) {
      boolean var2 = client.field1481;

      try {
         ++field4792;
         class431 var3 = class387.field5365.field8764;
         if (class684.field10075 == arg0) {
            int var4 = var3.method603(-2);
            int var5 = var3.method640(255);
            class438.field5967.method929((byte)-97, var4).method2374(var5, (byte)-37);
         } else if (class190.field2414 == arg0) {
            int var7;
            int var8;
            boolean var10;
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            label390: {
               int var6 = var3.method640(255);
               var7 = ((244 & var6) >> 4) + class720.field10547 * 2;
               var8 = class6.field82 * 2 - -(var6 & 15);
               int var9 = var3.method640(255);
               var10 = (var9 & 1) != 0;
               boolean var11 = (var9 & 2) != 0;
               var12 = !var11 ? -1 : var9 >> 2;
               var13 = var7 + var3.method628((byte)-12);
               var14 = var8 + var3.method628((byte)-12);
               var15 = var3.method652((byte)37);
               var16 = var3.method652((byte)32);
               var17 = var3.method603(-2);
               var18 = var3.method640(255);
               if (var11) {
                  var18 = (byte)var18;
                  if (!var2) {
                     break label390;
                  }
               }

               var18 *= 4;
            }

            int var19 = 4 * var3.method640(255);
            int var20 = var3.method603(-2);
            int var21 = var3.method603(-2);
            int var22 = var3.method640(255);
            if (var22 == 255) {
               var22 = -1;
            }

            int var23 = var3.method603(-2);
            if (~var7 <= -1 && ~var8 <= -1 && class273.field3491 * 2 > var7 && ~var8 > ~(class273.field3491 * 2) && ~var13 <= -1 && var14 >= 0 && ~var13 > ~(class211.field2689 * 2) && var14 < class211.field2689 * 2 && ~var17 != -65536) {
               int var24 = var8 * 256;
               int var25 = var13 * 256;
               int var26 = var7 * 256;
               int var27 = var18 << 2;
               int var28 = var23 << 2;
               int var29 = var19 << 2;
               int var30 = var14 * 256;
               if (~var15 != -1 && ~var12 != 0) {
                  class9 var31 = null;
                  if (var15 >= 0) {
                     int var32 = var15 + -1;
                     class411 var33 = (class411)class35.field493.method1818(-1, (long)var32);
                     if (var33 != null) {
                        var31 = var33.field5654;
                     }
                  } else {
                     int var34 = -var15 + -1;
                     if (~class16.field280 == ~var34) {
                        var31 = class204.field2593;
                     } else {
                        var31 = class59.field771[var34];
                     }
                  }

                  if (var31 != null) {
                     class516 var35 = var31.method71(-12710);
                     if (var35.field7219 != null && var35.field7219[var12] != null) {
                        var27 -= var35.field7219[var12][1];
                     }

                     if (var35.field7201 != null && var35.field7201[var12] != null) {
                        var27 -= var35.field7201[var12][1];
                     }
                  }
               }

               class268 var36 = new class268(var17, class515.field7178, class515.field7178, var26, var24, var27, class413.field5678 + var20, class413.field5678 + var21, var22, var28, var15, var16, var29, var10, var12);
               var36.method2141(var30, var25, class413.field5678 + var20, class215.method1757(var25, false, class515.field7178, var30) + -var29, (byte)-116);
               class696.field10201.method279(false, new class478(var36));
            }

         } else {
            int var10000;
            if (class226.field2823 == arg0) {
               int var37 = var3.method640(255);
               int var38 = (var37 & 7) + class6.field82;
               int var39 = var38 - -class353.field4940;
               int var40 = ((126 & var37) >> 4) + class720.field10547;
               int var41 = class539.field7889 + var40;
               int var42 = var3.method603(-2);
               int var43 = var3.method603(-2);
               int var44 = var3.method603(-2);
               if (class207.field2635 != null) {
                  class206 var45 = (class206)class207.field2635.method1818(-1, (long)(var41 | class515.field7178 << 28 | var39 << 14));
                  if (var45 != null) {
                     int var10001;
                     label425: {
                        class486 var46 = (class486)var45.field2626.method288(0);
                        if (var2) {
                           var10000 = 32767 & var42;
                           var10001 = var46.field6782;
                        } else if (var46 == null) {
                           var10000 = ~var40;
                           var10001 = -1;
                           if (!var2) {
                              break label425;
                           }
                        } else {
                           var10000 = 32767 & var42;
                           var10001 = var46.field6782;
                        }

                        label424:
                        do {
                           while(true) {
                              if (var10000 == var10001) {
                                 if (var46.field6786 == var43) {
                                    var46.method4924(-2970);
                                    var46.field6786 = var44;
                                    class578.method4329((byte)108, var39, class515.field7178, var41, var46);
                                    if (!var2) {
                                       var10000 = ~var40;
                                       var10001 = -1;
                                       break;
                                    }

                                    var46 = (class486)var45.field2626.method290(17958);
                                 } else {
                                    var46 = (class486)var45.field2626.method290(17958);
                                 }
                              } else {
                                 var46 = (class486)var45.field2626.method290(17958);
                              }

                              if (var46 == null) {
                                 var10000 = ~var40;
                                 var10001 = -1;
                                 if (!var2) {
                                    break label424;
                                 }
                              } else {
                                 var10000 = 32767 & var42;
                                 var10001 = var46.field6782;
                              }
                           }
                        } while(var2);
                     }

                     if (var10000 <= var10001 && var38 >= 0 && ~class273.field3491 < ~var40 && var38 < class211.field2689) {
                        class19.method144(var40, class515.field7178, var38, true);
                     }
                  }
               }

            } else if (class280.field3571 == arg0) {
               int var47 = var3.method633((byte)-15);
               int var48 = (var47 & 7) + class6.field82;
               int var49 = class353.field4940 + var48;
               int var50 = (7 & var47 >> 4) + class720.field10547;
               int var51 = class539.field7889 + var50;
               int var52 = var3.method661((byte)-72);
               class206 var53 = (class206)class207.field2635.method1818(-1, (long)(var51 | var49 << 14 | class515.field7178 << 28));
               if (var53 != null) {
                  label459: {
                     class486 var54 = (class486)var53.field2626.method288(0);
                     if (var2) {
                        var10000 = ~var54.field6782;
                     } else if (var54 == null) {
                        var10000 = var53.field2626.method285((byte)-125);
                        if (!var2) {
                           break label459;
                        }
                     } else {
                        var10000 = ~var54.field6782;
                     }

                     label458:
                     do {
                        while(true) {
                           if (var10000 == ~(var52 & 32767)) {
                              var54.method4924(-2970);
                              if (!var2) {
                                 var10000 = var53.field2626.method285((byte)-125);
                                 break;
                              }

                              var54 = (class486)var53.field2626.method290(17958);
                           } else {
                              var54 = (class486)var53.field2626.method290(17958);
                           }

                           if (var54 == null) {
                              var10000 = var53.field2626.method285((byte)-125);
                              if (!var2) {
                                 break label458;
                              }
                           } else {
                              var10000 = ~var54.field6782;
                           }
                        }
                     } while(var2);
                  }

                  if (var10000 != 0) {
                     var53.method4924(-2970);
                  }

                  if (var50 >= 0 && var48 >= 0 && ~class273.field3491 < ~var50 && ~class211.field2689 < ~var48) {
                     class19.method144(var50, class515.field7178, var48, true);
                  }
               }

            } else if (client.field1465 == arg0) {
               int var55 = var3.method640(255);
               boolean var56 = ~(var55 & 128) != -1;
               int var57 = class720.field10547 - -((var55 & 58) >> 3);
               int var58 = (7 & var55) + class6.field82;
               int var59 = var3.method628((byte)-12) + var57;
               int var60 = var3.method628((byte)-12) + var58;
               int var61 = var3.method652((byte)30);
               int var62 = var3.method603(-2);
               int var63 = 4 * var3.method640(255);
               int var64 = var3.method640(255) * 4;
               int var65 = var3.method603(-2);
               int var66 = var3.method603(-2);
               int var67 = var3.method640(255);
               int var68 = var3.method603(-2);
               if (~var67 == -256) {
                  var67 = -1;
               }

               if (var57 >= 0 && var58 >= 0 && var57 < class273.field3491 && var58 < class211.field2689 && ~var59 <= -1 && ~var60 <= -1 && var59 < class273.field3491 && class211.field2689 > var60 && ~var62 != -65536) {
                  int var69 = var57 * 512 + 256;
                  int var70 = var58 * 512 - -256;
                  int var71 = var63 << 2;
                  int var72 = var64 << 2;
                  int var73 = var68 << 2;
                  int var74 = var59 * 512 - -256;
                  int var75 = var60 * 512 + 256;
                  class268 var76 = new class268(var62, class515.field7178, class515.field7178, var69, var70, var71, class413.field5678 + var65, class413.field5678 + var66, var67, var73, 0, var61, var72, var56, -1);
                  var76.method2141(var75, var74, class413.field5678 + var65, -var72 + class215.method1757(var74, false, class515.field7178, var75), (byte)-101);
                  class696.field10201.method279(false, new class478(var76));
               }

            } else if (class698.field10225 == arg0) {
               var3.method640(255);
               int var77 = var3.method640(255);
               int var78 = class720.field10547 - -((117 & var77) >> 4);
               int var79 = (var77 & 7) + class6.field82;
               int var80 = var3.method603(-2);
               int var81 = var3.method640(255);
               int var82 = var3.method645((byte)-26);
               String var83 = var3.method606(11856);
               class649.method4773(var83, var81, class515.field7178, var82, var80, var79, var78, -83);
            } else if (class794.field11616 == arg0) {
               int var84 = var3.method640(255);
               int var85 = ((116 & var84) >> 4) + class720.field10547;
               int var86 = class6.field82 - -(var84 & 7);
               int var87 = var3.method603(-2);
               if (var87 == 65535) {
                  var87 = -1;
               }

               int var88 = var3.method640(255);
               int var89 = var88 >> 4 & 15;
               int var90 = var88 & 7;
               int var91 = var3.method640(255);
               int var92 = var3.method640(255);
               int var93 = var3.method603(-2);
               if (~var85 <= -1 && var86 >= 0 && ~class273.field3491 < ~var85 && var86 < class211.field2689) {
                  int var94 = var89 + 1;
                  if (~(-var94 + var85) >= ~class204.field2593.field210[0] && ~class204.field2593.field210[0] >= ~(var85 + var94) && class204.field2593.field205[0] >= -var94 + var86 && ~(var86 - -var94) <= ~class204.field2593.field205[0]) {
                     class497.method3781(var91, (class515.field7178 << 24) + var89 - (-(var85 << 16) + -(var86 << 8)), var87, var90, var93, var92, false);
                  }
               }

            } else if (class543.field7928 == arg0) {
               int var95 = var3.method603(-2);
               int var96 = var3.method640(255);
               int var97 = (7 & var96) + class6.field82;
               int var98 = class353.field4940 + var97;
               int var99 = ((118 & var96) >> 4) + class720.field10547;
               int var100 = class539.field7889 + var99;
               int var101 = var3.method642(false);
               int var102 = var3.method642(false);
               if (~class16.field280 != ~var95) {
                  boolean var103 = ~var99 <= -1 && ~var97 <= -1 && class273.field3491 > var99 && var97 < class211.field2689;
                  if (var103 || class411.method3225((byte)0, class493.field6885)) {
                     class578.method4329((byte)98, var98, class515.field7178, var100, new class486(var102, var101));
                     if (var103) {
                        class19.method144(var99, class515.field7178, var97, true);
                     }
                  }
               }

            } else if (class518.field7251 == arg0) {
               int var104 = var3.method640(255);
               int var105 = (var104 >> 4 & 7) + class720.field10547;
               int var106 = (var104 & 7) + class6.field82;
               int var107 = var3.method603(-2);
               int var108 = var3.method640(255);
               int var109 = var3.method603(-2);
               int var110 = var3.method640(255);
               if (var105 >= 0 && ~var106 <= -1 && ~var105 > ~class273.field3491 && ~var106 > ~class211.field2689) {
                  int var111 = var105 * 512 - -256;
                  int var112 = var106 * 512 + 256;
                  int var113 = class515.field7178;
                  if (~var113 > -4 && class738.method5357(var106, var105, -20749)) {
                     ++var113;
                  }

                  class527 var114 = new class527(var107, var109, class413.field5678, class515.field7178, var113, var111, class215.method1757(var111, false, class515.field7178, var112) - var108, var112, var105, var105, var106, var106, var110);
                  class194.field2464.method279(false, new class211(var114));
               }

            } else if (class13.field252 == arg0) {
               int var115 = var3.method642(false);
               class294 var116 = class438.field5967.method929((byte)-111, var115);
               int var117 = var3.method633((byte)-15);
               int var118 = var117 >> 2;
               int var119 = class629.field9292[var118];
               int var120 = var3.method640(255);
               int var121 = (7 & var120 >> 4) + class720.field10547;
               int var122 = (7 & var120) + class6.field82;
               int var123 = var3.method640(255);
               if (~var118 == -12) {
                  var118 = 10;
               }

               int var124 = 0;
               if (var116.field4115 != null) {
                  label539: {
                     int var125 = -1;
                     int var126 = 0;
                     if (var2) {
                        var10000 = ~var116.field4115[var126];
                     } else if (~var126 <= ~var116.field4115.length) {
                        var10000 = var116.field4081[var125].length;
                        if (!var2) {
                           break label539;
                        }
                     } else {
                        var10000 = ~var116.field4115[var126];
                     }

                     label538:
                     do {
                        while(true) {
                           if (var10000 == ~var118) {
                              var125 = var126;
                              if (!var2) {
                                 var10000 = var116.field4081[var126].length;
                                 break;
                              }

                              ++var126;
                           } else {
                              ++var126;
                           }

                           if (~var126 <= ~var116.field4115.length) {
                              var10000 = var116.field4081[var125].length;
                              if (!var2) {
                                 break label538;
                              }
                           } else {
                              var10000 = ~var116.field4115[var126];
                           }
                        }
                     } while(var2);
                  }

                  var124 = var10000;
               }

               int var127 = 0;
               if (var116.field4086 != null) {
                  var127 = var116.field4086.length;
               }

               int var128 = 0;
               if (var116.field4098 != null) {
                  var128 = var116.field4098.length;
               }

               if (~(var123 & 1) == -2) {
                  class249.method1980((class271)null, var121, var119, (byte)-8, var122, class515.field7178);
               } else {
                  int[] var129 = null;
                  if ((var123 & 2) == 2) {
                     var129 = new int[var124];
                     int var130 = 0;
                     if (var2) {
                        var129[var130] = var3.method603(-2);
                        ++var130;
                     }

                     while(~var130 > ~var124) {
                        var129[var130] = var3.method603(-2);
                        ++var130;
                     }
                  }

                  short[] var131 = null;
                  if ((var123 & 4) == 4) {
                     var131 = new short[var127];
                     int var132 = 0;
                     if (var2 || var127 > var132) {
                        do {
                           var131[var132] = (short)var3.method603(-2);
                           ++var132;
                        } while(var127 > var132);
                     }
                  }

                  short[] var133 = null;
                  if ((8 & var123) == 8) {
                     var133 = new short[var128];
                     int var134 = 0;
                     if (var2 || var128 > var134) {
                        do {
                           var133[var134] = (short)var3.method603(-2);
                           ++var134;
                        } while(var128 > var134);
                     }
                  }

                  class249.method1980(new class271((long)(class705.field10312++), var129, var131, var133), var121, var119, (byte)-8, var122, class515.field7178);
               }
            } else if (class469.field6461 == arg0) {
               int var135 = var3.method633((byte)-15);
               int var136 = var135 >> 2;
               int var137 = 3 & var135;
               int var138 = class629.field9292[var136];
               int var139 = var3.method627((byte)-117);
               if (~var139 == -65536) {
                  var139 = -1;
               }

               int var140 = var3.method640(255);
               int var141 = class720.field10547 - -(var140 >> 4 & 7);
               int var142 = (var140 & 7) + class6.field82;
               class340.method2719(var142, var138, var139, var141, var136, var137, (byte)-9, class515.field7178);
            } else if (class576.field8547 == arg0) {
               int var143 = var3.method622((byte)78);
               int var144 = ((var143 & 112) >> 4) + class720.field10547;
               int var145 = (var143 & 7) + class6.field82;
               int var146 = var3.method622((byte)87);
               int var147 = var146 >> 2;
               int var148 = 3 & var146;
               int var149 = class629.field9292[var147];
               int var150 = var3.method661((byte)-77);
               if (class411.method3225((byte)0, class493.field6885) || ~var144 <= -1 && ~var145 <= -1 && ~var144 > ~class273.field3491 && class211.field2689 > var145) {
                  class693.method5053(var149, var147, class515.field7178, var145, var144, var150, -1, var148);
               }

            } else if (class509.field7100 == arg0) {
               int var151 = var3.method640(255);
               int var152 = class720.field10547 - -(var151 >> 4 & 7);
               int var153 = (7 & var151) + class6.field82;
               int var154 = var3.method603(-2);
               if (~var154 == -65536) {
                  var154 = -1;
               }

               int var155 = var3.method640(255);
               int var156 = (var155 & 241) >> 4;
               int var157 = var155 & 7;
               int var158 = var3.method640(255);
               int var159 = var3.method640(255);
               int var160 = var3.method603(-2);
               if (~var152 <= -1 && var153 >= 0 && ~var152 > ~class273.field3491 && class211.field2689 > var153) {
                  int var161 = var156 - -1;
                  if (~class204.field2593.field210[0] <= ~(-var161 + var152) && var152 + var161 >= class204.field2593.field210[0] && ~(-var161 + var153) >= ~class204.field2593.field205[0] && ~(var153 + var161) <= ~class204.field2593.field205[0]) {
                     class182.method1529(0, var154, false, var159, var158, (class515.field7178 << 24) + (var152 << 16) + (var153 << 8) + var156, var160, var157);
                  }
               }

            } else if (class582.field8596 == arg0) {
               int var162 = var3.method626(255);
               int var163 = (7 & var162 >> 4) + class720.field10547;
               int var164 = class6.field82 - -(var162 & 7);
               int var165 = var3.method633((byte)-15);
               int var166 = var165 >> 2;
               int var167 = var165 & 3;
               int var168 = class629.field9292[var166];
               if (class411.method3225((byte)0, class493.field6885) || var163 >= 0 && var164 >= 0 && ~var163 > ~class273.field3491 && var164 < class211.field2689) {
                  class693.method5053(var168, var166, class515.field7178, var164, var163, -1, -1, var167);
               }

            } else if (class373.field5224 != arg0) {
               class668.method4877((byte)126, (Throwable)null, field4809[20] + arg0);
               class367.method2893(false, 255);
               int var177 = 24 / ((-42 - arg1) / 50);
            } else {
               int var169 = var3.method627((byte)-116);
               int var170 = var3.method661((byte)-114);
               int var171 = var3.method622((byte)109);
               int var172 = (var171 & 7) + class6.field82;
               int var173 = class353.field4940 + var172;
               int var174 = (var171 >> 4 & 7) + class720.field10547;
               int var175 = class539.field7889 + var174;
               boolean var176 = var174 >= 0 && var172 >= 0 && ~class273.field3491 < ~var174 && ~var172 > ~class211.field2689;
               if (var176 || class411.method3225((byte)0, class493.field6885)) {
                  class578.method4329((byte)-116, var173, class515.field7178, var175, new class486(var170, var169));
                  if (var176) {
                     class19.method144(var174, class515.field7178, var172, true);
                  }
               }

            }
         }
      } catch (RuntimeException var179) {
         throw class93.method866(var179, field4809[19] + (arg0 != null ? field4809[11] : field4809[13]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class350(int arg0) {
      try {
         if (!class52.method385(field4809[17], -48)) {
            throw new RuntimeException(field4809[16]);
         } else {
            this.field4783 = new byte[arg0];
            this.field4777 = new OggSyncState();
            this.field4801 = new OggPage();
            this.field4807 = new OggPacket();
            this.field4785 = new class227(8);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4809[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2784(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2785(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
