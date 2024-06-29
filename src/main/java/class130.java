import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class130 {
   @OriginalMember(
      owner = "client!laa",
      name = "p",
      descriptor = "B"
   )
   public byte field1621 = 0;
   @OriginalMember(
      owner = "client!laa",
      name = "i",
      descriptor = "I"
   )
   private int field1627 = 128;
   @OriginalMember(
      owner = "client!laa",
      name = "v",
      descriptor = "I"
   )
   private int field1628 = -1;
   @OriginalMember(
      owner = "client!laa",
      name = "r",
      descriptor = "I"
   )
   private int field1622 = 0;
   @OriginalMember(
      owner = "client!laa",
      name = "x",
      descriptor = "I"
   )
   private int field1634 = 128;
   @OriginalMember(
      owner = "client!laa",
      name = "j",
      descriptor = "Z"
   )
   public boolean field1635 = false;
   @OriginalMember(
      owner = "client!laa",
      name = "f",
      descriptor = "I"
   )
   private int field1633 = 0;
   @OriginalMember(
      owner = "client!laa",
      name = "w",
      descriptor = "I"
   )
   private int field1637 = 0;
   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "I"
   )
   public int field1642 = -1;
   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1645 = new String[]{method1088(method1087("+Prp\ro")), method1088(method1087("<\u001f=p5")), method1088(method1087(")D\u007f2")), method1088(method1087("+Prp\fo")), method1088(method1087("+Prp\to")), method1088(method1087("+Prp\u000fo")), method1088(method1087("+Prp\no")), method1088(method1087("+Prp\u000bo")), method1088(method1087("+Prp\u000eo"))};
   @OriginalMember(
      owner = "client!laa",
      name = "u",
      descriptor = "I"
   )
   public static int field1623;
   @OriginalMember(
      owner = "client!laa",
      name = "m",
      descriptor = "I"
   )
   public static int field1624;
   @OriginalMember(
      owner = "client!laa",
      name = "e",
      descriptor = "I"
   )
   public static int field1625;
   @OriginalMember(
      owner = "client!laa",
      name = "h",
      descriptor = "I"
   )
   public static int field1626;
   @OriginalMember(
      owner = "client!laa",
      name = "t",
      descriptor = "I"
   )
   public static int field1629;
   @OriginalMember(
      owner = "client!laa",
      name = "k",
      descriptor = "I"
   )
   public static int field1630;
   @OriginalMember(
      owner = "client!laa",
      name = "o",
      descriptor = "I"
   )
   private int field1631;
   @OriginalMember(
      owner = "client!laa",
      name = "s",
      descriptor = "I"
   )
   public int field1638;
   @OriginalMember(
      owner = "client!laa",
      name = "c",
      descriptor = "I"
   )
   public static int field1641;
   @OriginalMember(
      owner = "client!laa",
      name = "l",
      descriptor = "I"
   )
   public static int field1644;
   @OriginalMember(
      owner = "client!laa",
      name = "n",
      descriptor = "Lc;"
   )
   public class198 field1640;
   @OriginalMember(
      owner = "client!laa",
      name = "b",
      descriptor = "[S"
   )
   private short[] field1632;
   @OriginalMember(
      owner = "client!laa",
      name = "d",
      descriptor = "[S"
   )
   private short[] field1636;
   @OriginalMember(
      owner = "client!laa",
      name = "q",
      descriptor = "[S"
   )
   private short[] field1639;
   @OriginalMember(
      owner = "client!laa",
      name = "g",
      descriptor = "[S"
   )
   private short[] field1643;

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(Lwm;I)Lul;"
   )
   public static final class602 method1080(class594 arg0, int arg1) {
      try {
         ++field1626;
         class101 var2 = class44.method375((byte)-108, arg0);
         int var3 = 17 % ((arg1 - -24) / 60);
         int var4 = arg0.method4302(true);
         int var5 = arg0.method4302(true);
         return new class602(var2.field1297, var2.field1309, var2.field1301, var2.field1302, var2.field1299, var2.field1311, var2.field1303, var2.field1298, var2.field1306, var4, var5);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1645[0] + (arg0 != null ? field1645[1] : field1645[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method1081(class594 arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         while(true) {
            int var4 = arg0.method4288((byte)76);
            if (var4 != 0) {
               this.method1085(arg1 + -21, var4, arg0);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field1624;
            break;
         }

         if (arg1 != -98) {
            this.field1633 = -106;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1645[5] + (arg0 != null ? field1645[1] : field1645[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(BLs;IILqga;ILs;ZLha;IBIII)Lka;"
   )
   private final class501 method1082(byte arg0, class295 arg1, int arg2, int arg3, class196 arg4, int arg5, class295 arg6, boolean arg7, class65 arg8, int arg9, byte arg10, int arg11, int arg12, int arg13) {
      boolean var15 = client.field4273;

      try {
         ++field1641;
         int var16 = arg13;
         class61 var17 = this.field1642 != -1 && ~arg2 != 0 ? arg4.method1477(1, this.field1642) : null;
         boolean var30 = arg7 & ~this.field1621 != -1;
         if (var17 != null) {
            var16 = arg13 | var17.method458(arg2, false, -126, arg5);
         }

         if (var30) {
            var16 |= ~this.field1621 != -4 ? 2 : 7;
         }

         if (~this.field1627 != -129) {
            var16 |= 2;
         }

         if (~this.field1634 != -129 || this.field1622 != 0) {
            var16 |= 5;
         }

         class590 var18 = this.field1640.field2399;
         class501 var19;
         synchronized(this.field1640.field2399) {
            var19 = (class501)this.field1640.field2399.method4239((long)(this.field1638 |= arg8.field740 << 29), 0);
         }

         if (arg0 < 48) {
            this.field1643 = null;
         }

         if (var19 == null || arg8.method540(var19.method341(), var16) != 0) {
            if (var19 != null) {
               var16 = arg8.method503(var16, var19.method341());
            }

            int var20 = var16;
            if (this.field1639 != null) {
               var20 = var16 | 16384;
            }

            if (this.field1643 != null) {
               var20 |= 32768;
            }

            class200 var21 = class246.method1854(true, this.field1631, this.field1640.field2395, 0);
            if (var21 == null) {
               return null;
            }

            if (var21.field2433 < 13) {
               var21.method1506(2, (byte)-123);
            }

            var19 = arg8.method573(var21, var20, this.field1640.field2400, this.field1637 - -64, this.field1633 + 850);
            if (this.field1639 != null) {
               int var22 = 0;
               if (var15 || ~var22 > ~this.field1639.length) {
                  do {
                     var19.method349(this.field1639[var22], this.field1632[var22]);
                     ++var22;
                  } while(~var22 > ~this.field1639.length);
               }
            }

            if (this.field1643 != null) {
               int var23 = 0;
               if (var15 || this.field1643.length > var23) {
                  do {
                     var19.method347(this.field1643[var23], this.field1636[var23]);
                     ++var23;
                  } while(this.field1643.length > var23);
               }
            }

            var19.method352(var16);
            class590 var24 = this.field1640.field2399;
            synchronized(this.field1640.field2399) {
               this.field1640.field2399.method4238(102, var19, (long)(this.field1638 |= arg8.field740 << 29));
            }
         }

         class501 var25 = var17 != null ? var17.method459(0, 22, arg10, var16, arg5, var19, arg2, arg3) : var19.method338(arg10, var16, true);
         if (this.field1634 != 128 || ~this.field1627 != -129) {
            var25.method342(this.field1634, this.field1627, this.field1634);
         }

         if (~this.field1622 != -1) {
            if (this.field1622 == 90) {
               var25.method355(4096);
            }

            if (~this.field1622 == -181) {
               var25.method355(8192);
            }

            if (this.field1622 == 270) {
               var25.method355(12288);
            }
         }

         if (var30) {
            var25.method353(this.field1621, this.field1628, arg6, arg1, arg12, arg11, arg9);
         }

         var25.method352(arg13);
         return var25;
      } catch (RuntimeException var29) {
         throw class534.method3846(var29, field1645[8] + arg0 + ',' + (arg1 != null ? field1645[1] : field1645[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1645[1] : field1645[2]) + ',' + arg5 + ',' + (arg6 != null ? field1645[1] : field1645[2]) + ',' + arg7 + ',' + (arg8 != null ? field1645[1] : field1645[2]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(IILha;ILqga;II)Lka;"
   )
   public final class501 method1083(int arg0, int arg1, class65 arg2, int arg3, class196 arg4, int arg5, int arg6) {
      try {
         ++field1629;
         if (arg3 != 1) {
            this.field1640 = null;
         }

         return this.method1082((byte)75, (class295)null, arg0, arg1, arg4, arg6, (class295)null, false, arg2, 0, (byte)2, 0, 0, arg5);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field1645[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1645[1] : field1645[2]) + ',' + arg3 + ',' + (arg4 != null ? field1645[1] : field1645[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(Lha;IIIILs;Lqga;Ls;BIIIZ)Lka;"
   )
   public final class501 method1084(class65 arg0, int arg1, int arg2, int arg3, int arg4, class295 arg5, class196 arg6, class295 arg7, byte arg8, int arg9, int arg10, int arg11, boolean arg12) {
      try {
         ++field1625;
         if (arg8 <= 93) {
            this.field1635 = true;
         }

         return this.method1082((byte)75, arg5, arg4, arg10, arg6, arg9, arg7, arg12, arg0, arg11, (byte)2, arg3, arg1, arg2);
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field1645[3] + (arg0 != null ? field1645[1] : field1645[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1645[1] : field1645[2]) + ',' + (arg6 != null ? field1645[1] : field1645[2]) + ',' + (arg7 != null ? field1645[1] : field1645[2]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(IILwm;)V"
   )
   private final void method1085(int arg0, int arg1, class594 arg2) {
      boolean var4 = client.field4273;

      try {
         label202: {
            if (arg1 == 1) {
               this.field1631 = arg2.method4280(-19104);
               if (!var4) {
                  break label202;
               }
            }

            if (arg1 != 2) {
               if (arg1 != 4) {
                  if (arg1 == 5) {
                     this.field1627 = arg2.method4280(-19104);
                     if (!var4) {
                        break label202;
                     }
                  }

                  if (~arg1 != -7) {
                     if (arg1 != 7) {
                        if (~arg1 != -9) {
                           if (arg1 == 9) {
                              this.field1628 = 8224;
                              this.field1621 = 3;
                              if (!var4) {
                                 break label202;
                              }
                           }

                           if (arg1 != 10) {
                              if (~arg1 != -12) {
                                 if (arg1 == 12) {
                                    this.field1621 = 4;
                                    if (!var4) {
                                       break label202;
                                    }
                                 }

                                 if (~arg1 != -14) {
                                    if (~arg1 == -15) {
                                       this.field1621 = 2;
                                       this.field1628 = 256 * arg2.method4288((byte)86);
                                       if (!var4) {
                                          break label202;
                                       }
                                    }

                                    if (~arg1 != -16) {
                                       if (~arg1 != -17) {
                                          if (arg1 != 40) {
                                             if (arg1 != 41) {
                                                break label202;
                                             }

                                             int var5 = arg2.method4288((byte)82);
                                             this.field1636 = new short[var5];
                                             this.field1643 = new short[var5];
                                             int var6 = 0;
                                             if (var4) {
                                                this.field1643[var6] = (short)arg2.method4280(-19104);
                                                this.field1636[var6] = (short)arg2.method4280(-19104);
                                                ++var6;
                                             }

                                             while(true) {
                                                while(var6 < var5) {
                                                   this.field1643[var6] = (short)arg2.method4280(-19104);
                                                   this.field1636[var6] = (short)arg2.method4280(-19104);
                                                   ++var6;
                                                }

                                                if (!var4) {
                                                   if (!var4) {
                                                      break label202;
                                                   }
                                                   break;
                                                }

                                                ++var6;
                                             }
                                          }

                                          int var7 = arg2.method4288((byte)102);
                                          this.field1632 = new short[var7];
                                          this.field1639 = new short[var7];
                                          int var8 = 0;
                                          if (var4) {
                                             this.field1639[var8] = (short)arg2.method4280(-19104);
                                             this.field1632[var8] = (short)arg2.method4280(-19104);
                                             ++var8;
                                          }

                                          while(true) {
                                             while(var7 > var8) {
                                                this.field1639[var8] = (short)arg2.method4280(-19104);
                                                this.field1632[var8] = (short)arg2.method4280(-19104);
                                                ++var8;
                                             }

                                             if (!var4) {
                                                if (!var4) {
                                                   break label202;
                                                }
                                                break;
                                             }

                                             ++var8;
                                          }
                                       }

                                       this.field1621 = 3;
                                       this.field1628 = arg2.method4302(true);
                                       if (!var4) {
                                          break label202;
                                       }
                                    }

                                    this.field1621 = 3;
                                    this.field1628 = arg2.method4280(-19104);
                                    if (!var4) {
                                       break label202;
                                    }
                                 }

                                 this.field1621 = 5;
                                 if (!var4) {
                                    break label202;
                                 }
                              }

                              this.field1621 = 1;
                              if (!var4) {
                                 break label202;
                              }
                           }

                           this.field1635 = true;
                           if (!var4) {
                              break label202;
                           }
                        }

                        this.field1633 = arg2.method4288((byte)126);
                        if (!var4) {
                           break label202;
                        }
                     }

                     this.field1637 = arg2.method4288((byte)118);
                     if (!var4) {
                        break label202;
                     }
                  }

                  this.field1622 = arg2.method4280(-19104);
                  if (!var4) {
                     break label202;
                  }
               }

               this.field1634 = arg2.method4280(-19104);
               if (!var4) {
                  break label202;
               }
            }

            this.field1642 = arg2.method4280(-19104);
         }

         ++field1644;
         if (arg0 >= -117) {
            this.method1085(35, 17, (class594)null);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field1645[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1645[1] : field1645[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(Lha;Lqga;IIIIIB)Lka;"
   )
   public final class501 method1086(class65 arg0, class196 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
      try {
         ++field1630;
         return arg5 != 13020 ? null : this.method1082((byte)82, (class295)null, arg2, arg3, arg1, arg4, (class295)null, false, arg0, 0, arg7, 0, 0, arg6);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field1645[6] + (arg0 != null ? field1645[1] : field1645[2]) + ',' + (arg1 != null ? field1645[1] : field1645[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1087(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1088(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
