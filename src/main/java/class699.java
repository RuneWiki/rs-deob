import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class699 {
   @OriginalMember(
      owner = "client!vfa",
      name = "l",
      descriptor = "Z"
   )
   public boolean field10491 = false;
   @OriginalMember(
      owner = "client!vfa",
      name = "m",
      descriptor = "Ldw;"
   )
   private class748 field10485 = new class748(64);
   @OriginalMember(
      owner = "client!vfa",
      name = "s",
      descriptor = "Ldw;"
   )
   public class748 field10497 = new class748(500);
   @OriginalMember(
      owner = "client!vfa",
      name = "e",
      descriptor = "Ldw;"
   )
   public class748 field10498 = new class748(30);
   @OriginalMember(
      owner = "client!vfa",
      name = "c",
      descriptor = "Ldw;"
   )
   public class748 field10499 = new class748(50);
   @OriginalMember(
      owner = "client!vfa",
      name = "h",
      descriptor = "Leaa;"
   )
   private class526 field10483;
   @OriginalMember(
      owner = "client!vfa",
      name = "n",
      descriptor = "Leaa;"
   )
   public class526 field10481;
   @OriginalMember(
      owner = "client!vfa",
      name = "i",
      descriptor = "Z"
   )
   public boolean field10484;
   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10501 = new String[]{method5078(method5077("\u000e\r2\u000b_P")), method5078(method5077("\u0016\u001e?I")), method5078(method5077("\u000e\r2\u000b)\u0011\u0005:Q+P")), method5078(method5077("\u0003E}\u000bh")), method5078(method5077("\u000e\r2\u000b\\P")), method5078(method5077("\u000e\r2\u000bRP")), method5078(method5077("\u000e\r2\u000bPP")), method5078(method5077("\u000e\r2\u000b]P")), method5078(method5077("\u000e\r2\u000bVP")), method5078(method5077("\u000e\r2\u000bQP")), method5078(method5077("\u000e\r2\u000bSP")), method5078(method5077("\u000e\r2\u000bTP")), method5078(method5077("\u000e\r2\u000bWP"))};
   @OriginalMember(
      owner = "client!vfa",
      name = "p",
      descriptor = "Lsda;"
   )
   public static class269 field10488 = new class269(82, 2);
   @OriginalMember(
      owner = "client!vfa",
      name = "u",
      descriptor = "Lum;"
   )
   public static class550 field10495 = new class550();
   @OriginalMember(
      owner = "client!vfa",
      name = "t",
      descriptor = "Lsd;"
   )
   public static class101 field10496 = new class101(82, 20);
   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "I"
   )
   public static int field10480;
   @OriginalMember(
      owner = "client!vfa",
      name = "k",
      descriptor = "I"
   )
   public static int field10482;
   @OriginalMember(
      owner = "client!vfa",
      name = "o",
      descriptor = "I"
   )
   public static int field10486;
   @OriginalMember(
      owner = "client!vfa",
      name = "q",
      descriptor = "I"
   )
   public static int field10487;
   @OriginalMember(
      owner = "client!vfa",
      name = "j",
      descriptor = "I"
   )
   public static int field10489;
   @OriginalMember(
      owner = "client!vfa",
      name = "b",
      descriptor = "I"
   )
   public static int field10490;
   @OriginalMember(
      owner = "client!vfa",
      name = "r",
      descriptor = "I"
   )
   public static int field10492;
   @OriginalMember(
      owner = "client!vfa",
      name = "g",
      descriptor = "I"
   )
   public static int field10493;
   @OriginalMember(
      owner = "client!vfa",
      name = "d",
      descriptor = "I"
   )
   public static int field10494;
   @OriginalMember(
      owner = "client!vfa",
      name = "f",
      descriptor = "I"
   )
   public int field10500;

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5067(byte arg0) {
      try {
         field10495 = null;
         field10488 = null;
         field10496 = null;
         if (arg0 <= 111) {
            field10495 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10501[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "c",
      descriptor = "(IZ)V"
   )
   public final void method5068(int arg0, boolean arg1) {
      try {
         ++field10489;
         if (arg0 < 83) {
            this.method5071(123);
         }

         if (!arg1 == this.field10491) {
            this.field10491 = arg1;
            this.method5073(2);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10501[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5069(int param0, int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5070(int arg0, int arg1) {
      try {
         ++field10494;
         class748 var3 = this.field10485;
         synchronized(this.field10485) {
            this.field10485.method5453(arg0, false);
         }

         class748 var4 = this.field10497;
         synchronized(this.field10497) {
            this.field10497.method5453(arg0, false);
         }

         class748 var5 = this.field10498;
         synchronized(this.field10498) {
            if (arg1 < 17) {
               this.field10497 = null;
            }

            this.field10498.method5453(arg0, false);
         }

         class748 var6 = this.field10499;
         synchronized(this.field10499) {
            this.field10499.method5453(arg0, false);
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field10501[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5071(int arg0) {
      try {
         class748 var2 = this.field10485;
         synchronized(this.field10485) {
            this.field10485.method5445(697465426);
         }

         ++field10493;
         class748 var3 = this.field10497;
         synchronized(this.field10497) {
            this.field10497.method5445(697465426);
         }

         class748 var4 = this.field10498;
         synchronized(this.field10498) {
            this.field10498.method5445(697465426);
         }

         class748 var5 = this.field10499;
         synchronized(this.field10499) {
            this.field10499.method5445(697465426);
         }

         if (arg0 > -103) {
            method5067((byte)3);
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field10501[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "b",
      descriptor = "(II)Lde;"
   )
   public final class557 method5072(int arg0, int arg1) {
      try {
         ++field10487;
         class748 var3 = this.field10485;
         class557 var4;
         synchronized(this.field10485) {
            var4 = (class557)this.field10485.method5454((long)arg1, arg0 + 18231);
         }

         if (arg0 != 30) {
            this.method5070(-7, 86);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field10483;
            byte[] var6;
            synchronized(this.field10483) {
               var6 = this.field10483.method3899(-60, class657.method4727((byte)-75, arg1), class82.method766(1894444328, arg1));
            }

            class557 var7 = new class557();
            var7.field8274 = arg1;
            var7.field8275 = this;
            if (var6 != null) {
               var7.method4127(true, new class128(var6));
            }

            var7.method4128(30365);
            if (!this.field10484 && var7.field8321) {
               var7.field8298 = null;
               var7.field8271 = null;
            }

            if (var7.field8308) {
               var7.field8304 = 0;
               var7.field8309 = false;
            }

            class748 var8 = this.field10485;
            synchronized(this.field10485) {
               this.field10485.method5455(-2049, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field10501[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5073(int arg0) {
      try {
         ++field10480;
         if (arg0 == 2) {
            class748 var2 = this.field10485;
            synchronized(this.field10485) {
               this.field10485.method5451(-123);
            }

            class748 var3 = this.field10497;
            synchronized(this.field10497) {
               this.field10497.method5451(-128);
            }

            class748 var4 = this.field10498;
            synchronized(this.field10498) {
               this.field10498.method5451(arg0 ^ 105);
            }

            class748 var5 = this.field10499;
            synchronized(this.field10499) {
               this.field10499.method5451(3);
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field10501[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method5074(int arg0, boolean arg1) {
      try {
         ++field10482;
         if (arg0 != 32368) {
            this.field10483 = null;
         }

         if (this.field10484 == !arg1) {
            this.field10484 = arg1;
            this.method5073(arg0 + -32366);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10501[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method5075(int arg0, byte arg1) {
      try {
         this.field10485 = new class748(arg0);
         if (arg1 != 78) {
            this.field10481 = null;
         }

         ++field10492;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10501[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method5076(int arg0, boolean arg1) {
      try {
         this.field10500 = arg0;
         ++field10490;
         class748 var3 = this.field10497;
         synchronized(this.field10497) {
            this.field10497.method5451(126);
         }

         class748 var4 = this.field10498;
         synchronized(this.field10498) {
            if (!arg1) {
               return;
            }

            this.field10498.method5451(-118);
         }

         class748 var5 = this.field10499;
         synchronized(this.field10499) {
            this.field10499.method5451(-120);
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field10501[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "<init>",
      descriptor = "(Lqo;IZLeaa;Leaa;)V"
   )
   public class699(class24 arg0, int arg1, boolean arg2, class526 arg3, class526 arg4) {
      try {
         this.field10483 = arg3;
         this.field10481 = arg4;
         this.field10484 = arg2;
         if (this.field10483 != null) {
            int var6 = -1 + this.field10483.method3903((byte)-55);
            this.field10483.method3875(0, var6);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10501[2] + (arg0 != null ? field10501[3] : field10501[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10501[3] : field10501[1]) + ',' + (arg4 != null ? field10501[3] : field10501[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5077(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5078(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
