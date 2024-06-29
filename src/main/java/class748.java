import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public abstract class class748 {
   @OriginalMember(
      owner = "client!pca",
      name = "n",
      descriptor = "[B"
   )
   private byte[] field10878;
   @OriginalMember(
      owner = "client!pca",
      name = "k",
      descriptor = "Ljagtheora/ogg/OggSyncState;"
   )
   private OggSyncState field10876;
   @OriginalMember(
      owner = "client!pca",
      name = "C",
      descriptor = "Ljagtheora/ogg/OggPage;"
   )
   private OggPage field10867;
   @OriginalMember(
      owner = "client!pca",
      name = "B",
      descriptor = "Ljagtheora/ogg/OggPacket;"
   )
   private OggPacket field10863;
   @OriginalMember(
      owner = "client!pca",
      name = "w",
      descriptor = "Ldia;"
   )
   private class245 field10861;
   @OriginalMember(
      owner = "client!pca",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10886 = new String[]{method5408(method5407("\u0017\u0014\tf\u0003O")), method5408(method5407("\u0017\u0014\tf\u0007O")), method5408(method5407("\u0017\u0014\tf\u000eO")), method5408(method5407("\u0017\u0014\tf\u000fO")), method5408(method5407("\u0017\u0014\tf\u0006O")), method5408(method5407("\f\u0016\u001c-")), method5408(method5407("\u0017\u0014\tf\bO")), method5408(method5407("\u0017\u0014\tf\tO")), method5408(method5407("\u0017\u0014\tf\u0005O")), method5408(method5407("\u0017\u0014\tf\u001bO")), method5408(method5407("\t\u0002\u0004$")), method5408(method5407("\u0017\u0014\tf\fO")), method5408(method5407("\u001cYFf6")), method5408(method5407("\u0017\u0014\tf\u0001O")), method5408(method5407("\u0017\u0014\tf\nO")), method5408(method5407("\u0017\u0014\tf\u0000O")), method5408(method5407("\u0017\u0014\tf\rO")), method5408(method5407("\u0017\u0014\tf\u0004O")), method5408(method5407("!\u0016\u0001$.\u0003W\u001c'k\u000b\u0018\t,k\r\u0016\u000f<#\u0002\u0018\u001a)k\u000b\u001e\n:*\u0015\u000e")), method5408(method5407("\r\u0016\u000f<#\u0002\u0018\u001a)")), method5408(method5407("\u0017\u0014\tfw\u000e\u0019\u0001<uO"))};
   @OriginalMember(
      owner = "client!pca",
      name = "m",
      descriptor = "Lbga;"
   )
   public static class378 field10858 = new class378(12, -2);
   @OriginalMember(
      owner = "client!pca",
      name = "y",
      descriptor = "Lnw;"
   )
   public static class616 field10884 = new class616(20, -1);
   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "Leka;"
   )
   public static class494 field10885 = new class494();
   @OriginalMember(
      owner = "client!pca",
      name = "f",
      descriptor = "I"
   )
   public static int field10856;
   @OriginalMember(
      owner = "client!pca",
      name = "A",
      descriptor = "I"
   )
   public static int field10857;
   @OriginalMember(
      owner = "client!pca",
      name = "u",
      descriptor = "I"
   )
   public static int field10859;
   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "I"
   )
   public static int field10862;
   @OriginalMember(
      owner = "client!pca",
      name = "s",
      descriptor = "I"
   )
   public static int field10864;
   @OriginalMember(
      owner = "client!pca",
      name = "e",
      descriptor = "I"
   )
   public static int field10865;
   @OriginalMember(
      owner = "client!pca",
      name = "d",
      descriptor = "I"
   )
   public static int field10866;
   @OriginalMember(
      owner = "client!pca",
      name = "q",
      descriptor = "I"
   )
   public static int field10869;
   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "I"
   )
   public static int field10874;
   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "I"
   )
   public static int field10875;
   @OriginalMember(
      owner = "client!pca",
      name = "p",
      descriptor = "I"
   )
   public static int field10880;
   @OriginalMember(
      owner = "client!pca",
      name = "r",
      descriptor = "I"
   )
   public static int field10881;
   @OriginalMember(
      owner = "client!pca",
      name = "o",
      descriptor = "I"
   )
   public static int field10882;
   @OriginalMember(
      owner = "client!pca",
      name = "D",
      descriptor = "I"
   )
   public static int field10883;
   @OriginalMember(
      owner = "client!pca",
      name = "j",
      descriptor = "Llf;"
   )
   private class249 field10871;
   @OriginalMember(
      owner = "client!pca",
      name = "v",
      descriptor = "Lqja;"
   )
   private class328 field10877;
   @OriginalMember(
      owner = "client!pca",
      name = "i",
      descriptor = "Lsaa;"
   )
   private class347 field10872;
   @OriginalMember(
      owner = "client!pca",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   private String field10868;
   @OriginalMember(
      owner = "client!pca",
      name = "h",
      descriptor = "Z"
   )
   private boolean field10860;
   @OriginalMember(
      owner = "client!pca",
      name = "t",
      descriptor = "Z"
   )
   private boolean field10870;
   @OriginalMember(
      owner = "client!pca",
      name = "g",
      descriptor = "Z"
   )
   private boolean field10873;
   @OriginalMember(
      owner = "client!pca",
      name = "x",
      descriptor = "Z"
   )
   private boolean field10879;

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public final void method5392(int param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "(B)Lqja;"
   )
   public final class328 method5393(byte arg0) {
      try {
         if (arg0 >= -43) {
            return null;
         } else {
            ++field10864;
            return this.field10877;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10886[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "(B)Lqaa;"
   )
   private final class29 method5394(byte arg0) throws IOException {
      boolean var2 = client.field4273;

      try {
         ++field10869;
         if (arg0 > -118) {
            this.method5392(-117, (String)null);
         }

         if (this.field10860) {
            throw new IllegalStateException();
         } else if (this.field10873) {
            return null;
         } else {
            label116:
            while(~this.field10876.pageOut(this.field10867) >= -1) {
               int var3 = this.method2108(this.field10878, (byte)87);

               do {
                  if (var3 == -1) {
                     this.field10873 = true;
                     return null;
                  }

                  if (~var3 == -1) {
                     return null;
                  }

                  if (this.field10876.write(this.field10878, var3)) {
                     continue label116;
                  }
               } while(var2);

               throw new RuntimeException("");
            }

            int var4 = this.field10867.getSerialNumber();
            if (!this.field10867.isBOS()) {
               class29 var11 = (class29)this.field10861.method1839(73, (long)var4);
               if (!var11.field359.pageIn(this.field10867)) {
                  throw new IllegalStateException();
               } else {
                  return var11;
               }
            } else {
               OggStreamState var5 = new OggStreamState(var4);
               if (!var5.pageIn(this.field10867)) {
                  throw new IllegalStateException();
               } else if (~var5.packetPeek(this.field10863) != -2) {
                  throw new IllegalStateException();
               } else {
                  class29 var6;
                  label124: {
                     if (this.field10872 == null && this.field10863.isTheora()) {
                        this.field10872 = new class347(var5);
                        var6 = this.field10872;
                        if (!var2) {
                           break label124;
                        }
                     }

                     if (this.field10871 == null && this.field10863.isVorbis()) {
                        this.field10871 = new class249(var5);
                        var6 = this.field10871;
                        if (!var2) {
                           break label124;
                        }
                     }

                     boolean var10000;
                     label89: {
                        byte[] var7 = this.field10863.getData();
                        StringBuffer var8 = new StringBuffer();
                        int var9 = 1;
                        String var10;
                        if (var2) {
                           var10000 = Character.isLetterOrDigit((char)var7[var9]);
                        } else if (~var9 <= ~var7.length) {
                           var10 = var8.toString();
                           var10000 = var10.equals(field10886[5]);
                           if (!var2) {
                              break label89;
                           }
                        } else {
                           var10000 = Character.isLetterOrDigit((char)var7[var9]);
                        }

                        label88:
                        while(true) {
                           while(!var10000) {
                              var10 = var8.toString();
                              var10000 = var10.equals(field10886[5]);
                              if (!var2) {
                                 break label88;
                              }
                           }

                           var8.append((char)var7[var9]);
                           ++var9;
                           if (~var9 <= ~var7.length) {
                              var10 = var8.toString();
                              var10000 = var10.equals(field10886[5]);
                              if (!var2) {
                                 break;
                              }
                           } else {
                              var10000 = Character.isLetterOrDigit((char)var7[var9]);
                           }
                        }
                     }

                     if (var10000) {
                        var6 = new class328(var5);
                        if (!var2) {
                           break label124;
                        }
                     }

                     var6 = new class705(var5);
                  }

                  this.field10861.method1841((long)var4, true, var6);
                  return var6;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field10886[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "i",
      descriptor = "(I)Llf;"
   )
   public final class249 method5395(int arg0) {
      try {
         if (arg0 != -14113) {
            method5398((byte)-41);
         }

         ++field10875;
         return this.field10871;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10886[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "h",
      descriptor = "(I)D"
   )
   public final double method5396(int arg0) {
      try {
         ++field10865;
         if (arg0 != 18915) {
            field10858 = null;
         }

         if (this.field10871 != null) {
            return this.field10871.method1873(0);
         } else {
            return this.field10872 != null ? this.field10872.method2740((byte)126) : 0.0D;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10886[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "([BB)I"
   )
   public abstract int method2108(byte[] arg0, byte arg1) throws IOException;

   @OriginalMember(
      owner = "client!pca",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method5397(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pca",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method5398(byte arg0) {
      try {
         if (arg0 != 31) {
            method5398((byte)-23);
         }

         field10885 = null;
         field10858 = null;
         field10884 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10886[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method5399(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method5400(int arg0) {
      try {
         ++field10857;
         if (!this.field10860 && !this.field10873) {
            return false;
         } else if (this.field10871 != null && ~this.field10871.method1874((byte)-117) < -1) {
            return false;
         } else {
            if (arg0 != 0) {
               this.method5392(98, (String)null);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10886[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method5401(boolean arg0, boolean arg1) {
      try {
         ++field10859;
         if (arg0) {
            this.field10860 = true;
         }

         if (this.field10871 != null) {
            class656 var3 = this.field10871.method1876(0);
            if (var3 != null) {
               var3.method4743(true, arg1);
            }
         }

         this.field10879 = !this.field10879;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10886[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "e",
      descriptor = "(I)Lsaa;"
   )
   public final class347 method5402(int arg0) {
      try {
         if (arg0 != 20) {
            field10885 = null;
         }

         ++field10866;
         return this.field10872;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10886[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5403(byte arg0) throws IOException {
      boolean var2 = client.field4273;

      RuntimeException var10000;
      label233: {
         boolean var10001;
         try {
            ++field10856;
            if (arg0 != 26) {
               method5398((byte)-33);
            }

            if (this.field10879) {
               return;
            }
         } catch (RuntimeException var12) {
            var10000 = var12;
            var10001 = false;
            break label233;
         }

         while(true) {
            class29 var3;
            label165: {
               label164: {
                  try {
                     if (!this.field10860) {
                        if (!this.field10870) {
                           var3 = this.method5394((byte)-120);
                           if (var3 == null) {
                              if (this.field10873) {
                                 this.method5397(arg0 + 11647);
                              }

                              return;
                           }

                           if (var3 == null) {
                              throw new IllegalStateException();
                           }

                           this.field10870 = true;
                           if (!var2) {
                              break label165;
                           }
                        }
                        break label164;
                     }
                  } catch (RuntimeException var10) {
                     var10000 = var10;
                     var10001 = false;
                     break;
                  }

                  if (!var2) {
                     return;
                  }
               }

               try {
                  var3 = (class29)this.field10861.method1839(-125, (long)this.field10867.getSerialNumber());
               } catch (RuntimeException var9) {
                  var10000 = var9;
                  var10001 = false;
                  break;
               }
            }

            try {
               label238: {
                  if (this.field10871 == var3) {
                     if (this.field10871.method1874((byte)83) >= 50) {
                        return;
                     }

                     label151:
                     while(~this.field10871.field359.packetOut(this.field10863) == -2) {
                        this.field10871.method239(-118, this.field10863);
                        this.method5399(arg0 ^ -19);

                        do {
                           if (this.field10872 != null) {
                              int var13;
                              label243: {
                                 double var4 = this.field10872.method2740((byte)109);
                                 int var6 = 0;
                                 if (var2) {
                                    this.method5405(93);
                                    if (this.field10860) {
                                       return;
                                    }

                                    ++var6;
                                 }

                                 while(~var6 > -11) {
                                    var13 = this.method5404(0);
                                    if (var2) {
                                       break label243;
                                    }

                                    if (var13 == 0) {
                                       break;
                                    }

                                    this.method5405(93);
                                    if (this.field10860) {
                                       return;
                                    }

                                    ++var6;
                                 }

                                 double var14;
                                 var13 = (var14 = this.field10872.method2740((byte)123) - var4) == 0.0D ? 0 : (var14 < 0.0D ? -1 : 1);
                              }

                              if (var13 > 0) {
                                 return;
                              }
                           }

                           if (~this.field10871.method1874((byte)-106) > -51) {
                              continue label151;
                           }
                        } while(var2);

                        return;
                     }

                     if (!var2) {
                        if (!var2) {
                           this.field10870 = false;
                           continue;
                        }

                        this.method5392(0, this.field10868);
                        var3.method239(-128, this.field10863);
                        break label238;
                     }
                  }

                  if (var3 instanceof class328) {
                     this.method5399(-9);
                     if (!var2) {
                        if (!var2) {
                           this.field10870 = false;
                           continue;
                        }

                        this.method5392(0, this.field10868);
                        var3.method239(-128, this.field10863);
                        break label238;
                     }
                  }

                  if (this.field10872 == var3) {
                     if (this.field10871 == null && !this.field10879) {
                        int var7 = 0;
                        if (var2 || var7 < 10 && this.method5404(0)) {
                           do {
                              this.method5405(116);
                              if (this.field10860) {
                                 return;
                              }

                              ++var7;
                           } while(var7 < 10 && this.method5404(0));
                        }

                        return;
                     }

                     if (!var2) {
                        this.field10870 = false;
                        continue;
                     }

                     this.method5392(0, this.field10868);
                     var3.method239(-128, this.field10863);
                  }
               }

               while(true) {
                  while(var3.field359.packetOut(this.field10863) == 1) {
                     if (var3.field355 == 1 && var3 instanceof class328) {
                        this.method5392(-51, this.field10868);
                     }

                     var3.method239(-128, this.field10863);
                  }

                  if (!var2) {
                     this.field10870 = false;
                     break;
                  }

                  this.method5392(0, this.field10868);
                  var3.method239(-128, this.field10863);
               }
            } catch (RuntimeException var11) {
               var10000 = var11;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var8 = var10000;
      throw class534.method3846(var8, field10886[8] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!pca",
      name = "f",
      descriptor = "(I)Z"
   )
   private final boolean method5404(int arg0) {
      try {
         ++field10882;
         if (arg0 != 0) {
            this.field10860 = false;
         }

         if (this.field10871 != null) {
            return !this.field10872.method2739(true) || this.method5396(18915) > this.field10872.method2740((byte)124);
         } else {
            double var2 = (double)this.field10872.method2738(-117);
            return var2 == 0.0D || (double)class792.method5708(-25005) >= (double)this.field10872.method2737(127) + 1000.0D / var2;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10886[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method5405(int arg0) throws IOException {
      boolean var2 = client.field4273;

      try {
         label59: {
            ++field10881;
            int var3 = -32 / ((arg0 - 6) / 41);
            class29 var4;
            if (var2) {
               var4 = this.method5394((byte)-121);
               if (var4 == null) {
                  break label59;
               }
            } else {
               if (this.field10872.field359.packetOut(this.field10863) == 1) {
                  this.field10872.method239(-108, this.field10863);
                  return;
               }

               var4 = this.method5394((byte)-121);
               if (var4 == null) {
                  break label59;
               }
            }

            label58:
            do {
               while(true) {
                  if (this.field10877 == var4) {
                     this.method5399(-9);
                     if (var2) {
                        break;
                     }

                     if (var2) {
                        break label58;
                     }
                  }

                  if (this.field10872.field359.packetOut(this.field10863) == 1) {
                     this.field10872.method239(-108, this.field10863);
                     return;
                  }

                  var4 = this.method5394((byte)-121);
                  if (var4 == null) {
                     break label58;
                  }
               }
            } while(var4 != null);
         }

         if (this.field10873) {
            this.method5397(11673);
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10886[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method5406(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pca",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class748(int arg0) {
      try {
         if (!class280.method2139(114, field10886[19])) {
            throw new RuntimeException(field10886[18]);
         } else {
            this.field10878 = new byte[arg0];
            this.field10876 = new OggSyncState();
            this.field10867 = new OggPage();
            this.field10863 = new OggPacket();
            this.field10861 = new class245(8);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10886[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5407(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5408(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
