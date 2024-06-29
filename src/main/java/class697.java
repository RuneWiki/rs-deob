import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class697 extends class454 {
   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10223 = new String[]{method5085(method5084("'\u001em\"V")), method5085(method5084("'\u001em$V")), method5085(method5084("'\u001em(V")), method5085(method5084("6YmN\u0003")), method5085(method5084("#\u0002/\f")), method5085(method5084("'\u001em/V")), method5085(method5084("'\u001em0V")), method5085(method5084("'\u001em1V")), method5085(method5084("'\u001em&V")), method5085(method5084("'\u001em#V")), method5085(method5084("'\u001em.V")), method5085(method5084("'\u001em'V")), method5085(method5084("'\u001em!V")), method5085(method5084("'\u001em%V")), method5085(method5084("'\u001em2V"))};
   @OriginalMember(
      owner = "client!ji",
      name = "l",
      descriptor = "I"
   )
   public static int field10210;
   @OriginalMember(
      owner = "client!ji",
      name = "n",
      descriptor = "I"
   )
   public static int field10211;
   @OriginalMember(
      owner = "client!ji",
      name = "k",
      descriptor = "I"
   )
   public static int field10212;
   @OriginalMember(
      owner = "client!ji",
      name = "t",
      descriptor = "I"
   )
   public static int field10213;
   @OriginalMember(
      owner = "client!ji",
      name = "m",
      descriptor = "I"
   )
   public static int field10214;
   @OriginalMember(
      owner = "client!ji",
      name = "j",
      descriptor = "I"
   )
   public static int field10215;
   @OriginalMember(
      owner = "client!ji",
      name = "p",
      descriptor = "I"
   )
   public static int field10216;
   @OriginalMember(
      owner = "client!ji",
      name = "o",
      descriptor = "I"
   )
   public static int field10217;
   @OriginalMember(
      owner = "client!ji",
      name = "i",
      descriptor = "I"
   )
   public static int field10218;
   @OriginalMember(
      owner = "client!ji",
      name = "s",
      descriptor = "I"
   )
   public static int field10219;
   @OriginalMember(
      owner = "client!ji",
      name = "r",
      descriptor = "I"
   )
   public static int field10220;
   @OriginalMember(
      owner = "client!ji",
      name = "u",
      descriptor = "I"
   )
   public static int field10221;
   @OriginalMember(
      owner = "client!ji",
      name = "q",
      descriptor = "I"
   )
   public static int field10222;

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         super.field6263 = arg1;
         if (arg0 > -46) {
            method5082(-86, 90, 31, -121, -109, 29, -18);
         }

         ++field10211;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10223[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field10217;
         if (super.field6259.method5434((byte)-122)) {
            super.field6263 = 0;
         }

         if (~super.field6263 > -1 && super.field6263 > 2) {
            super.field6263 = this.method23(1);
         }

         if (!arg0) {
            this.method20((byte)20, 11);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10223[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            return 29;
         } else {
            ++field10222;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10223[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            return -87;
         } else {
            ++field10213;
            if (super.field6259.method5434((byte)-117)) {
               return 3;
            } else {
               return ~arg0 != -1 && super.field6259.field10967.method1752(-18033) != 1 ? 2 : 1;
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10223[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method5075(int arg0) {
      try {
         ++field10214;
         if (arg0 <= -81) {
            class401.field5510.method1809(true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10223[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method5076(int arg0, int arg1) {
      try {
         ++field10218;
         if (arg1 != -1) {
            return 29;
         } else if (~arg0 == -6407) {
            return 1;
         } else if (~arg0 == -6410) {
            return 1;
         } else if (~arg0 != -32842) {
            if (~arg0 != -6411) {
               if (arg0 == 6407) {
                  return 3;
               } else if (arg0 == 6408) {
                  return 4;
               } else {
                  throw new IllegalArgumentException("");
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10223[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(BLwo;)V"
   )
   public static final void method5077(byte arg0, class328 arg1) {
      boolean var2 = client.field1481;

      try {
         arg1.field4540 = null;
         ++field10220;
         int var3 = arg1.field4538.length;
         int var4 = 0;
         if (arg0 == 1) {
            while(true) {
               if (var3 <= var4) {
                  class627[] var5 = class381.field5304;
                  synchronized(class381.field5304) {
                     if (!var2) {
                        if (~var3 > ~class381.field5304.length && class210.field2679[var3] < 200) {
                           class381.field5304[var3].method4637(arg1, (byte)101);
                           int var10002 = class210.field2679[var3]++;
                        }

                        return;
                     }
                  }
               } else {
                  arg1.field4538[var4].field10117 = false;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10223[5] + arg0 + ',' + (arg1 != null ? field10223[3] : field10223[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IIB[B)Ljava/lang/String;"
   )
   public static final String method5078(int arg0, int arg1, byte arg2, byte[] arg3) {
      boolean var4 = client.field1481;

      try {
         ++field10210;
         char[] var5 = new char[arg0];
         int var6 = 0;
         int var7 = arg1;
         int var8 = arg0 + arg1;
         if (arg2 < 90) {
            return null;
         } else {
            while(~var8 < ~var7) {
               int var10;
               label125: {
                  int var9 = 255 & arg3[var7++];
                  if (var9 < 128) {
                     if (var9 != 0) {
                        var10 = var9;
                        if (!var4) {
                           break label125;
                        }
                     }

                     var10 = 65533;
                     if (!var4) {
                        break label125;
                     }
                  }

                  if (var9 >= 192) {
                     if (~var9 <= -225) {
                        if (~var9 <= -241) {
                           if (var9 < 248) {
                              if (~(var7 - -2) > ~var8 && (192 & arg3[var7]) == 128 && (192 & arg3[var7 + 1]) == 128 && ~(192 & arg3[var7 + 2]) == -129) {
                                 int var11 = (63 & arg3[var7++]) << 12 | 1835008 & var9 << 18 | 4032 & arg3[var7++] << 6 | 63 & arg3[var7++];
                                 if (var11 < 65536 || ~var11 < -1114112) {
                                    var10 = 65533;
                                    if (!var4) {
                                       break label125;
                                    }
                                 }

                                 var10 = 65533;
                                 if (!var4) {
                                    break label125;
                                 }
                              }

                              var10 = 65533;
                              if (!var4) {
                                 break label125;
                              }
                           }

                           var10 = 65533;
                           if (!var4) {
                              break label125;
                           }
                        }

                        if (~(var7 - -1) <= ~var8 || ~(arg3[var7] & 192) != -129 || (arg3[var7 + 1] & 192) != 128) {
                           var10 = 65533;
                           if (!var4) {
                              break label125;
                           }
                        }

                        var10 = 4032 & arg3[var7++] << 6 | (var9 & 15) << 12 | 63 & arg3[var7++];
                        if (~var10 <= -2049) {
                           break label125;
                        }

                        var10 = 65533;
                        if (!var4) {
                           break label125;
                        }
                     }

                     if (var7 >= var8 || ~(arg3[var7] & 192) != -129) {
                        var10 = 65533;
                        if (!var4) {
                           break label125;
                        }
                     }

                     var10 = 63 & arg3[var7++] | (var9 & 31) << 6;
                     if (var10 >= 128) {
                        break label125;
                     }

                     var10 = 65533;
                     if (!var4) {
                        break label125;
                     }
                  }

                  var10 = 65533;
               }

               var5[var6++] = (char)var10;
            }

            return new String(var5, 0, var6);
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field10223[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10223[3] : field10223[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(JB)V"
   )
   public static final void method5079(long arg0, byte arg1) {
      boolean var3 = client.field1481;

      try {
         ++field10219;
         int var4 = class2.field27;
         int var5 = class274.field3506;
         int var6 = 103 / ((arg1 - -68) / 40);
         if (~class70.field942 != ~var4) {
            int var8;
            label76: {
               int var7 = -class70.field942 + var4;
               var8 = (int)((long)var7 * arg0 / 320L);
               if (~var7 >= -1) {
                  if (~var8 != -1) {
                     if (~var8 <= ~var7) {
                        break label76;
                     }

                     var8 = var7;
                     if (!var3) {
                        break label76;
                     }
                  }

                  var8 = -1;
                  if (!var3) {
                     break label76;
                  }
               }

               if (~var8 == -1) {
                  var8 = 1;
                  if (!var3) {
                     break label76;
                  }
               }

               if (~var7 > ~var8) {
                  var8 = var7;
               }
            }

            class70.field942 += var8;
         }

         class623.field9202 += (float)arg0 * class784.field11461 / 40.0F * 8.0F;
         if (class95.field1290 != var5) {
            int var10;
            label77: {
               int var9 = var5 - class95.field1290;
               var10 = (int)((long)var9 * arg0 / 320L);
               if (~var9 < -1) {
                  if (~var10 == -1) {
                     var10 = 1;
                     if (!var3) {
                        break label77;
                     }
                  }

                  if (~var9 <= ~var10) {
                     break label77;
                  }

                  var10 = var9;
                  if (!var3) {
                     break label77;
                  }
               }

               if (~var10 != -1) {
                  if (var9 <= var10) {
                     break label77;
                  }

                  var10 = var9;
                  if (!var3) {
                     break label77;
                  }
               }

               var10 = -1;
            }

            class95.field1290 += var10;
         }

         class250.field3162 += (float)arg0 * class419.field5734 / 40.0F * 8.0F;
         class223.method1783((byte)-120);
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field10223[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class697(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method5080(class479 arg0, int arg1) {
      boolean var2 = client.field1481;

      RuntimeException var10000;
      label42: {
         boolean var10001;
         class619 var3;
         try {
            var3 = (class619)class363.field5037.method4639(-115);
            if (arg1 != 320) {
               return;
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label42;
         }

         while(true) {
            label37: {
               try {
                  if (var3 != null) {
                     if (var3.field9120) {
                        var3.method4555(arg0);
                     }
                     break label37;
                  }

                  ++field10221;
               } catch (RuntimeException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }

               if (!var2) {
                  return;
               }
            }

            try {
               var3 = (class619)class363.field5037.method4636((byte)78);
            } catch (RuntimeException var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var4 = var10000;
      throw class93.method866(var4, field10223[7] + (arg0 != null ? field10223[3] : field10223[4]) + ',' + arg1 + ')');
   }

   @OriginalMember(
      owner = "client!ji",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method5081(boolean arg0) {
      try {
         ++field10215;
         if (arg0) {
            this.method24(-105, true);
         }

         return !super.field6259.method5434((byte)-124);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10223[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method5082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         label56: {
            ++field10212;
            if (~arg0 != -9 && arg0 != 16) {
               class731 var8 = class548.field8080[arg4][arg6][arg2];
               if (var8 == null) {
                  var8 = new class731(arg4);
               }

               label46: {
                  if (arg0 != 1) {
                     if (~arg0 != -3) {
                        break label46;
                     }

                     var8.field10643 = (short)arg5;
                     var8.field10645 = (short)arg1;
                     if (!var7) {
                        break label46;
                     }
                  }

                  var8.field10653 = (short)arg5;
                  var8.field10648 = (short)arg1;
               }

               if (!class283.field3931) {
                  break label56;
               }

               class254.method2043(1);
               if (!var7) {
                  break label56;
               }
            }

            if (~arg0 == -9) {
               int var9 = arg6 << class783.field11447;
               int var10 = class15.field276 + var9;
               int var11 = arg2 << class783.field11447;
               int var12 = class15.field276 + var11;
               int var13 = class373.field5223[arg4].method3284(-1, arg6, arg2);
               int var14 = class373.field5223[arg4].method3284(-1, arg6 + 1, arg2 + 1);
               class37.field532[class367.field5120++] = new class529(arg0, arg4, var9, var10, var10, var9, var13, var14, var14 - arg1, -arg1 + var13, var11, var12, var12, var11);
               if (!var7) {
                  break label56;
               }
            }

            int var15 = (arg6 << class783.field11447) + class15.field276;
            int var16 = -class15.field276 + var15;
            int var17 = arg2 << class783.field11447;
            int var18 = class15.field276 + var17;
            int var19 = class373.field5223[arg4].method3284(-1, arg6 + 1, arg2);
            int var20 = class373.field5223[arg4].method3284(arg3 ^ 18863, arg6, arg2 + 1);
            class37.field532[class367.field5120++] = new class529(arg0, arg4, var15, var16, var16, var15, var19, var20, -arg1 + var20, -arg1 + var19, var17, var18, var18, var17);
         }

         if (arg3 != -18864) {
            method5079(14L, (byte)-44);
         }
      } catch (RuntimeException var22) {
         throw class93.method866(var22, field10223[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method5083(int arg0) {
      try {
         if (arg0 != -18033) {
            return 12;
         } else {
            ++field10216;
            return super.field6263;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10223[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class697(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5084(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5085(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
