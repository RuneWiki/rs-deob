import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class792 extends class422 {
   @OriginalMember(
      owner = "client!dfa",
      name = "B",
      descriptor = "[I"
   )
   private int[] field11586;
   @OriginalMember(
      owner = "client!dfa",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11595 = new String[]{method5720(method5719("X#\u00079A\u0014")), method5720(method5719("U#W")), method5720(method5719("X#\u00079D\u0014")), method5720(method5719("X#\u00079C\u0014")), method5720(method5719("X#\u00079@\u0014")), method5720(method5719("X#\u000799U+\u000fc;\u0014")), method5720(method5719("X#\u00079F\u0014")), method5720(method5719("X#\u00079G\u0014"))};
   @OriginalMember(
      owner = "client!dfa",
      name = "F",
      descriptor = "[S"
   )
   public static short[] field11593 = new short[256];
   @OriginalMember(
      owner = "client!dfa",
      name = "x",
      descriptor = "[B"
   )
   public static byte[] field11587;
   @OriginalMember(
      owner = "client!dfa",
      name = "y",
      descriptor = "I"
   )
   public static int field11582;
   @OriginalMember(
      owner = "client!dfa",
      name = "u",
      descriptor = "I"
   )
   public static int field11583;
   @OriginalMember(
      owner = "client!dfa",
      name = "v",
      descriptor = "I"
   )
   public static int field11584;
   @OriginalMember(
      owner = "client!dfa",
      name = "A",
      descriptor = "I"
   )
   public static int field11585;
   @OriginalMember(
      owner = "client!dfa",
      name = "w",
      descriptor = "I"
   )
   private int field11588;
   @OriginalMember(
      owner = "client!dfa",
      name = "t",
      descriptor = "I"
   )
   private int field11589;
   @OriginalMember(
      owner = "client!dfa",
      name = "G",
      descriptor = "I"
   )
   public static int field11590;
   @OriginalMember(
      owner = "client!dfa",
      name = "E",
      descriptor = "I"
   )
   public static int field11592;
   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "I"
   )
   public static int field11594;
   @OriginalMember(
      owner = "client!dfa",
      name = "D",
      descriptor = "[B"
   )
   private byte[] field11591;

   @OriginalMember(
      owner = "client!dfa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3277(int arg0) {
      try {
         if (arg0 == -1136577940) {
            ++field11585;
            this.field11589 = 0;
            this.field11588 = 0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11595[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method5717(byte arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         if (arg0 > -31) {
            field11587 = null;
         }

         ++field11584;
         if (class316.field4369[arg1]) {
            return true;
         } else if (!class168.field2196.method2695(255, arg1)) {
            return false;
         } else {
            int var3 = class168.field2196.method2691(arg1, 116);
            if (~var3 == -1) {
               class316.field4369[arg1] = true;
               return true;
            } else {
               if (class419.field5722[arg1] == null) {
                  class419.field5722[arg1] = new class642[var3];
               }

               int var4 = 0;
               byte[] var5;
               class642 var6;
               if (var2) {
                  if (class419.field5722[arg1][var4] == null) {
                     var5 = class168.field2196.method2697(var4, arg1, false);
                     if (var5 != null) {
                        var6 = class419.field5722[arg1][var4] = new class642();
                        var6.field9482 = (arg1 << 16) + var4;
                        if (var5[0] != -1) {
                           throw new IllegalStateException(field11595[1]);
                        }

                        var6.method4729(new class66(var5), 11461);
                     }
                  }

                  ++var4;
               }

               while(true) {
                  while(var4 < var3) {
                     if (class419.field5722[arg1][var4] == null) {
                        var5 = class168.field2196.method2697(var4, arg1, false);
                        if (var5 != null) {
                           var6 = class419.field5722[arg1][var4] = new class642();
                           var6.field9482 = (arg1 << 16) + var4;
                           if (var5[0] != -1) {
                              throw new IllegalStateException(field11595[1]);
                           }

                           var6.method4729(new class66(var5), 11461);
                        }
                     }

                     ++var4;
                  }

                  class316.field4369[arg1] = true;
                  if (!var2) {
                     return true;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field11595[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3275(int arg0) {
      try {
         ++field11594;
         this.field11588 = Math.abs(this.field11588);
         if (~this.field11588 <= -4097) {
            this.field11588 = 4095;
         }

         this.method3298((byte)(this.field11588 >> 4), arg0 ^ -20576, this.field11589++);
         this.field11588 = 0;
         if (arg0 != 19733) {
            this.method3277(55);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11595[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class792(int param1, int param2, int param3, int param4, int param5, float param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(BII)V"
   )
   public void method3298(byte arg0, int arg1, int arg2) {
      try {
         if (arg1 != -7499) {
            this.method3298((byte)89, -35, 119);
         }

         ++field11583;
         this.field11591[this.field11589++] = (byte)(127 + class109.method974(arg0 >> 1, 127));
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11595[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method3278(int arg0, int arg1, int arg2) {
      try {
         ++field11582;
         this.field11588 += this.field11586[arg2] * arg0 >> 12;
         if (arg1 != 8302) {
            this.method3278(-103, -123, 118);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11595[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method5718(int arg0) {
      try {
         field11593 = null;
         field11587 = null;
         if (arg0 != -12506) {
            field11592 = -125;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11595[0] + arg0 + ')');
      }
   }

   static {
      int var0 = 0;
      field11587 = new byte[32896];

      for(int var1 = 0; ~var1 > -257; ++var1) {
         for(int var2 = 0; ~var2 >= ~var1; ++var2) {
            field11587[var0++] = (byte)((int)(255.0D / Math.sqrt((double)((float)(var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
         }
      }

   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5719(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5720(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
