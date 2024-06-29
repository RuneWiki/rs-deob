import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class257 {
   @OriginalMember(
      owner = "client!dea",
      name = "j",
      descriptor = "Lgw;"
   )
   private class179 field3643 = new class179(64);
   @OriginalMember(
      owner = "client!dea",
      name = "p",
      descriptor = "Lgw;"
   )
   public class179 field3653 = new class179(50);
   @OriginalMember(
      owner = "client!dea",
      name = "i",
      descriptor = "Lgw;"
   )
   public class179 field3654 = new class179(5);
   @OriginalMember(
      owner = "client!dea",
      name = "g",
      descriptor = "Lhw;"
   )
   private class141 field3650;
   @OriginalMember(
      owner = "client!dea",
      name = "c",
      descriptor = "Z"
   )
   public boolean field3640;
   @OriginalMember(
      owner = "client!dea",
      name = "q",
      descriptor = "Lhw;"
   )
   public class141 field3648;
   @OriginalMember(
      owner = "client!dea",
      name = "d",
      descriptor = "Lca;"
   )
   public class320 field3641;
   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3656 = new String[]{method2067(method2066("G%\u0002\u0001r\u000b")), method2067(method2066("M5\u000fC")), method2067(method2066("XnM\u0001I")), method2067(method2066("G%\u0002\u0001\bJ.\n[\n\u000b")), method2067(method2066("G%\u0002\u0001q\u000b")), method2067(method2066("G%\u0002\u0001|\u000b")), method2067(method2066("G%\u0002\u0001w\u000b")), method2067(method2066("G%\u0002\u0001s\u000b")), method2067(method2066("G%\u0002\u0001v\u000b")), method2067(method2066("G%\u0002\u0001p\u000b")), method2067(method2066("G%\u0002\u0001}\u000b")), method2067(method2066("G%\u0002\u0001u\u000b")), method2067(method2066("G%\u0002\u0001~\u000b"))};
   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "I"
   )
   public static int field3638;
   @OriginalMember(
      owner = "client!dea",
      name = "e",
      descriptor = "I"
   )
   public static int field3639;
   @OriginalMember(
      owner = "client!dea",
      name = "m",
      descriptor = "I"
   )
   public static int field3642;
   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "I"
   )
   public static int field3644;
   @OriginalMember(
      owner = "client!dea",
      name = "k",
      descriptor = "I"
   )
   public static int field3645;
   @OriginalMember(
      owner = "client!dea",
      name = "l",
      descriptor = "I"
   )
   public static int field3646;
   @OriginalMember(
      owner = "client!dea",
      name = "n",
      descriptor = "I"
   )
   public static int field3647;
   @OriginalMember(
      owner = "client!dea",
      name = "f",
      descriptor = "I"
   )
   public static int field3649;
   @OriginalMember(
      owner = "client!dea",
      name = "h",
      descriptor = "I"
   )
   public static int field3651;
   @OriginalMember(
      owner = "client!dea",
      name = "r",
      descriptor = "I"
   )
   public static int field3652;
   @OriginalMember(
      owner = "client!dea",
      name = "o",
      descriptor = "I"
   )
   public int field3655;

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(II[Ljava/awt/Rectangle;)V"
   )
   public static final void method2056(int arg0, int arg1, Rectangle[] arg2) throws class328 {
      try {
         if (arg1 == 31161) {
            label26: {
               if (~class402.field5939 != -2) {
                  class393.field5787.method381(arg2, arg0, 0, 0);
                  if (!client.field4564) {
                     break label26;
                  }
               }

               class393.field5787.method381(arg2, arg0, class601.field8673, class490.field7149);
            }

            ++field3646;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3656[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3656[2] : field3656[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(Z)I"
   )
   public static final int method2057(boolean arg0) {
      try {
         ++field3647;
         if (class589.field8507 != null) {
            return 3;
         } else if (arg0) {
            return 68;
         } else {
            return !class677.field9929 ? 1 : 2;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3656[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2058(byte arg0) {
      boolean var1 = client.field4564;

      try {
         if (arg0 == -112) {
            label44: {
               if (class376.field5588 == 9) {
                  class645.method4735(5, arg0);
                  if (!var1) {
                     break label44;
                  }
               }

               if (class376.field5588 == 5 || class376.field5588 == 6) {
                  class645.method4735(3, -100);
                  if (!var1) {
                     break label44;
                  }
               }

               if (class376.field5588 == 12) {
                  class645.method4735(3, -113);
               }
            }

            ++field3639;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3656[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method2059(int arg0, boolean arg1) {
      try {
         this.field3655 = arg0;
         ++field3649;
         class179 var3 = this.field3653;
         synchronized(this.field3653) {
            this.field3653.method1589((byte)96);
         }

         class179 var4 = this.field3654;
         synchronized(this.field3654) {
            this.field3654.method1589((byte)63);
            if (arg1) {
               this.method2059(122, true);
            }

         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3656[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(BI)Lvl;"
   )
   public final class15 method2060(byte arg0, int arg1) {
      try {
         ++field3638;
         class179 var3 = this.field3643;
         class15 var4;
         synchronized(this.field3643) {
            var4 = (class15)this.field3643.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field3650;
            byte[] var6;
            synchronized(this.field3650) {
               var6 = this.field3650.method1347((byte)123, class251.method2033(arg1, -126), class688.method5007((byte)96, arg1));
            }

            class15 var7 = new class15();
            var7.field256 = arg1;
            var7.field240 = this;
            if (var6 != null) {
               var7.method112((byte)11, new class473(var6));
            }

            var7.method106(3373);
            class179 var8 = this.field3643;
            synchronized(this.field3643) {
               this.field3643.method1581((long)arg1, 0, var7);
            }

            if (arg0 > -32) {
               method2058((byte)50);
            }

            return var7;
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field3656[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2061(int arg0) {
      try {
         ++field3652;
         class179 var2 = this.field3643;
         synchronized(this.field3643) {
            this.field3643.method1591((byte)58);
         }

         class179 var3 = this.field3653;
         synchronized(this.field3653) {
            this.field3653.method1591((byte)58);
            if (arg0 != 1) {
               this.method2062(-93, -99);
            }
         }

         class179 var4 = this.field3654;
         synchronized(this.field3654) {
            this.field3654.method1591((byte)58);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3656[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2062(int arg0, int arg1) {
      try {
         ++field3644;
         class179 var3 = this.field3643;
         synchronized(this.field3643) {
            this.field3643.method1579(-38, arg0);
         }

         class179 var4 = this.field3653;
         synchronized(this.field3653) {
            this.field3653.method1579(-11, arg0);
         }

         if (arg1 == 3) {
            class179 var5 = this.field3654;
            synchronized(this.field3654) {
               this.field3654.method1579(114, arg0);
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field3656[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2063(int arg0) {
      try {
         class179 var2 = this.field3653;
         synchronized(this.field3653) {
            this.field3653.method1589((byte)79);
         }

         ++field3645;
         class179 var3 = this.field3654;
         synchronized(this.field3654) {
            this.field3654.method1589((byte)85);
            int var4 = 60 % ((arg0 - -53) / 32);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3656[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2064(int arg0) {
      try {
         ++field3651;
         class179 var2 = this.field3643;
         synchronized(this.field3643) {
            this.field3643.method1589((byte)94);
         }

         class179 var3 = this.field3653;
         synchronized(this.field3653) {
            this.field3653.method1589((byte)127);
         }

         class179 var4 = this.field3654;
         synchronized(this.field3654) {
            this.field3654.method1589((byte)54);
            if (arg0 != 12) {
               this.method2060((byte)-41, -46);
            }

         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3656[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method2065(boolean arg0, byte arg1) {
      try {
         ++field3642;
         if (!this.field3640 == arg0) {
            this.field3640 = arg0;
            if (arg1 == 18) {
               this.method2064(arg1 ^ 30);
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3656[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "<init>",
      descriptor = "(Lca;IZLhw;Lhw;)V"
   )
   public class257(class320 arg0, int arg1, boolean arg2, class141 arg3, class141 arg4) {
      try {
         this.field3650 = arg3;
         this.field3640 = arg2;
         this.field3648 = arg4;
         this.field3641 = arg0;
         if (this.field3650 != null) {
            int var6 = this.field3650.method1337((byte)121) + -1;
            this.field3650.method1346(var6, 0);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3656[3] + (arg0 != null ? field3656[2] : field3656[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3656[2] : field3656[1]) + ',' + (arg4 != null ? field3656[2] : field3656[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2066(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2067(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
