import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class595 extends class76 {
   @OriginalMember(
      owner = "client!cv",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8756 = new String[]{method4327(method4326("Mu/sG")), method4327(method4326("@vm^")), method4327(method4326("Mu/tG")), method4327(method4326("U-/\u001c\u0012")), method4327(method4326("Mu/uG")), method4327(method4326("Mu/vG")), method4327(method4326("Mu/zG")), method4327(method4326("Mu/qG")), method4327(method4326("Mu/wG")), method4327(method4326("Mu/pG"))};
   @OriginalMember(
      owner = "client!cv",
      name = "M",
      descriptor = "Z"
   )
   public static boolean field8747 = false;
   @OriginalMember(
      owner = "client!cv",
      name = "N",
      descriptor = "I"
   )
   public static int field8740;
   @OriginalMember(
      owner = "client!cv",
      name = "E",
      descriptor = "I"
   )
   public static int field8744;
   @OriginalMember(
      owner = "client!cv",
      name = "O",
      descriptor = "I"
   )
   public static int field8748;
   @OriginalMember(
      owner = "client!cv",
      name = "G",
      descriptor = "I"
   )
   public static int field8751;
   @OriginalMember(
      owner = "client!cv",
      name = "I",
      descriptor = "I"
   )
   public static int field8752;
   @OriginalMember(
      owner = "client!cv",
      name = "C",
      descriptor = "I"
   )
   public static int field8753;
   @OriginalMember(
      owner = "client!cv",
      name = "F",
      descriptor = "I"
   )
   public static int field8754;
   @OriginalMember(
      owner = "client!cv",
      name = "B",
      descriptor = "I"
   )
   public static int field8755;
   @OriginalMember(
      owner = "client!cv",
      name = "K",
      descriptor = "Lkf;"
   )
   public static class266 field8745;
   @OriginalMember(
      owner = "client!cv",
      name = "D",
      descriptor = "Lmha;"
   )
   public static class439 field8750;
   @OriginalMember(
      owner = "client!cv",
      name = "J",
      descriptor = "Ljava/lang/String;"
   )
   public String field8743;
   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "[C"
   )
   public char[] field8741;
   @OriginalMember(
      owner = "client!cv",
      name = "H",
      descriptor = "[C"
   )
   public char[] field8742;
   @OriginalMember(
      owner = "client!cv",
      name = "L",
      descriptor = "[I"
   )
   public int[] field8746;
   @OriginalMember(
      owner = "client!cv",
      name = "A",
      descriptor = "[I"
   )
   public int[] field8749;

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "([[[Lkp;I)V",
      line = 6
   )
   public static final void method4318(class517[][][] arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         int var3 = 0;
         if (!var2 && ~var3 <= ~arg0.length) {
            if (arg1 < 14) {
               method4325(false, (class266)null, (class266)null, (class266)null, (class266)null);
            }

            ++field8740;
         } else {
            do {
               class517[][] var4 = arg0[var3];
               int var5 = 0;
               if (var2 || ~var4.length < ~var5) {
                  do {
                     int var6 = 0;
                     if (var2 || ~var4[var5].length < ~var6) {
                        do {
                           class517 var7 = var4[var5][var6];
                           if (var7 == null) {
                              ++var6;
                           } else {
                              if (var7.field7464 instanceof class604) {
                                 ((class604)var7.field7464).method243(-29381);
                              }

                              if (var7.field7474 instanceof class604) {
                                 ((class604)var7.field7474).method243(-29381);
                              }

                              if (var7.field7475 instanceof class604) {
                                 ((class604)var7.field7475).method243(-29381);
                              }

                              if (var7.field7476 instanceof class604) {
                                 ((class604)var7.field7476).method243(-29381);
                                 if (var7.field7469 instanceof class604) {
                                    ((class604)var7.field7469).method243(-29381);
                                 }
                              } else if (var7.field7469 instanceof class604) {
                                 ((class604)var7.field7469).method243(-29381);
                              }

                              class772 var8 = var7.field7468;
                              class627 var9;
                              if (var2) {
                                 var9 = var8.field11352;
                                 if (var9 instanceof class604) {
                                    ((class604)var9).method243(-29381);
                                 }

                                 var8 = var8.field11354;
                              }

                              while(var8 != null) {
                                 var9 = var8.field11352;
                                 if (var9 instanceof class604) {
                                    ((class604)var9).method243(-29381);
                                 }

                                 var8 = var8.field11354;
                              }

                              ++var6;
                           }
                        } while(~var4[var5].length < ~var6);
                     }

                     ++var5;
                  } while(~var4.length < ~var5);
               }

               ++var3;
            } while(~var3 > ~arg0.length);

            if (arg1 < 14) {
               method4325(false, (class266)null, (class266)null, (class266)null, (class266)null);
            }

            ++field8740;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field8756[9] + (arg0 != null ? field8756[3] : field8756[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(CZ)I",
      line = 79
   )
   public final int method4319(char arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         ++field8752;
         if (this.field8749 == null) {
            return -1;
         } else {
            int var4 = 0;
            if (arg1) {
               this.field8741 = null;
               if (var3) {
                  if (~this.field8741[var4] == ~arg0) {
                     return this.field8749[var4];
                  }

                  ++var4;
               }
            }

            while(true) {
               int var10000;
               if (~this.field8749.length >= ~var4) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = ~this.field8741[var4];
               }

               if (var10000 == ~arg0) {
                  return this.field8749[var4];
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8756[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(I)V",
      line = 104
   )
   public final void method4320(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 137
   )
   private final void method4321(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field8744;
         int var5 = 68 % ((arg0 - -16) / 46);
         if (~arg2 == -2) {
            this.field8743 = arg1.method1204(2119550368);
         } else {
            if (arg2 != 2) {
               if (arg2 == 3) {
                  int var6 = arg1.method1143(-15465);
                  this.field8741 = new char[var6];
                  this.field8749 = new int[var6];
                  int var7 = 0;
                  if (var4) {
                     this.field8749[var7] = arg1.method1211(-26166);
                  } else if (~var6 >= ~var7) {
                     if (!var4) {
                        return;
                     }
                  } else {
                     this.field8749[var7] = arg1.method1211(-26166);
                  }

                  while(true) {
                     byte var8 = arg1.method1162(4);
                     this.field8741[var7] = ~var8 == -1 ? 0 : class312.method2306(true, var8);
                     ++var7;
                     if (~var6 >= ~var7) {
                        if (!var4) {
                           return;
                        }
                     } else {
                        this.field8749[var7] = arg1.method1211(-26166);
                     }
                  }
               }
            } else {
               int var9 = arg1.method1143(-15465);
               this.field8746 = new int[var9];
               this.field8742 = new char[var9];
               int var10 = 0;
               if (var4 || var10 < var9) {
                  do {
                     this.field8746[var10] = arg1.method1211(-26166);
                     byte var11 = arg1.method1162(4);
                     this.field8742[var10] = var11 != 0 ? class312.method2306(true, var11) : 0;
                     ++var10;
                  } while(var10 < var9);
               }
            }

         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field8756[4] + arg0 + ',' + (arg1 != null ? field8756[3] : field8756[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "c",
      descriptor = "(I)V",
      line = 202
   )
   public static void method4322(int arg0) {
      try {
         field8745 = null;
         field8750 = null;
         if (arg0 != 3) {
            field8747 = false;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8756[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(BLwf;)V",
      line = 215
   )
   public final void method4323(byte arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         ++field8751;
         if (arg0 != -32) {
            this.method4324((byte)-81, '\f');
         }

         do {
            int var4 = arg1.method1143(-15465);
            if (var4 == 0) {
               break;
            }

            this.method4321(arg0 ^ -65, arg1, var4);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8756[2] + arg0 + ',' + (arg1 != null ? field8756[3] : field8756[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(BC)I",
      line = 235
   )
   public final int method4324(byte arg0, char arg1) {
      boolean var3 = client.field4360;

      try {
         ++field8754;
         if (this.field8746 == null) {
            return -1;
         } else if (arg0 > -81) {
            return 0;
         } else {
            int var4 = 0;
            int var10000;
            if (var3) {
               var10000 = ~arg1;
            } else if (var4 >= this.field8746.length) {
               var10000 = -1;
               if (!var3) {
                  return -1;
               }
            } else {
               var10000 = ~arg1;
            }

            while(var10000 != ~this.field8742[var4]) {
               ++var4;
               if (var4 >= this.field8746.length) {
                  var10000 = -1;
                  if (!var3) {
                     return -1;
                  }
               } else {
                  var10000 = ~arg1;
               }
            }

            return this.field8746[var4];
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8756[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(ZLkf;Lkf;Lkf;Lkf;)V",
      line = 260
   )
   public static final void method4325(boolean arg0, class266 arg1, class266 arg2, class266 arg3, class266 arg4) {
      try {
         class287.field3971 = arg3;
         if (arg0) {
            class361.field4924 = arg4;
            class495.field7187 = arg1;
            ++field8748;
            class547.field7851 = new class678[class361.field4924.method2027((byte)-97)][];
            class603.field8873 = new boolean[class361.field4924.method2027((byte)-99)];
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8756[5] + arg0 + ',' + (arg1 != null ? field8756[3] : field8756[1]) + ',' + (arg2 != null ? field8756[3] : field8756[1]) + ',' + (arg3 != null ? field8756[3] : field8756[1]) + ',' + (arg4 != null ? field8756[3] : field8756[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4326(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4327(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
