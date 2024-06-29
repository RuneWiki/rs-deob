import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public abstract class class532 {
   @OriginalMember(
      owner = "client!bha",
      name = "G",
      descriptor = "[B"
   )
   private byte[] field8086;
   @OriginalMember(
      owner = "client!bha",
      name = "I",
      descriptor = "Ljagtheora/ogg/OggSyncState;"
   )
   private OggSyncState field8058;
   @OriginalMember(
      owner = "client!bha",
      name = "K",
      descriptor = "Ljagtheora/ogg/OggPage;"
   )
   private OggPage field8072;
   @OriginalMember(
      owner = "client!bha",
      name = "L",
      descriptor = "Ljagtheora/ogg/OggPacket;"
   )
   private OggPacket field8066;
   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "Let;"
   )
   private class389 field8076;
   @OriginalMember(
      owner = "client!bha",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8089 = new String[]{method4099(method4098("d0U1}.")), method4099(method4098("d0U1g.")), method4099(method4098("d0U1f.")), method4099(method4098("l9Sk_c7F~")), method4099(method4098("d0U1\u000bo6]k\t.")), method4099(method4098("@9]sRbx@p\u0017j7U{\u0017l9Sk_c7F~\u0017j1VmVt!")), method4099(method4098("d0U1y.")), method4099(method4098("d0U1x.")), method4099(method4098("}v\u001a1J")), method4099(method4098("d0U1z.")), method4099(method4098("h-Xs")), method4099(method4098("d0U1|.")), method4099(method4098("d0U1c.")), method4099(method4098("d0U1\u007f.")), method4099(method4098("d0U1a.")), method4099(method4098("d0U1d.")), method4099(method4098("d0U1~.")), method4099(method4098("d0U1{.")), method4099(method4098("d0U1b.")), method4099(method4098("d0U1`.")), method4099(method4098("m9@z")), method4099(method4098("d0U1p.")), method4099(method4098("d0U1q.")), method4099(method4098("d0U1e.")), method4099(method4098("d0U1r."))};
   @OriginalMember(
      owner = "client!bha",
      name = "g",
      descriptor = "[S"
   )
   private static short[] field8056 = new short[]{967, 20428, -21577, 11219, -10290};
   @OriginalMember(
      owner = "client!bha",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field8077 = new int[3];
   @OriginalMember(
      owner = "client!bha",
      name = "M",
      descriptor = "[S"
   )
   private static short[] field8079 = new short[]{952, 20413, -21592, 11204, -10305};
   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "[S"
   )
   private static short[] field8081 = new short[]{957, 20418, -21587, 11209, -10300};
   @OriginalMember(
      owner = "client!bha",
      name = "e",
      descriptor = "[S"
   )
   private static short[] field8088 = new short[]{962, 20423, -21582, 11214, -10295};
   @OriginalMember(
      owner = "client!bha",
      name = "n",
      descriptor = "[[S"
   )
   public static short[][] field8085 = new short[][]{field8056, field8088, field8081, field8079};
   @OriginalMember(
      owner = "client!bha",
      name = "H",
      descriptor = "I"
   )
   public static int field8050;
   @OriginalMember(
      owner = "client!bha",
      name = "D",
      descriptor = "I"
   )
   public static int field8051;
   @OriginalMember(
      owner = "client!bha",
      name = "C",
      descriptor = "I"
   )
   public static int field8052;
   @OriginalMember(
      owner = "client!bha",
      name = "h",
      descriptor = "I"
   )
   public static int field8055;
   @OriginalMember(
      owner = "client!bha",
      name = "B",
      descriptor = "I"
   )
   public static int field8057;
   @OriginalMember(
      owner = "client!bha",
      name = "F",
      descriptor = "I"
   )
   public static int field8061;
   @OriginalMember(
      owner = "client!bha",
      name = "o",
      descriptor = "I"
   )
   public static int field8062;
   @OriginalMember(
      owner = "client!bha",
      name = "x",
      descriptor = "I"
   )
   public static int field8064;
   @OriginalMember(
      owner = "client!bha",
      name = "y",
      descriptor = "I"
   )
   public static int field8065;
   @OriginalMember(
      owner = "client!bha",
      name = "l",
      descriptor = "I"
   )
   public static int field8068;
   @OriginalMember(
      owner = "client!bha",
      name = "p",
      descriptor = "I"
   )
   public static int field8070;
   @OriginalMember(
      owner = "client!bha",
      name = "i",
      descriptor = "I"
   )
   public static int field8071;
   @OriginalMember(
      owner = "client!bha",
      name = "E",
      descriptor = "I"
   )
   public static int field8073;
   @OriginalMember(
      owner = "client!bha",
      name = "d",
      descriptor = "I"
   )
   public static int field8074;
   @OriginalMember(
      owner = "client!bha",
      name = "k",
      descriptor = "I"
   )
   public static int field8075;
   @OriginalMember(
      owner = "client!bha",
      name = "u",
      descriptor = "I"
   )
   public static int field8078;
   @OriginalMember(
      owner = "client!bha",
      name = "J",
      descriptor = "I"
   )
   public static int field8080;
   @OriginalMember(
      owner = "client!bha",
      name = "A",
      descriptor = "I"
   )
   public static int field8082;
   @OriginalMember(
      owner = "client!bha",
      name = "v",
      descriptor = "I"
   )
   public static int field8084;
   @OriginalMember(
      owner = "client!bha",
      name = "r",
      descriptor = "I"
   )
   public static int field8087;
   @OriginalMember(
      owner = "client!bha",
      name = "s",
      descriptor = "Llh;"
   )
   private class473 field8067;
   @OriginalMember(
      owner = "client!bha",
      name = "c",
      descriptor = "Ldg;"
   )
   private class563 field8063;
   @OriginalMember(
      owner = "client!bha",
      name = "w",
      descriptor = "Lqaa;"
   )
   private class656 field8053;
   @OriginalMember(
      owner = "client!bha",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   private String field8059;
   @OriginalMember(
      owner = "client!bha",
      name = "t",
      descriptor = "Z"
   )
   private boolean field8054;
   @OriginalMember(
      owner = "client!bha",
      name = "f",
      descriptor = "Z"
   )
   private boolean field8060;
   @OriginalMember(
      owner = "client!bha",
      name = "b",
      descriptor = "Z"
   )
   private boolean field8069;
   @OriginalMember(
      owner = "client!bha",
      name = "q",
      descriptor = "Z"
   )
   private boolean field8083;

   @OriginalMember(
      owner = "client!bha",
      name = "j",
      descriptor = "(I)Ldg;"
   )
   public final class563 method4078(int arg0) {
      try {
         ++field8057;
         if (arg0 != -26596) {
            this.method4085(0);
         }

         return this.field8063;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8089[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method4079(byte arg0, boolean arg1) {
      try {
         if (arg0 >= -15) {
            this.method4086((byte)-65);
         }

         ++field8061;
         if (this.field8053 != null) {
            class781 var3 = this.field8053.method4831(-38);
            if (var3 != null) {
               var3.method5681(arg1, 16);
            }
         }

         this.field8060 = !this.field8060;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8089[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method4080(boolean arg0) {
      try {
         if (arg0) {
            field8079 = null;
         }

         ++field8087;
         if (!this.field8054 && !this.field8069) {
            return false;
         } else {
            return this.field8053 == null || ~this.field8053.method4836((byte)27) >= -1;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8089[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "h",
      descriptor = "(I)V"
   )
   private final void method4081(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bha",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method4082(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bha",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4083(int arg0) {
      try {
         if (arg0 <= -127) {
            field8088 = null;
            field8077 = null;
            field8056 = null;
            field8081 = null;
            field8085 = null;
            field8079 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8089[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "e",
      descriptor = "(I)Llfa;"
   )
   private final class120 method4084(int arg0) throws IOException {
      boolean var2 = client.field1786;

      try {
         if (arg0 != 0) {
            field8088 = null;
         }

         ++field8078;
         if (this.field8054) {
            throw new IllegalStateException();
         } else if (this.field8069) {
            return null;
         } else {
            label117:
            while(~this.field8058.pageOut(this.field8072) >= -1) {
               int var3 = this.method4089(this.field8086, (byte)-64);

               do {
                  if (var3 == -1) {
                     this.field8069 = true;
                     return null;
                  }

                  if (var3 == 0) {
                     return null;
                  }

                  if (this.field8058.write(this.field8086, var3)) {
                     continue label117;
                  }
               } while(var2);

               throw new RuntimeException("");
            }

            int var4 = this.field8072.getSerialNumber();
            if (!this.field8072.isBOS()) {
               class120 var11 = (class120)this.field8076.method3141((long)var4, true);
               if (!var11.field1698.pageIn(this.field8072)) {
                  throw new IllegalStateException();
               } else {
                  return var11;
               }
            } else {
               OggStreamState var5 = new OggStreamState(var4);
               if (!var5.pageIn(this.field8072)) {
                  throw new IllegalStateException();
               } else if (var5.packetPeek(this.field8066) != 1) {
                  throw new IllegalStateException();
               } else {
                  class120 var6;
                  label132: {
                     if (this.field8067 == null && this.field8066.isTheora()) {
                        this.field8067 = new class473(var5);
                        var6 = this.field8067;
                        if (!var2) {
                           break label132;
                        }
                     }

                     if (this.field8053 != null || !this.field8066.isVorbis()) {
                        boolean var10000;
                        label90: {
                           byte[] var7 = this.field8066.getData();
                           StringBuffer var8 = new StringBuffer();
                           int var9 = 1;
                           String var10;
                           if (var2) {
                              var10000 = Character.isLetterOrDigit((char)var7[var9]);
                           } else if (~var7.length >= ~var9) {
                              var10 = var8.toString();
                              var10000 = var10.equals(field8089[20]);
                              if (!var2) {
                                 break label90;
                              }
                           } else {
                              var10000 = Character.isLetterOrDigit((char)var7[var9]);
                           }

                           label89:
                           while(true) {
                              while(!var10000) {
                                 var10 = var8.toString();
                                 var10000 = var10.equals(field8089[20]);
                                 if (!var2) {
                                    break label89;
                                 }
                              }

                              var8.append((char)var7[var9]);
                              ++var9;
                              if (~var7.length >= ~var9) {
                                 var10 = var8.toString();
                                 var10000 = var10.equals(field8089[20]);
                                 if (!var2) {
                                    break;
                                 }
                              } else {
                                 var10000 = Character.isLetterOrDigit((char)var7[var9]);
                              }
                           }
                        }

                        if (var10000) {
                           var6 = new class563(var5);
                           if (!var2) {
                              break label132;
                           }
                        }

                        var6 = new class744(var5);
                        if (!var2) {
                           break label132;
                        }
                     }

                     this.field8053 = new class656(var5);
                     var6 = this.field8053;
                  }

                  this.field8076.method3143(126, var6, (long)var4);
                  return var6;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field8089[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "k",
      descriptor = "(I)V"
   )
   private final void method4085(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(B)D"
   )
   public final double method4086(byte arg0) {
      try {
         if (arg0 < 37) {
            this.method4078(-93);
         }

         ++field8071;
         if (this.field8053 != null) {
            return this.field8053.method4835((byte)-50);
         } else {
            return this.field8067 != null ? this.field8067.method3673(false) : 0.0D;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8089[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4087(int arg0) {
      try {
         ++field8075;
         if (class651.field9397 != arg0) {
            class247.method2105(false, class651.field9397, 9982, -1, -1);
            class651.field9397 = -1;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8089[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "f",
      descriptor = "(I)Lqaa;"
   )
   public final class656 method4088(int arg0) {
      try {
         if (arg0 != -5152) {
            this.method4085(-40);
         }

         ++field8064;
         return this.field8053;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8089[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "([BB)I"
   )
   public abstract int method4089(byte[] arg0, byte arg1) throws IOException;

   @OriginalMember(
      owner = "client!bha",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4090(int arg0) throws IOException {
      boolean var2 = client.field1786;

      RuntimeException var10000;
      label211: {
         boolean var10001;
         try {
            if (arg0 > -29) {
               return;
            }

            ++field8062;
            if (this.field8060) {
               return;
            }
         } catch (RuntimeException var12) {
            var10000 = var12;
            var10001 = false;
            break label211;
         }

         while(true) {
            class120 var3;
            label206: {
               label205: {
                  try {
                     if (!this.field8054) {
                        if (!this.field8083) {
                           var3 = this.method4084(0);
                           if (var3 == null) {
                              if (this.field8069) {
                                 this.method4085(1);
                              }

                              return;
                           }

                           if (var3 == null) {
                              throw new IllegalStateException();
                           }

                           this.field8083 = true;
                           if (!var2) {
                              break label206;
                           }
                        }
                        break label205;
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
                  var3 = (class120)this.field8076.method3141((long)this.field8072.getSerialNumber(), true);
               } catch (RuntimeException var9) {
                  var10000 = var9;
                  var10001 = false;
                  break;
               }
            }

            try {
               label216: {
                  if (this.field8053 != var3) {
                     if (!(var3 instanceof class563)) {
                        if (this.field8067 != var3) {
                           if (var2) {
                              if (~var3.field1699 == -2 && var3 instanceof class563) {
                                 this.method4094((byte)-114, this.field8059);
                              }

                              var3.method1112(-61, this.field8066);
                           }

                           while(true) {
                              while(~var3.field1698.packetOut(this.field8066) == -2) {
                                 if (~var3.field1699 == -2 && var3 instanceof class563) {
                                    this.method4094((byte)-114, this.field8059);
                                 }

                                 var3.method1112(-61, this.field8066);
                              }

                              if (!var2) {
                                 if (!var2) {
                                    break label216;
                                 }
                                 break;
                              }

                              var3.method1112(-61, this.field8066);
                           }
                        }

                        if (this.field8053 == null && !this.field8060) {
                           int var4 = 0;
                           if (var2) {
                              this.method4097(118);
                              if (this.field8054) {
                                 return;
                              }

                              ++var4;
                           }

                           while(~var4 > -11 && this.method4096((byte)115)) {
                              this.method4097(118);
                              if (this.field8054) {
                                 return;
                              }

                              ++var4;
                           }

                           return;
                        }
                        break label216;
                     }

                     this.method4081(-2);
                     if (!var2) {
                        break label216;
                     }
                  }

                  if (~this.field8053.method4836((byte)108) <= -51) {
                     return;
                  }

                  label154:
                  while(this.field8053.field1698.packetOut(this.field8066) == 1) {
                     this.field8053.method1112(-45, this.field8066);
                     this.method4081(-2);

                     do {
                        if (this.field8067 != null) {
                           int var13;
                           label225: {
                              double var5 = this.field8067.method3673(false);
                              int var7 = 0;
                              if (var2) {
                                 this.method4097(119);
                                 if (this.field8054) {
                                    return;
                                 }

                                 ++var7;
                              }

                              while(~var7 > -11) {
                                 var13 = this.method4096((byte)91);
                                 if (var2) {
                                    break label225;
                                 }

                                 if (var13 == 0) {
                                    break;
                                 }

                                 this.method4097(119);
                                 if (this.field8054) {
                                    return;
                                 }

                                 ++var7;
                              }

                              double var14;
                              var13 = (var14 = this.field8067.method3673(false) - var5) == 0.0D ? 0 : (var14 < 0.0D ? -1 : 1);
                           }

                           if (var13 > 0) {
                              return;
                           }
                        }

                        if (this.field8053.method4836((byte)92) < 50) {
                           continue label154;
                        }
                     } while(var2);

                     return;
                  }
               }

               this.field8083 = false;
            } catch (RuntimeException var10) {
               var10000 = var10;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var8 = var10000;
      throw class482.method3757(var8, field8089[16] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!bha",
      name = "b",
      descriptor = "(Z)Llh;"
   )
   public final class473 method4091(boolean arg0) {
      try {
         if (!arg0) {
            return null;
         } else {
            ++field8073;
            return this.field8067;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8089[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(IIIJ)V"
   )
   public static final void method4092(int arg0, int arg1, int arg2, long arg3) {
      try {
         ++field8070;
         if (arg2 != -1228259936) {
            field8056 = null;
         }

         int var5 = 31 & (int)arg3 >> 14;
         int var6 = (3613019 & (int)arg3) >> 20;
         int var7 = Integer.MAX_VALUE & (int)(arg3 >>> 32);
         if (~var5 != -11 && var5 != 11 && ~var5 != -23) {
            class679.method5031(0, var6, arg0, 0, (byte)-38, var5, arg1, 0, true);
         } else {
            class333 var8;
            int var9;
            int var10;
            label33: {
               var8 = class102.field1434.method1411(var7, -89);
               if (~var6 != -1 && var6 != 2) {
                  var9 = var8.field5104;
                  var10 = var8.field5097;
                  if (!client.field1786) {
                     break label33;
                  }
               }

               var10 = var8.field5104;
               var9 = var8.field5097;
            }

            int var11 = var8.field5053;
            if (~var6 != -1) {
               var11 = (var11 << var6 & 15) - -(var11 >> -var6 + 4);
            }

            class679.method5031(var10, 0, arg0, var9, (byte)-38, 0, arg1, var11, true);
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field8089[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(ILica;)V"
   )
   public static final void method4093(int arg0, class354 arg1) {
      try {
         ++field8052;
         if (~(arg1.field5428.length - arg1.field5436) <= -2) {
            int var2 = arg1.method2855(-31007);
            if (~var2 <= arg0 && ~var2 >= -2) {
               if (~(arg1.field5428.length - arg1.field5436) <= -3) {
                  int var3 = arg1.method2848(arg0 + -123);
                  if (var3 * 6 <= arg1.field5428.length + -arg1.field5436) {
                     for(int var4 = 0; var3 > var4; ++var4) {
                        int var5 = arg1.method2848(arg0 + -102);
                        int var6 = arg1.method2894(110);
                        if (class84.field1222.length > var5 && class486.field7390[var5] && (~class623.field9050.method5652((byte)-92, var5).field7790 != -50 || ~var6 <= 0 && ~var6 >= -2)) {
                           class84.field1222[var5] = var6;
                        }
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field8089[24] + arg0 + ',' + (arg1 != null ? field8089[8] : field8089[10]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public final void method4094(byte param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bha",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method4095(int arg0) {
      try {
         if (class218.field3290 != null) {
            class218.field3290.method5578(1);
         }

         ++field8065;
         if (class321.field4914 != null) {
            class321.field4914.method5578(1);
         }

         if (arg0 >= -23) {
            method4093(-67, (class354)null);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8089[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class532(int arg0) {
      try {
         if (!class158.method1410((byte)-93, field8089[3])) {
            throw new RuntimeException(field8089[5]);
         } else {
            this.field8086 = new byte[arg0];
            this.field8058 = new OggSyncState();
            this.field8072 = new OggPage();
            this.field8066 = new OggPacket();
            this.field8076 = new class389(8);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8089[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "b",
      descriptor = "(B)Z"
   )
   private final boolean method4096(byte arg0) {
      try {
         if (arg0 < 88) {
            return false;
         } else {
            ++field8051;
            if (this.field8053 != null) {
               return !this.field8067.method3677(0) || this.method4086((byte)122) > this.field8067.method3673(false);
            } else {
               double var2 = (double)this.field8067.method3679((byte)43);
               return var2 == 0.0D || (double)class162.method1442(14080) >= 1000.0D / var2 + (double)this.field8067.method3676((byte)-28);
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8089[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method4097(int arg0) throws IOException {
      boolean var2 = client.field1786;

      try {
         ++field8082;
         int var3 = 106 % ((arg0 - 72) / 42);
         class120 var4;
         if (var2) {
            var4 = this.method4084(0);
            if (var4 == null) {
               if (this.field8069) {
                  this.method4085(1);
               }

               return;
            }
         } else {
            if (this.field8067.field1698.packetOut(this.field8066) == 1) {
               this.field8067.method1112(-89, this.field8066);
               return;
            }

            var4 = this.method4084(0);
            if (var4 == null) {
               if (this.field8069) {
                  this.method4085(1);
               }

               return;
            }
         }

         label80:
         do {
            do {
               if (this.field8063 == var4) {
                  if (var2) {
                     var4 = this.method4084(-2);
                     continue label80;
                  }

                  this.method4081(-2);
               }

               if (this.field8067.field1698.packetOut(this.field8066) == 1) {
                  this.field8067.method1112(-89, this.field8066);
                  return;
               }

               var4 = this.method4084(0);
            } while(var4 != null);

            if (this.field8069) {
               this.method4085(1);
            }

            return;
         } while(var4 != null);

         if (this.field8069) {
            this.method4085(1);
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8089[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4098(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4099(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
