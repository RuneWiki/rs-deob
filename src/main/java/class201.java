import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class201 {
   @OriginalMember(
      owner = "client!fja",
      name = "f",
      descriptor = "Lsia;"
   )
   private class407 field2556 = new class407(64);
   @OriginalMember(
      owner = "client!fja",
      name = "i",
      descriptor = "Lww;"
   )
   private class339 field2558;
   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2560 = new String[]{method1671(method1670("w:BBD9")), method1671(method1670("w:BBL9")), method1671(method1670("w:BBE9")), method1671(method1670("w:BBN9")), method1671(method1670("j~\rB{")), method1671(method1670("\u007f%O\u0000")), method1671(method1670("w:BB:x>J\u001889")), method1671(method1670("w:BB@9")), method1671(method1670("w:BBB9")), method1671(method1670("w:BBG9")), method1671(method1670("w:BBO9")), method1671(method1670("w:BBC9"))};
   @OriginalMember(
      owner = "client!fja",
      name = "k",
      descriptor = "J"
   )
   public static long field2546 = -1L;
   @OriginalMember(
      owner = "client!fja",
      name = "c",
      descriptor = "Loca;"
   )
   public static class642 field2554 = null;
   @OriginalMember(
      owner = "client!fja",
      name = "n",
      descriptor = "Lfea;"
   )
   public static class681 field2550 = new class681(11, 0, 1, 2);
   @OriginalMember(
      owner = "client!fja",
      name = "e",
      descriptor = "I"
   )
   public static int field2547;
   @OriginalMember(
      owner = "client!fja",
      name = "b",
      descriptor = "I"
   )
   public static int field2548;
   @OriginalMember(
      owner = "client!fja",
      name = "j",
      descriptor = "I"
   )
   public static int field2549;
   @OriginalMember(
      owner = "client!fja",
      name = "d",
      descriptor = "I"
   )
   public static int field2551;
   @OriginalMember(
      owner = "client!fja",
      name = "l",
      descriptor = "I"
   )
   public static int field2552;
   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "I"
   )
   public static int field2553;
   @OriginalMember(
      owner = "client!fja",
      name = "m",
      descriptor = "I"
   )
   public static int field2555;
   @OriginalMember(
      owner = "client!fja",
      name = "g",
      descriptor = "I"
   )
   public static int field2557;
   @OriginalMember(
      owner = "client!fja",
      name = "h",
      descriptor = "I"
   )
   public static int field2559;

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method1660(int arg0, byte arg1) {
      try {
         ++field2559;
         class407 var3 = this.field2556;
         synchronized(this.field2556) {
            this.field2556.method3197(5, arg0);
            if (arg1 <= 118) {
               this.method1662(34, 23);
            }

         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2560[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public static final void method1661(int arg0, boolean arg1, boolean arg2) {
      try {
         ++field2549;
         if (arg1) {
            --class527.field7368;
            if (~class527.field7368 == -1) {
               class193.field2445 = null;
            }
         }

         if (arg2) {
            --class206.field2627;
            if (class206.field2627 == 0) {
               class535.field7840 = null;
            }
         }

         if (arg0 != 20251) {
            method1664(35);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2560[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "b",
      descriptor = "(II)Liv;"
   )
   public final class637 method1662(int arg0, int arg1) {
      try {
         if (arg0 != -1) {
            return null;
         } else {
            ++field2553;
            class407 var3 = this.field2556;
            class637 var4;
            synchronized(this.field2556) {
               var4 = (class637)this.field2556.method3192((long)arg1, (byte)-120);
            }

            if (var4 != null) {
               return var4;
            } else {
               class339 var5 = this.field2558;
               byte[] var6;
               synchronized(this.field2558) {
                  var6 = this.field2558.method2697(class407.method3194((byte)-107, arg1), class239.method1908(0, arg1), false);
               }

               class637 var7 = new class637();
               if (var6 != null) {
                  var7.method4701(arg0 + 1, new class66(var6));
               }

               class407 var8 = this.field2556;
               synchronized(this.field2556) {
                  this.field2556.method3190(var7, (long)arg1, 8);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field2560[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method1663(byte arg0, int arg1) {
      try {
         ++field2547;
         if (arg0 != 35) {
            field2554 = null;
         }

         class407 var3 = this.field2556;
         synchronized(this.field2556) {
            this.field2556.method3201((byte)-76);
            this.field2556 = new class407(arg1);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2560[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1664(int arg0) {
      try {
         ++field2552;
         if (~class757.field11093.field10978.method2092(-18033) == -1 && class674.field9984 != class600.field8858) {
            class637.method4698(-120, class703.field10273, false, class751.field10959, 12);
         } else {
            int var1 = -62 / ((arg0 - 7) / 36);
            class52.method384(-28354, class629.field9294);
            if (~class714.field10500 != ~class674.field9984) {
               class6.method50((byte)-99);
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2560[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1665(byte arg0) {
      try {
         field2554 = null;
         if (arg0 > -98) {
            method1661(85, false, false);
         }

         field2550 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2560[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method1666(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field2548;
            return (540800 & arg2) != 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2560[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1667(int arg0) {
      try {
         class407 var2 = this.field2556;
         synchronized(this.field2556) {
            if (arg0 != -1) {
               field2550 = null;
            }

            this.field2556.method3201((byte)-51);
         }

         ++field2555;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2560[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1668(byte arg0) {
      try {
         ++field2557;
         class407 var2 = this.field2556;
         synchronized(this.field2556) {
            this.field2556.method3187(-23825);
            if (arg0 != -13) {
               this.method1662(-16, 122);
            }

         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2560[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1669(int arg0, int arg1) {
      return class47.field600 != null ? class47.field600[arg0][arg1] & 65535 : 0;
   }

   @OriginalMember(
      owner = "client!fja",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class201(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field2558 = arg2;
         if (this.field2558 != null) {
            int var4 = this.field2558.method2703((byte)126) + -1;
            this.field2558.method2691(var4, -59);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2560[6] + (arg0 != null ? field2560[4] : field2560[5]) + ',' + arg1 + ',' + (arg2 != null ? field2560[4] : field2560[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1670(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1671(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
