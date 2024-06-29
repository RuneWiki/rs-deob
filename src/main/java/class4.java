import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class322 {
   @OriginalMember(
      owner = "client!ft",
      name = "v",
      descriptor = "I"
   )
   private int field37;
   @OriginalMember(
      owner = "client!ft",
      name = "t",
      descriptor = "I"
   )
   private int field27;
   @OriginalMember(
      owner = "client!ft",
      name = "y",
      descriptor = "I"
   )
   private int field30;
   @OriginalMember(
      owner = "client!ft",
      name = "s",
      descriptor = "I"
   )
   private int field33;
   @OriginalMember(
      owner = "client!ft",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field39 = new String[]{method23(method22("S\n\u001ca\u0002")), method23(method22("S\n\u001co\u0002")), method23(method22("S\n\u001ch\u0002")), method23(method22("S\n\u001c`\u0002")), method23(method22("S\n\u001cn\u0002")), method23(method22("S\n\u001c\u0015C[\u0017F\u0017\u0002"))};
   @OriginalMember(
      owner = "client!ft",
      name = "A",
      descriptor = "Lek;"
   )
   public static class536 field34 = new class536(44, -1);
   @OriginalMember(
      owner = "client!ft",
      name = "o",
      descriptor = "I"
   )
   public static int field38 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "p",
      descriptor = "I"
   )
   private int field23;
   @OriginalMember(
      owner = "client!ft",
      name = "C",
      descriptor = "I"
   )
   private int field24;
   @OriginalMember(
      owner = "client!ft",
      name = "q",
      descriptor = "I"
   )
   private int field25;
   @OriginalMember(
      owner = "client!ft",
      name = "n",
      descriptor = "I"
   )
   private int field26;
   @OriginalMember(
      owner = "client!ft",
      name = "r",
      descriptor = "I"
   )
   public static int field28;
   @OriginalMember(
      owner = "client!ft",
      name = "u",
      descriptor = "I"
   )
   public static int field31;
   @OriginalMember(
      owner = "client!ft",
      name = "B",
      descriptor = "I"
   )
   public static int field32;
   @OriginalMember(
      owner = "client!ft",
      name = "w",
      descriptor = "I"
   )
   public static int field35;
   @OriginalMember(
      owner = "client!ft",
      name = "x",
      descriptor = "I"
   )
   public static int field36;
   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "[B"
   )
   private byte[] field29;

   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method17(int arg0) {
      try {
         this.field26 >>= 4;
         this.field33 = this.field30;
         ++field28;
         if (arg0 > -68) {
            this.method19(-28);
         }

         label22: {
            if (~this.field26 > -1) {
               this.field26 = 0;
               if (!client.field4360) {
                  break label22;
               }
            }

            if (this.field26 > 255) {
               this.field26 = 255;
            }
         }

         this.method18(this.field23++, (byte)this.field26, (byte)-75);
         this.field26 = 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field39[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(IBB)V"
   )
   public void method18(int arg0, byte arg1, byte arg2) {
      try {
         this.field29[arg0] = arg1;
         if (arg2 >= -56) {
            this.field27 = 13;
         }

         ++field35;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field39[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method19(int arg0) {
      try {
         this.field26 = 0;
         this.field23 = arg0;
         ++field32;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field39[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method20(byte arg0) {
      try {
         field34 = null;
         if (arg0 != -31) {
            field34 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field39[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(IZI)V"
   )
   public final void method21(int arg0, boolean arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label50: {
            ++field36;
            if (arg2 == 0) {
               this.field24 = -(arg0 < 0 ? -arg0 : arg0) + this.field27;
               this.field24 = this.field24 * this.field24 >> 12;
               this.field25 = 4096;
               this.field26 = this.field24;
               if (!var4) {
                  break label50;
               }
            }

            label39: {
               this.field25 = this.field37 * this.field24 >> 12;
               if (this.field25 >= 0) {
                  if (this.field25 <= 4096) {
                     break label39;
                  }

                  this.field25 = 4096;
                  if (!var4) {
                     break label39;
                  }
               }

               this.field25 = 0;
            }

            this.field24 = this.field27 - (arg0 >= 0 ? arg0 : -arg0);
            this.field24 = this.field24 * this.field24 >> 12;
            this.field24 = this.field25 * this.field24 >> 12;
            this.field26 += this.field33 * this.field24 >> 12;
            this.field33 = this.field33 * this.field30 >> 12;
         }

         if (arg1) {
            method20((byte)84);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field39[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "<init>",
      descriptor = "(IIIIIFFF)V"
   )
   public class4(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field37 = (int)(arg7 * 4096.0F);
         this.field27 = (int)(arg6 * 4096.0F);
         this.field33 = this.field30 = (int)(Math.pow(0.5D, (double)(-arg5)) * 4096.0D);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field39[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method22(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method23(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
