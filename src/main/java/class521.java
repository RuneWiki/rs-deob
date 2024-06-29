import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class521 {
   @OriginalMember(
      owner = "client!mw",
      name = "k",
      descriptor = "I"
   )
   private int field7127 = 0;
   @OriginalMember(
      owner = "client!mw",
      name = "i",
      descriptor = "I"
   )
   private int field7135 = -1;
   @OriginalMember(
      owner = "client!mw",
      name = "d",
      descriptor = "Lod;"
   )
   private class536 field7139 = new class536();
   @OriginalMember(
      owner = "client!mw",
      name = "g",
      descriptor = "Z"
   )
   public boolean field7140 = false;
   @OriginalMember(
      owner = "client!mw",
      name = "c",
      descriptor = "I"
   )
   private int field7128;
   @OriginalMember(
      owner = "client!mw",
      name = "o",
      descriptor = "I"
   )
   private int field7134;
   @OriginalMember(
      owner = "client!mw",
      name = "f",
      descriptor = "[Lqu;"
   )
   private class105[] field7136;
   @OriginalMember(
      owner = "client!mw",
      name = "m",
      descriptor = "[[I"
   )
   private int[][] field7133;
   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7141 = new String[]{method3774(method3773("41\"\u000by")), method3774(method3773("41\"\by")), method3774(method3773("41\"u87/xwy")), method3774(method3773("\u001a'bi>7*ui#<2~ 4/#,(q?3`%q0+m.4y%m*9<")), method3774(method3773("41\"\ny")), method3774(method3773("41\"\ry"))};
   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "F"
   )
   public static float field7126 = 1.0F;
   @OriginalMember(
      owner = "client!mw",
      name = "h",
      descriptor = "I"
   )
   public static int field7129 = -1;
   @OriginalMember(
      owner = "client!mw",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field7138 = false;
   @OriginalMember(
      owner = "client!mw",
      name = "j",
      descriptor = "I"
   )
   public static int field7130;
   @OriginalMember(
      owner = "client!mw",
      name = "n",
      descriptor = "I"
   )
   public static int field7131;
   @OriginalMember(
      owner = "client!mw",
      name = "b",
      descriptor = "I"
   )
   public static int field7132;
   @OriginalMember(
      owner = "client!mw",
      name = "e",
      descriptor = "I"
   )
   public static int field7137;

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method3769(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field7137;
         if (arg1 != -4) {
            this.field7140 = true;
         }

         if (this.field7134 == this.field7128) {
            this.field7140 = this.field7136[arg0] == null;
            this.field7136[arg0] = class416.field5845;
            return this.field7133[arg0];
         } else if (this.field7134 == 1) {
            this.field7140 = ~this.field7135 != ~arg0;
            this.field7135 = arg0;
            return this.field7133[0];
         } else {
            class105 var4;
            label54: {
               var4 = this.field7136[arg0];
               if (var4 != null) {
                  this.field7140 = false;
                  if (!var3) {
                     break label54;
                  }
               }

               label40: {
                  this.field7140 = true;
                  if (this.field7134 <= this.field7127) {
                     class105 var5 = (class105)this.field7139.method3863((byte)94);
                     var4 = new class105(arg0, var5.field1333);
                     this.field7136[var5.field1334] = null;
                     var5.method3609(125);
                     if (!var3) {
                        break label40;
                     }
                  }

                  var4 = new class105(arg0, this.field7127);
                  ++this.field7127;
               }

               this.field7136[arg0] = var4;
            }

            this.field7139.method3867(var4, arg1 ^ -126);
            return this.field7133[var4.field1333];
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7141[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(Z)Z"
   )
   public static final boolean method3770(boolean arg0) {
      try {
         if (!arg0) {
            return false;
         } else {
            ++field7130;
            if (~class445.field6162 != -4) {
               return false;
            } else {
               return class545.field7442 == 0 && ~class617.field8606 == -1;
            }
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7141[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3771(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field7131;
         int var3 = 0;
         if (var2) {
            this.field7133[var3] = null;
            ++var3;
         }

         while(true) {
            while(this.field7134 > var3) {
               this.field7133[var3] = null;
               ++var3;
            }

            if (!var2) {
               if (arg0 <= 34) {
                  this.field7140 = false;
               }

               this.field7133 = null;
               this.field7136 = null;
               this.field7139.method3861(99);
               this.field7139 = null;
               return;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7141[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "b",
      descriptor = "(I)[[I"
   )
   public final int[][] method3772(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field7132;
         if (this.field7134 != this.field7128) {
            throw new RuntimeException(field7141[3]);
         } else {
            int var3 = arg0;
            if (var2) {
               this.field7136[arg0] = class416.field5845;
               var3 = arg0 + 1;
            }

            while(true) {
               class521 var10000;
               if (~this.field7134 >= ~var3) {
                  var10000 = this;
                  if (!var2) {
                     return this.field7133;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field7136[var3] = class416.field5845;
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7141[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class521(int arg0, int arg1, int arg2) {
      try {
         this.field7128 = arg1;
         this.field7134 = arg0;
         this.field7136 = new class105[this.field7128];
         this.field7133 = new int[this.field7134][arg2];
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7141[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3773(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3774(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
