import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class38 extends class70 {
   @OriginalMember(
      owner = "client!ju",
      name = "O",
      descriptor = "I"
   )
   private int field460 = 3216;
   @OriginalMember(
      owner = "client!ju",
      name = "P",
      descriptor = "I"
   )
   private int field457 = 4096;
   @OriginalMember(
      owner = "client!ju",
      name = "L",
      descriptor = "I"
   )
   private int field464 = 3216;
   @OriginalMember(
      owner = "client!ju",
      name = "Q",
      descriptor = "[I"
   )
   private int[] field466 = new int[3];
   @OriginalMember(
      owner = "client!ju",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field467 = new String[]{method277(method276("\"\u001fH|Q")), method277(method276("&\u001f\nU")), method277(method276("3DH\u0017\u0004")), method277(method276("\"\u001fHxQ")), method277(method276("\"\u001fH{Q")), method277(method276("\"\u001fHqQ")), method277(method276("\"\u001fHzQ")), method277(method276("\"\u001fH}Q"))};
   @OriginalMember(
      owner = "client!ju",
      name = "M",
      descriptor = "I"
   )
   public static int field458 = 0;
   @OriginalMember(
      owner = "client!ju",
      name = "F",
      descriptor = "I"
   )
   public static int field456;
   @OriginalMember(
      owner = "client!ju",
      name = "I",
      descriptor = "I"
   )
   public static int field459;
   @OriginalMember(
      owner = "client!ju",
      name = "N",
      descriptor = "I"
   )
   public static int field461;
   @OriginalMember(
      owner = "client!ju",
      name = "G",
      descriptor = "I"
   )
   public static int field462;
   @OriginalMember(
      owner = "client!ju",
      name = "J",
      descriptor = "I"
   )
   public static int field463;
   @OriginalMember(
      owner = "client!ju",
      name = "K",
      descriptor = "I"
   )
   public static int field465;

   @OriginalMember(
      owner = "client!ju",
      name = "g",
      descriptor = "(I)V",
      line = 4
   )
   private final void method271(int arg0) {
      try {
         ++field462;
         double var2 = Math.cos((double)((float)this.field460 / 4096.0F));
         this.field466[0] = (int)(4096.0D * var2 * Math.sin((double)((float)this.field464 / 4096.0F)));
         this.field466[1] = (int)(4096.0D * var2 * Math.cos((double)((float)this.field464 / 4096.0F)));
         this.field466[2] = (int)(Math.sin((double)((float)this.field460 / 4096.0F)) * 4096.0D);
         int var4 = this.field466[0] * this.field466[0] >> 12;
         int var5 = this.field466[1] * this.field466[1] >> 12;
         int var6 = this.field466[2] * this.field466[2] >> 12;
         int var7 = 0 / ((arg0 - -28) / 44);
         int var8 = (int)(Math.sqrt((double)(var4 + var5 + var6 >> 12)) * 4096.0D);
         if (var8 != 0) {
            this.field466[0] = (this.field466[0] << 12) / var8;
            this.field466[1] = (this.field466[1] << 12) / var8;
            this.field466[2] = (this.field466[2] << 12) / var8;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field467[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(Lfq;III)V",
      line = 34
   )
   public static final void method272(class374 arg0, int arg1, int arg2, int arg3) {
      try {
         class493.field7449 = arg2;
         if (arg3 != 1) {
            field458 = -5;
         }

         class501.field7667 = arg1;
         ++field463;
         class723.field10824 = arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field467[3] + (arg0 != null ? field467[2] : field467[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(Lrr;ILd;)V",
      line = 50
   )
   public static final void method273(class678 arg0, int arg1, class150 arg2) {
      try {
         ++field459;
         class11.field147 = arg0;
         if (arg1 != 44795308) {
            field458 = -19;
         }

         class437.field6698 = arg2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field467[7] + (arg0 != null ? field467[2] : field467[1]) + ',' + arg1 + ',' + (arg2 != null ? field467[2] : field467[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(IILica;)V",
      line = 62
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         if (arg0 == -1) {
            ++field456;
            if (arg1 != 0) {
               if (arg1 == 1) {
                  this.field464 = arg2.method2848(-107);
                  return;
               }

               if (~arg1 != -3) {
                  return;
               }

               if (!client.field1786) {
                  this.field460 = arg2.method2848(arg0 ^ 121);
                  return;
               }
            }

            this.field457 = arg2.method2848(-106);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field467[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field467[2] : field467[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "<init>",
      descriptor = "()V",
      line = 107
   )
   public class38() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(Z)V",
      line = 111
   )
   public final void method275(boolean arg0) {
      try {
         ++field461;
         this.method271(-109);
         if (arg0) {
            method272((class374)null, 39, -12, 1);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field467[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(BI)[I",
      line = 129
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field465;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (arg0 != 87) {
            this.method275(false);
         }

         if (super.field923.field7284) {
            int var5 = class354.field5405 * this.field457 >> 12;
            int[] var6 = this.method545(0, arg1 + -1 & class578.field8547, (byte)-67);
            int[] var7 = this.method545(0, arg1, (byte)-109);
            int[] var8 = this.method545(0, class578.field8547 & arg1 + 1, (byte)-112);
            int var9 = 0;
            if (var3 || var9 < class678.field10127) {
               do {
                  int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                  int var11 = (var7[var9 + -1 & class50.field637] + -var7[class50.field637 & var9 + 1]) * var5 >> 12;
                  int var12 = var11 >> 4;
                  int var13 = var10 >> 4;
                  if (var12 < 0) {
                     var12 = -var12;
                  }

                  if (var13 < 0) {
                     var13 = -var13;
                  }

                  if (~var12 < -256) {
                     var12 = 255;
                  }

                  if (var13 > 255) {
                     var13 = 255;
                  }

                  int var14 = 255 & class277.field4416[var12 - -((var13 + 1) * var13 >> 1)];
                  int var15 = var14 * 4096 >> 8;
                  int var16 = var10 * var14 >> 8;
                  int var17 = var11 * var14 >> 8;
                  int var18 = this.field466[2] * var15 >> 12;
                  int var19 = this.field466[0] * var17 >> 12;
                  int var20 = this.field466[1] * var16 >> 12;
                  var4[var9] = var19 - -var20 + var18;
                  ++var9;
               } while(var9 < class678.field10127);
            }
         }

         return var4;
      } catch (RuntimeException var22) {
         throw class482.method3757(var22, field467[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method276(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method277(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
