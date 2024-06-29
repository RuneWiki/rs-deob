import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class511 {
   @OriginalMember(
      owner = "client!lo",
      name = "g",
      descriptor = "Z"
   )
   public boolean field7248 = false;
   @OriginalMember(
      owner = "client!lo",
      name = "t",
      descriptor = "Liw;"
   )
   private class107 field7245 = new class107(64);
   @OriginalMember(
      owner = "client!lo",
      name = "j",
      descriptor = "Liw;"
   )
   public class107 field7266 = new class107(500);
   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "Liw;"
   )
   public class107 field7267 = new class107(30);
   @OriginalMember(
      owner = "client!lo",
      name = "w",
      descriptor = "Liw;"
   )
   public class107 field7268 = new class107(50);
   @OriginalMember(
      owner = "client!lo",
      name = "x",
      descriptor = "I"
   )
   private int field7263;
   @OriginalMember(
      owner = "client!lo",
      name = "h",
      descriptor = "Lsa;"
   )
   public class39 field7251;
   @OriginalMember(
      owner = "client!lo",
      name = "b",
      descriptor = "Lsa;"
   )
   private class39 field7261;
   @OriginalMember(
      owner = "client!lo",
      name = "s",
      descriptor = "Z"
   )
   public boolean field7254;
   @OriginalMember(
      owner = "client!lo",
      name = "f",
      descriptor = "Ltb;"
   )
   private class392 field7265;
   @OriginalMember(
      owner = "client!lo",
      name = "y",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field7270;
   @OriginalMember(
      owner = "client!lo",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7271 = new String[]{method3857(method3856("BbXEp")), method3857(method3856("BbXHp")), method3857(method3856("BbXIp")), method3857(method3856("BbXDp")), method3857(method3856("BbXGp")), method3857(method3856("BbXCp")), method3857(method3856("BbXKp")), method3857(method3856("@x\u001am")), method3857(method3856("BbX=1@d\u0002?p")), method3857(method3856("U#X/%")), method3857(method3856("L<D^>[a\u001a")), method3857(method3856("^<G^>[a\u001a")), method3857(method3856("BbXBp")), method3857(method3856("^<D^>[a\u001a")), method3857(method3856("BbXFp")), method3857(method3856("BbX@p"))};
   @OriginalMember(
      owner = "client!lo",
      name = "m",
      descriptor = "I"
   )
   public static int field7260 = -1;
   @OriginalMember(
      owner = "client!lo",
      name = "o",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field7258 = new Rectangle[100];
   @OriginalMember(
      owner = "client!lo",
      name = "i",
      descriptor = "I"
   )
   public static int field7246;
   @OriginalMember(
      owner = "client!lo",
      name = "p",
      descriptor = "I"
   )
   public static int field7247;
   @OriginalMember(
      owner = "client!lo",
      name = "n",
      descriptor = "I"
   )
   public static int field7249;
   @OriginalMember(
      owner = "client!lo",
      name = "e",
      descriptor = "I"
   )
   public static int field7250;
   @OriginalMember(
      owner = "client!lo",
      name = "k",
      descriptor = "I"
   )
   public static int field7252;
   @OriginalMember(
      owner = "client!lo",
      name = "u",
      descriptor = "I"
   )
   public static int field7253;
   @OriginalMember(
      owner = "client!lo",
      name = "d",
      descriptor = "I"
   )
   public static int field7255;
   @OriginalMember(
      owner = "client!lo",
      name = "v",
      descriptor = "I"
   )
   public static int field7256;
   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "I"
   )
   public static int field7257;
   @OriginalMember(
      owner = "client!lo",
      name = "c",
      descriptor = "I"
   )
   public static int field7259;
   @OriginalMember(
      owner = "client!lo",
      name = "r",
      descriptor = "I"
   )
   public static int field7262;
   @OriginalMember(
      owner = "client!lo",
      name = "q",
      descriptor = "I"
   )
   public static int field7264;
   @OriginalMember(
      owner = "client!lo",
      name = "l",
      descriptor = "I"
   )
   public int field7269;

   @OriginalMember(
      owner = "client!lo",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method3846(int arg0, int arg1) {
      try {
         class107 var3 = this.field7245;
         synchronized(this.field7245) {
            this.field7245.method1048(arg0, -8543);
         }

         ++field7250;
         class107 var4 = this.field7266;
         synchronized(this.field7266) {
            this.field7266.method1048(arg0, -8543);
            if (arg1 < 92) {
               this.method3853(false, (byte)-68);
            }
         }

         class107 var5 = this.field7267;
         synchronized(this.field7267) {
            this.field7267.method1048(arg0, -8543);
         }

         class107 var6 = this.field7268;
         synchronized(this.field7268) {
            this.field7268.method1048(arg0, -8543);
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field7271[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3847(int arg0, byte arg1) {
      try {
         ++field7252;
         if (arg1 != 39) {
            this.method3850(49, -116);
         }

         this.field7269 = arg0;
         class107 var3 = this.field7266;
         synchronized(this.field7266) {
            this.field7266.method1052(true);
         }

         class107 var4 = this.field7267;
         synchronized(this.field7267) {
            this.field7267.method1052(true);
         }

         class107 var5 = this.field7268;
         synchronized(this.field7268) {
            this.field7268.method1052(true);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field7271[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method3848(boolean arg0, int arg1) {
      try {
         ++field7257;
         int var3 = -53 % ((2 - arg1) / 58);
         if (arg0 == !this.field7248) {
            this.field7248 = arg0;
            this.method3849(-125);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7271[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3849(int arg0) {
      try {
         class107 var2 = this.field7245;
         synchronized(this.field7245) {
            this.field7245.method1052(true);
         }

         ++field7247;
         class107 var3 = this.field7266;
         synchronized(this.field7266) {
            this.field7266.method1052(true);
         }

         class107 var4 = this.field7267;
         synchronized(this.field7267) {
            this.field7267.method1052(true);
         }

         if (arg0 > -45) {
            this.method3851(22, 29);
         }

         class107 var5 = this.field7268;
         synchronized(this.field7268) {
            this.field7268.method1052(true);
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field7271[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "b",
      descriptor = "(II)Lbha;"
   )
   public final class544 method3850(int arg0, int arg1) {
      try {
         ++field7259;
         class107 var3 = this.field7245;
         class544 var4;
         synchronized(this.field7245) {
            var4 = (class544)this.field7245.method1041((long)arg1, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field7261;
            byte[] var6;
            synchronized(this.field7261) {
               var6 = this.field7261.method460((byte)-11, class771.method5550((byte)-72, arg1), class162.method1526(-455717720, arg1));
            }

            class544 var7 = new class544();
            var7.field7747 = this;
            if (arg0 != 3917) {
               field7256 = -98;
            }

            var7.field7665 = arg1;
            var7.field7698 = (String[])this.field7270.clone();
            if (var6 != null) {
               var7.method4073(new class65(var6), 16384);
            }

            var7.method4069(-121);
            if (var7.field7670) {
               var7.field7720 = false;
               var7.field7731 = 0;
            }

            if (!this.field7254 && var7.field7708) {
               var7.field7722 = null;
               var7.field7698 = null;
            }

            class107 var8 = this.field7245;
            synchronized(this.field7245) {
               this.field7245.method1050(-78, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field7271[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3851(int arg0, int arg1) {
      try {
         ++field7253;
         this.field7245 = new class107(arg0);
         if (arg1 != -9431) {
            this.field7268 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7271[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(BLsa;)V"
   )
   public static final void method3852(byte arg0, class39 arg1) {
      try {
         class313.field4704 = arg1.method443(field7271[11], 16);
         if (arg0 < -68) {
            ++field7262;
            class622.field8893 = arg1.method443(field7271[13], 16);
            class502.field7166 = arg1.method443(field7271[10], 16);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7271[12] + arg0 + ',' + (arg1 != null ? field7271[9] : field7271[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method3853(boolean arg0, byte arg1) {
      try {
         ++field7264;
         if (this.field7254 != arg0) {
            if (arg1 <= 81) {
               this.method3853(false, (byte)-10);
            }

            this.field7254 = arg0;
            this.method3849(-62);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7271[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3854(boolean arg0) {
      try {
         ++field7249;
         class107 var2 = this.field7245;
         synchronized(this.field7245) {
            this.field7245.method1045(3);
         }

         if (arg0) {
            class107 var3 = this.field7266;
            synchronized(this.field7266) {
               this.field7266.method1045(3);
            }

            class107 var4 = this.field7267;
            synchronized(this.field7267) {
               this.field7267.method1045(3);
            }

            class107 var5 = this.field7268;
            synchronized(this.field7268) {
               this.field7268.method1045(3);
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field7271[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3855(int arg0) {
      try {
         field7258 = null;
         if (arg0 != 30204) {
            field7256 = -75;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7271[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "<init>",
      descriptor = "(Ltb;IZLsa;Lsa;)V"
   )
   public class511(class392 arg0, int arg1, boolean arg2, class39 arg3, class39 arg4) {
      try {
         this.field7263 = arg1;
         this.field7251 = arg4;
         this.field7261 = arg3;
         this.field7254 = arg2;
         this.field7265 = arg0;
         if (this.field7261 != null) {
            int var6 = -1 + this.field7261.method454(100);
            this.field7261.method434((byte)-106, var6);
         }

         if (class648.field9162 == this.field7265) {
            this.field7270 = new String[]{null, null, null, null, null, class765.field10925.method5512(-2, this.field7263)};
         } else {
            this.field7270 = new String[]{null, null, null, null, null, null};
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7271[8] + (arg0 != null ? field7271[9] : field7271[7]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7271[9] : field7271[7]) + ',' + (arg4 != null ? field7271[9] : field7271[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3856(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3857(char[] arg0) {
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
            var10005 = 13;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
