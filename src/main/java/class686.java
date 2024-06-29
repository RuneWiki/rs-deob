import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class686 {
   @OriginalMember(
      owner = "client!kja",
      name = "x",
      descriptor = "I"
   )
   private int field10110 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "g",
      descriptor = "I"
   )
   private int field10113 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "w",
      descriptor = "I"
   )
   private int field10111 = 128;
   @OriginalMember(
      owner = "client!kja",
      name = "j",
      descriptor = "B"
   )
   public byte field10123 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "l",
      descriptor = "I"
   )
   private int field10125 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "e",
      descriptor = "I"
   )
   private int field10121 = 128;
   @OriginalMember(
      owner = "client!kja",
      name = "u",
      descriptor = "I"
   )
   public int field10128 = -1;
   @OriginalMember(
      owner = "client!kja",
      name = "m",
      descriptor = "I"
   )
   private int field10119 = -1;
   @OriginalMember(
      owner = "client!kja",
      name = "y",
      descriptor = "Z"
   )
   public boolean field10129 = false;
   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10130 = new String[]{method5015(method5014("\u001c(#a7_")), method5015(method5014("\u00197.#")), method5015(method5014("\flla\b")), method5015(method5014("\u001c(#a=_")), method5015(method5014("\u001c(#a0_")), method5015(method5014("\u001c(#a4_")), method5015(method5014("\u001c(#a1_")), method5015(method5014("\u001c(#a2_")), method5015(method5014("\u001c(#a6_")), method5015(method5014("\u001c(#a3_"))};
   @OriginalMember(
      owner = "client!kja",
      name = "i",
      descriptor = "I"
   )
   public static int field10122 = -1;
   @OriginalMember(
      owner = "client!kja",
      name = "o",
      descriptor = "Leg;"
   )
   public static class118 field10116 = new class118(77, 0);
   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "I"
   )
   public static int field10105;
   @OriginalMember(
      owner = "client!kja",
      name = "d",
      descriptor = "I"
   )
   public static int field10107;
   @OriginalMember(
      owner = "client!kja",
      name = "s",
      descriptor = "I"
   )
   public static int field10108;
   @OriginalMember(
      owner = "client!kja",
      name = "r",
      descriptor = "I"
   )
   public static int field10109;
   @OriginalMember(
      owner = "client!kja",
      name = "n",
      descriptor = "I"
   )
   public static int field10112;
   @OriginalMember(
      owner = "client!kja",
      name = "p",
      descriptor = "I"
   )
   public static int field10114;
   @OriginalMember(
      owner = "client!kja",
      name = "f",
      descriptor = "I"
   )
   private int field10120;
   @OriginalMember(
      owner = "client!kja",
      name = "c",
      descriptor = "I"
   )
   public static int field10124;
   @OriginalMember(
      owner = "client!kja",
      name = "q",
      descriptor = "I"
   )
   public int field10126;
   @OriginalMember(
      owner = "client!kja",
      name = "t",
      descriptor = "Leia;"
   )
   public class255 field10118;
   @OriginalMember(
      owner = "client!kja",
      name = "v",
      descriptor = "[S"
   )
   private short[] field10106;
   @OriginalMember(
      owner = "client!kja",
      name = "k",
      descriptor = "[S"
   )
   private short[] field10115;
   @OriginalMember(
      owner = "client!kja",
      name = "h",
      descriptor = "[S"
   )
   private short[] field10117;
   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "[S"
   )
   private short[] field10127;

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(Lv;IIIILha;I)Lka;"
   )
   public final class500 method5006(class606 arg0, int arg1, int arg2, int arg3, int arg4, class66 arg5, int arg6) {
      try {
         int var8 = 121 / ((arg1 - -65) / 37);
         ++field10112;
         return this.method5007(arg2, (byte)2, arg4, arg6, arg0, (class295)null, arg5, false, 0, (byte)-91, arg3, 0, (class295)null, 0);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field10130[7] + (arg0 != null ? field10130[2] : field10130[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10130[2] : field10130[1]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IBIILv;Ls;Lha;ZIBIILs;I)Lka;"
   )
   private final class500 method5007(int arg0, byte arg1, int arg2, int arg3, class606 arg4, class295 arg5, class66 arg6, boolean arg7, int arg8, byte arg9, int arg10, int arg11, class295 arg12, int arg13) {
      boolean var15 = client.field4360;

      try {
         if (arg9 > -61) {
            this.field10120 = 55;
         }

         ++field10124;
         int var16 = arg0;
         class85 var17 = this.field10128 != -1 && arg3 != -1 ? arg4.method4411(this.field10128, 95) : null;
         boolean var30 = arg7 & ~this.field10123 != -1;
         if (var17 != null) {
            var16 = arg0 | var17.method763(false, arg3, arg2, -1);
         }

         if (var30) {
            var16 |= this.field10123 != 3 ? 2 : 7;
         }

         if (this.field10121 != 128) {
            var16 |= 2;
         }

         if (~this.field10111 != -129 || ~this.field10113 != -1) {
            var16 |= 5;
         }

         class80 var18 = this.field10118.field3475;
         class500 var19;
         synchronized(this.field10118.field3475) {
            var19 = (class500)this.field10118.field3475.method725(0, (long)(this.field10126 |= arg6.field796 << 29));
         }

         if (var19 == null || arg6.method531(var19.method214(), var16) != 0) {
            if (var19 != null) {
               var16 = arg6.method543(var16, var19.method214());
            }

            int var20 = var16;
            if (this.field10127 != null) {
               var20 = var16 | 16384;
            }

            if (this.field10106 != null) {
               var20 |= 32768;
            }

            class464 var21 = class695.method5060(this.field10120, 0, (byte)-33, this.field10118.field3471);
            if (var21 == null) {
               return null;
            }

            if (var21.field6680 < 13) {
               var21.method3381((byte)47, 2);
            }

            var19 = arg6.method555(var21, var20, this.field10118.field3476, this.field10110 + 64, this.field10125 + 850);
            if (this.field10127 != null) {
               int var22 = 0;
               if (var15 || ~this.field10127.length < ~var22) {
                  do {
                     var19.method157(this.field10127[var22], this.field10117[var22]);
                     ++var22;
                  } while(~this.field10127.length < ~var22);
               }
            }

            if (this.field10106 != null) {
               int var23 = 0;
               if (var15 || ~this.field10106.length < ~var23) {
                  do {
                     var19.method176(this.field10106[var23], this.field10115[var23]);
                     ++var23;
                  } while(~this.field10106.length < ~var23);
               }
            }

            var19.method195(var16);
            class80 var24 = this.field10118.field3475;
            synchronized(this.field10118.field3475) {
               this.field10118.field3475.method723(0, (long)(this.field10126 |= arg6.field796 << 29), var19);
            }
         }

         class500 var25 = var17 != null ? var17.method757(0, arg3, var16, var19, (byte)9, arg10, arg1, arg2) : var19.method159(arg1, var16, true);
         if (this.field10111 != 128 || ~this.field10121 != -129) {
            var25.method166(this.field10111, this.field10121, this.field10111);
         }

         if (~this.field10113 != -1) {
            if (~this.field10113 == -91) {
               var25.method156(4096);
            }

            if (this.field10113 == 180) {
               var25.method156(8192);
            }

            if (~this.field10113 == -271) {
               var25.method156(12288);
            }
         }

         if (var30) {
            var25.method224(this.field10123, this.field10119, arg12, arg5, arg8, arg11, arg13);
         }

         var25.method195(arg0);
         return var25;
      } catch (RuntimeException var29) {
         throw class237.method1823(var29, field10130[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10130[2] : field10130[1]) + ',' + (arg5 != null ? field10130[2] : field10130[1]) + ',' + (arg6 != null ? field10130[2] : field10130[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + (arg12 != null ? field10130[2] : field10130[1]) + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5008(int arg0) {
      try {
         field10116 = null;
         if (arg0 != -21604) {
            field10122 = 20;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10130[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(BILkf;Lkf;)V"
   )
   public static final void method5009(byte arg0, int arg1, class266 arg2, class266 arg3) {
      try {
         class490.field7013 = arg3;
         if (arg0 == 7) {
            ++field10108;
            class405.field5859 = arg2;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10130[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10130[2] : field10130[1]) + ',' + (arg3 != null ? field10130[2] : field10130[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IILs;Ls;ILha;IZIIZLv;I)Lka;"
   )
   public final class500 method5010(int arg0, int arg1, class295 arg2, class295 arg3, int arg4, class66 arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10, class606 arg11, int arg12) {
      try {
         ++field10107;
         if (!arg10) {
            field10122 = -59;
         }

         return this.method5007(arg0, (byte)2, arg6, arg1, arg11, arg2, arg5, arg7, arg8, (byte)-93, arg12, arg4, arg3, arg9);
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field10130[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10130[2] : field10130[1]) + ',' + (arg3 != null ? field10130[2] : field10130[1]) + ',' + arg4 + ',' + (arg5 != null ? field10130[2] : field10130[1]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field10130[2] : field10130[1]) + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(Lwf;IZ)V"
   )
   private final void method5011(class147 arg0, int arg1, boolean arg2) {
      boolean var4 = client.field4360;

      try {
         label204: {
            if (~arg1 == -2) {
               this.field10120 = arg0.method1211(-26166);
               if (!var4) {
                  break label204;
               }
            }

            if (~arg1 == -3) {
               this.field10128 = arg0.method1211(-26166);
               if (!var4) {
                  break label204;
               }
            }

            if (~arg1 == -5) {
               this.field10111 = arg0.method1211(-26166);
               if (!var4) {
                  break label204;
               }
            }

            if (arg1 == 5) {
               this.field10121 = arg0.method1211(-26166);
               if (!var4) {
                  break label204;
               }
            }

            if (~arg1 != -7) {
               if (~arg1 != -8) {
                  if (~arg1 != -9) {
                     if (~arg1 != -10) {
                        if (arg1 == 10) {
                           this.field10129 = true;
                           if (!var4) {
                              break label204;
                           }
                        }

                        if (~arg1 != -12) {
                           if (arg1 == 12) {
                              this.field10123 = 4;
                              if (!var4) {
                                 break label204;
                              }
                           }

                           if (~arg1 != -14) {
                              if (~arg1 != -15) {
                                 if (~arg1 != -16) {
                                    if (~arg1 == -17) {
                                       this.field10123 = 3;
                                       this.field10119 = arg0.method1164(19693);
                                       if (!var4) {
                                          break label204;
                                       }
                                    }

                                    if (~arg1 == -41) {
                                       int var5 = arg0.method1143(-15465);
                                       this.field10127 = new short[var5];
                                       this.field10117 = new short[var5];
                                       int var6 = 0;
                                       if (var4) {
                                          this.field10127[var6] = (short)arg0.method1211(-26166);
                                          this.field10117[var6] = (short)arg0.method1211(-26166);
                                          ++var6;
                                       }

                                       while(true) {
                                          while(~var6 > ~var5) {
                                             this.field10127[var6] = (short)arg0.method1211(-26166);
                                             this.field10117[var6] = (short)arg0.method1211(-26166);
                                             ++var6;
                                          }

                                          if (!var4) {
                                             if (!var4) {
                                                break label204;
                                             }
                                             break;
                                          }

                                          ++var6;
                                       }
                                    }

                                    if (~arg1 != -42) {
                                       break label204;
                                    }

                                    int var7 = arg0.method1143(-15465);
                                    this.field10115 = new short[var7];
                                    this.field10106 = new short[var7];
                                    int var8 = 0;
                                    if (var4) {
                                       this.field10106[var8] = (short)arg0.method1211(-26166);
                                       this.field10115[var8] = (short)arg0.method1211(-26166);
                                       ++var8;
                                    }

                                    while(true) {
                                       while(~var7 < ~var8) {
                                          this.field10106[var8] = (short)arg0.method1211(-26166);
                                          this.field10115[var8] = (short)arg0.method1211(-26166);
                                          ++var8;
                                       }

                                       if (!var4) {
                                          if (!var4) {
                                             break label204;
                                          }
                                          break;
                                       }

                                       ++var8;
                                    }
                                 }

                                 this.field10123 = 3;
                                 this.field10119 = arg0.method1211(-26166);
                                 if (!var4) {
                                    break label204;
                                 }
                              }

                              this.field10123 = 2;
                              this.field10119 = 256 * arg0.method1143(-15465);
                              if (!var4) {
                                 break label204;
                              }
                           }

                           this.field10123 = 5;
                           if (!var4) {
                              break label204;
                           }
                        }

                        this.field10123 = 1;
                        if (!var4) {
                           break label204;
                        }
                     }

                     this.field10123 = 3;
                     this.field10119 = 8224;
                     if (!var4) {
                        break label204;
                     }
                  }

                  this.field10125 = arg0.method1143(-15465);
                  if (!var4) {
                     break label204;
                  }
               }

               this.field10110 = arg0.method1143(-15465);
               if (!var4) {
                  break label204;
               }
            }

            this.field10113 = arg0.method1211(-26166);
         }

         if (!arg2) {
            this.field10123 = -93;
         }

         ++field10109;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field10130[6] + (arg0 != null ? field10130[2] : field10130[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(ILha;ILv;IIBB)Lka;"
   )
   public final class500 method5012(int arg0, class66 arg1, int arg2, class606 arg3, int arg4, int arg5, byte arg6, byte arg7) {
      try {
         ++field10105;
         return arg6 != -86 ? null : this.method5007(arg0, arg7, arg5, arg2, arg3, (class295)null, arg1, false, 0, (byte)-99, arg4, 0, (class295)null, 0);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field10130[9] + arg0 + ',' + (arg1 != null ? field10130[2] : field10130[1]) + ',' + arg2 + ',' + (arg3 != null ? field10130[2] : field10130[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(ILwf;)V"
   )
   public final void method5013(int arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0 != 0) {
            this.field10127 = null;
         }

         ++field10114;

         do {
            int var4 = arg1.method1143(-15465);
            if (~var4 == -1) {
               break;
            }

            this.method5011(arg1, var4, true);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10130[5] + arg0 + ',' + (arg1 != null ? field10130[2] : field10130[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5014(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5015(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
