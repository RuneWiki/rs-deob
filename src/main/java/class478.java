import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class478 {
   @OriginalMember(
      owner = "client!jt",
      name = "n",
      descriptor = "I"
   )
   private int field7277 = 0;
   @OriginalMember(
      owner = "client!jt",
      name = "c",
      descriptor = "I"
   )
   private int field7281 = -1;
   @OriginalMember(
      owner = "client!jt",
      name = "k",
      descriptor = "Lsn;"
   )
   private class675 field7276 = new class675();
   @OriginalMember(
      owner = "client!jt",
      name = "j",
      descriptor = "Z"
   )
   public boolean field7284 = false;
   @OriginalMember(
      owner = "client!jt",
      name = "f",
      descriptor = "I"
   )
   private int field7278;
   @OriginalMember(
      owner = "client!jt",
      name = "i",
      descriptor = "I"
   )
   private int field7271;
   @OriginalMember(
      owner = "client!jt",
      name = "b",
      descriptor = "[[I"
   )
   private int[][] field7279;
   @OriginalMember(
      owner = "client!jt",
      name = "l",
      descriptor = "[Lnm;"
   )
   private class480[] field7283;
   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7285 = new String[]{method3724(method3723("3\u0015<\u0013\f\u001e\u0018+\u0013\u0011\u0015\u0000 Z\u0006\u0006\u0011rRC\u0016\u0001>_C\u0019\u00193T\u0006P\u00173P\u000b\u0015")), method3724(method3723("\u001a\u0000|pK")), method3724(method3723("\u001a\u0000|qK")), method3724(method3723("\u001a\u0000|\u000f\n\u001e\u001d&\rK")), method3724(method3723("\u001a\u0000|vK")), method3724(method3723("\u001a\u0000|rK")), method3724(method3723("\u001a\u0000|wK"))};
   @OriginalMember(
      owner = "client!jt",
      name = "d",
      descriptor = "I"
   )
   public static int field7272;
   @OriginalMember(
      owner = "client!jt",
      name = "m",
      descriptor = "I"
   )
   public static int field7273;
   @OriginalMember(
      owner = "client!jt",
      name = "h",
      descriptor = "I"
   )
   public static int field7274;
   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "I"
   )
   public static int field7275;
   @OriginalMember(
      owner = "client!jt",
      name = "g",
      descriptor = "I"
   )
   public static int field7282;
   @OriginalMember(
      owner = "client!jt",
      name = "e",
      descriptor = "[Lbaa;"
   )
   public static class109[] field7280;

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method3718(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 != -2) {
            this.field7277 = -107;
         }

         ++field7273;
         if (~this.field7278 != ~this.field7271) {
            if (~this.field7271 == -2) {
               this.field7284 = ~this.field7281 != ~arg1;
               this.field7281 = arg1;
               return this.field7279[0];
            } else {
               class480 var4;
               label55: {
                  var4 = this.field7283[arg1];
                  if (var4 != null) {
                     this.field7284 = false;
                     if (!var3) {
                        break label55;
                     }
                  }

                  label40: {
                     this.field7284 = true;
                     if (this.field7271 <= this.field7277) {
                        class480 var5 = (class480)this.field7276.method4984((byte)-69);
                        var4 = new class480(arg1, var5.field7297);
                        this.field7283[var5.field7294] = null;
                        var5.method2477(1976);
                        if (!var3) {
                           break label40;
                        }
                     }

                     var4 = new class480(arg1, this.field7277);
                     ++this.field7277;
                  }

                  this.field7283[arg1] = var4;
               }

               this.field7276.method4983(-17121, var4);
               return this.field7279[var4.field7297];
            }
         } else {
            this.field7284 = this.field7283[arg1] == null;
            this.field7283[arg1] = class592.field8722;
            return this.field7279[arg1];
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7285[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(B)[[I"
   )
   public final int[][] method3719(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field7275;
         if (this.field7278 != this.field7271) {
            throw new RuntimeException(field7285[0]);
         } else {
            if (arg0 < 20) {
               this.method3718(-26, 38);
            }

            int var3 = 0;
            if (var2) {
               this.field7283[var3] = class592.field8722;
               ++var3;
            }

            while(true) {
               class478 var10000;
               if (~var3 <= ~this.field7271) {
                  var10000 = this;
                  if (!var2) {
                     return this.field7279;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field7283[var3] = class592.field8722;
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7285[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3720(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method3721(int arg0, byte arg1) {
      try {
         if (arg1 != 12) {
            field7274 = 44;
         }

         class547.field8201 = new int[arg0];
         class525.field8007 = new int[arg0];
         class666.field9972 = new int[arg0];
         class305.field4774 = new int[arg0];
         class33.field412 = new int[arg0];
         ++field7272;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7285[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3722(int arg0) {
      try {
         if (arg0 < 37) {
            field7274 = -4;
         }

         field7280 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7285[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class478(int arg0, int arg1, int arg2) {
      try {
         this.field7278 = arg1;
         this.field7271 = arg0;
         this.field7279 = new int[this.field7271][arg2];
         this.field7283 = new class480[this.field7278];
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7285[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3723(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3724(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
