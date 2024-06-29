import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class628 {
   @OriginalMember(
      owner = "client!ed",
      name = "e",
      descriptor = "I"
   )
   public int field9268 = 512;
   @OriginalMember(
      owner = "client!ed",
      name = "t",
      descriptor = "I"
   )
   public int field9267 = -1;
   @OriginalMember(
      owner = "client!ed",
      name = "n",
      descriptor = "I"
   )
   public int field9270 = 8;
   @OriginalMember(
      owner = "client!ed",
      name = "m",
      descriptor = "Z"
   )
   public boolean field9269 = false;
   @OriginalMember(
      owner = "client!ed",
      name = "k",
      descriptor = "Z"
   )
   public boolean field9272 = true;
   @OriginalMember(
      owner = "client!ed",
      name = "q",
      descriptor = "Z"
   )
   public boolean field9266 = true;
   @OriginalMember(
      owner = "client!ed",
      name = "b",
      descriptor = "I"
   )
   public int field9281 = 127;
   @OriginalMember(
      owner = "client!ed",
      name = "d",
      descriptor = "I"
   )
   public int field9278 = 0;
   @OriginalMember(
      owner = "client!ed",
      name = "g",
      descriptor = "I"
   )
   public int field9274 = -1;
   @OriginalMember(
      owner = "client!ed",
      name = "p",
      descriptor = "I"
   )
   public int field9282 = 1190717;
   @OriginalMember(
      owner = "client!ed",
      name = "s",
      descriptor = "I"
   )
   public int field9279 = 64;
   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9285 = new String[]{method4649(method4648(":~kvo")), method4649(method4648(":~kwo")), method4649(method4648("0j Z41")), method4649(method4648("6t3[}")), method4649(method4648(":~kpo")), method4649(method4648("\u007f7e")), method4649(method4648("$4k\u001a:")), method4649(method4648("cs(Szo$")), method4649(method4648("\u007fs5\u000e")), method4649(method4648("\u000b+e\u0019g")), method4649(method4648("cs(Szn$")), method4649(method4648("1o)X")), method4649(method4648(":~kuo")), method4649(method4648(":~kqo"))};
   @OriginalMember(
      owner = "client!ed",
      name = "j",
      descriptor = "Laka;"
   )
   public static class418 field9265 = new class418(34, 6);
   @OriginalMember(
      owner = "client!ed",
      name = "i",
      descriptor = "Lcfa;"
   )
   public static class187 field9271 = new class187();
   @OriginalMember(
      owner = "client!ed",
      name = "c",
      descriptor = "I"
   )
   public static int field9275;
   @OriginalMember(
      owner = "client!ed",
      name = "r",
      descriptor = "I"
   )
   public static int field9276;
   @OriginalMember(
      owner = "client!ed",
      name = "h",
      descriptor = "I"
   )
   public static int field9277;
   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "I"
   )
   public int field9280;
   @OriginalMember(
      owner = "client!ed",
      name = "l",
      descriptor = "I"
   )
   public static int field9283;
   @OriginalMember(
      owner = "client!ed",
      name = "o",
      descriptor = "I"
   )
   public static int field9284;
   @OriginalMember(
      owner = "client!ed",
      name = "f",
      descriptor = "Los;"
   )
   public class277 field9273;

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4643(int arg0) {
      try {
         field9265 = null;
         if (arg0 == 0) {
            field9271 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9285[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(ILum;)Z"
   )
   public static final boolean method4644(int param0, class594 param1) throws IOException {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method4645(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 > -82) {
            this.method4645(-80, (class66)null);
         }

         while(true) {
            int var4 = arg1.method640(255);
            if (var4 != 0) {
               this.method4646(arg1, var4, (byte)106);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field9283;
            break;
         }

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9285[12] + arg0 + ',' + (arg1 != null ? field9285[6] : field9285[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(Lgea;IB)V"
   )
   private final void method4646(class66 arg0, int arg1, byte arg2) {
      boolean var4 = client.field1481;

      try {
         label113: {
            ++field9276;
            if (arg1 != 1) {
               if (arg1 == 2) {
                  this.field9274 = arg0.method640(255);
                  if (!var4) {
                     break label113;
                  }
               }

               if (arg1 != 3) {
                  if (arg1 == 5) {
                     this.field9266 = false;
                     if (!var4) {
                        break label113;
                     }
                  }

                  if (~arg1 != -8) {
                     if (~arg1 == -9) {
                        this.field9273.field3544 = this.field9280;
                        if (!var4) {
                           break label113;
                        }
                     }

                     if (~arg1 == -10) {
                        this.field9268 = arg0.method603(-2) << 2;
                        if (!var4) {
                           break label113;
                        }
                     }

                     if (arg1 != 10) {
                        if (~arg1 == -12) {
                           this.field9270 = arg0.method640(255);
                           if (!var4) {
                              break label113;
                           }
                        }

                        if (~arg1 == -13) {
                           this.field9269 = true;
                           if (!var4) {
                              break label113;
                           }
                        }

                        if (arg1 != 13) {
                           if (arg1 != 14) {
                              if (~arg1 != -17) {
                                 break label113;
                              }

                              this.field9281 = arg0.method640(255);
                              if (!var4) {
                                 break label113;
                              }
                           }

                           this.field9279 = arg0.method640(255) << 2;
                           if (!var4) {
                              break label113;
                           }
                        }

                        this.field9282 = arg0.method645((byte)-26);
                        if (!var4) {
                           break label113;
                        }
                     }

                     this.field9272 = false;
                     if (!var4) {
                        break label113;
                     }
                  }

                  this.field9267 = class90.method836(-53, arg0.method645((byte)-26));
                  if (!var4) {
                     break label113;
                  }
               }

               this.field9274 = arg0.method603(-2);
               if (~this.field9274 != -65536) {
                  break label113;
               }

               this.field9274 = -1;
               if (!var4) {
                  break label113;
               }
            }

            this.field9278 = class90.method836(-78, arg0.method645((byte)-26));
         }

         if (arg2 < 21) {
            this.field9280 = -22;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9285[13] + (arg0 != null ? field9285[6] : field9285[11]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4647(byte arg0) {
      try {
         ++field9275;
         this.field9270 = this.field9270 << 8 | this.field9280;
         if (arg0 != 26) {
            this.field9272 = false;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9285[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4648(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4649(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
