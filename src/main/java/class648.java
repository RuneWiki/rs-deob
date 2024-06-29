import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class648 {
   @OriginalMember(
      owner = "client!sv",
      name = "h",
      descriptor = "Lom;"
   )
   private class722 field9169 = new class722();
   @OriginalMember(
      owner = "client!sv",
      name = "s",
      descriptor = "Lom;"
   )
   private class722 field9171 = new class722();
   @OriginalMember(
      owner = "client!sv",
      name = "j",
      descriptor = "Lom;"
   )
   private class722 field9172 = new class722();
   @OriginalMember(
      owner = "client!sv",
      name = "q",
      descriptor = "Lom;"
   )
   private class722 field9173 = new class722();
   @OriginalMember(
      owner = "client!sv",
      name = "w",
      descriptor = "Lcu;"
   )
   private class65 field9177 = new class65(4);
   @OriginalMember(
      owner = "client!sv",
      name = "t",
      descriptor = "I"
   )
   public volatile int field9180 = 0;
   @OriginalMember(
      owner = "client!sv",
      name = "b",
      descriptor = "I"
   )
   public volatile int field9181 = 0;
   @OriginalMember(
      owner = "client!sv",
      name = "A",
      descriptor = "B"
   )
   private byte field9178 = 0;
   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "Lcu;"
   )
   private class65 field9179 = new class65(8);
   @OriginalMember(
      owner = "client!sv",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9183 = new String[]{method4735(method4734("\u001c\u0013UMv")), method4735(method4734("\u001c\u0013UOv")), method4735(method4734("\u001c\u0013UIv")), method4735(method4734("\u0014KU\"#")), method4735(method4734("\u0001\u0010\u0017`")), method4735(method4734("\u001c\u0013UDv")), method4735(method4734("\u001c\u0013UHv")), method4735(method4734("\u001c\u0013UGv")), method4735(method4734("\u001c\u0013UNv")), method4735(method4734("\u001c\u0013UJv")), method4735(method4734("\u001c\u0013UEv")), method4735(method4734("\u001c\u0013UBv")), method4735(method4734("\u001c\u0013U@v")), method4735(method4734("\u001c\u0013UFv")), method4735(method4734("\u001c\u0013UAv")), method4735(method4734("\u001c\u0013UKv"))};
   @OriginalMember(
      owner = "client!sv",
      name = "p",
      descriptor = "Ltb;"
   )
   public static class392 field9162 = new class392(method4735(method4734("\u001d\u0010\u0015i-\f\u0004\u000bi")), method4735(method4734("=\u0010\u0015i\r\f\u0004\u000bi")), 0);
   @OriginalMember(
      owner = "client!sv",
      name = "g",
      descriptor = "I"
   )
   public static int field9156;
   @OriginalMember(
      owner = "client!sv",
      name = "o",
      descriptor = "I"
   )
   public static int field9157;
   @OriginalMember(
      owner = "client!sv",
      name = "y",
      descriptor = "I"
   )
   public static int field9158;
   @OriginalMember(
      owner = "client!sv",
      name = "x",
      descriptor = "I"
   )
   public static int field9159;
   @OriginalMember(
      owner = "client!sv",
      name = "r",
      descriptor = "I"
   )
   public static int field9160;
   @OriginalMember(
      owner = "client!sv",
      name = "n",
      descriptor = "I"
   )
   public static int field9161;
   @OriginalMember(
      owner = "client!sv",
      name = "f",
      descriptor = "I"
   )
   public static int field9163;
   @OriginalMember(
      owner = "client!sv",
      name = "u",
      descriptor = "I"
   )
   public static int field9164;
   @OriginalMember(
      owner = "client!sv",
      name = "d",
      descriptor = "I"
   )
   public static int field9165;
   @OriginalMember(
      owner = "client!sv",
      name = "m",
      descriptor = "I"
   )
   public static int field9166;
   @OriginalMember(
      owner = "client!sv",
      name = "k",
      descriptor = "I"
   )
   public static int field9167;
   @OriginalMember(
      owner = "client!sv",
      name = "v",
      descriptor = "I"
   )
   public static int field9168;
   @OriginalMember(
      owner = "client!sv",
      name = "i",
      descriptor = "I"
   )
   public static int field9170;
   @OriginalMember(
      owner = "client!sv",
      name = "e",
      descriptor = "I"
   )
   private int field9176;
   @OriginalMember(
      owner = "client!sv",
      name = "l",
      descriptor = "J"
   )
   private long field9175;
   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "Lce;"
   )
   private class166 field9182;
   @OriginalMember(
      owner = "client!sv",
      name = "c",
      descriptor = "Lfs;"
   )
   private class796 field9174;

   @OriginalMember(
      owner = "client!sv",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4720(int arg0) {
      try {
         if (arg0 != 15044) {
            method4720(-63);
         }

         field9162 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9183[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(ZZLfs;)V"
   )
   public final void method4721(boolean arg0, boolean arg1, class796 arg2) {
      boolean var4 = client.field10022;

      try {
         if (this.field9174 != null) {
            try {
               this.field9174.method5728(true);
            } catch (Exception var9) {
            }

            this.field9174 = null;
         }

         ++field9166;
         this.field9174 = arg2;
         this.method4722(113);
         if (!arg0) {
            this.field9172 = null;
         }

         this.method4729((byte)-90, arg1);
         this.field9179.field945 = 0;
         this.field9182 = null;

         label82:
         while(true) {
            class166 var5 = (class166)this.field9171.method5229((byte)-126);
            if (var5 != null) {
               this.field9169.method5224(var5, 117);
               if (!var4) {
                  if (!var4) {
                     continue;
                  }
               } else {
                  if (var5 == null) {
                     break;
                  }

                  this.field9172.method5224(var5, 109);
                  if (var4) {
                     return;
                  }

                  if (var4) {
                     break;
                  }
               }
            }

            while(true) {
               var5 = (class166)this.field9173.method5229((byte)-126);
               if (var5 == null) {
                  break label82;
               }

               this.field9172.method5224(var5, 109);
               if (var4) {
                  return;
               }

               if (var4) {
                  break label82;
               }
            }
         }

         if (this.field9178 != 0) {
            try {
               this.field9177.field945 = 0;
               this.field9177.method656((byte)-110, 4);
               this.field9177.method656((byte)109, this.field9178);
               this.field9177.method653(0, -63);
               this.field9174.method5730(false, 0, 4, this.field9177.field942);
            } catch (IOException var8) {
               try {
                  this.field9174.method5728(true);
               } catch (Exception var7) {
               }

               ++this.field9180;
               this.field9174 = null;
               this.field9181 = -2;
            }
         }

         this.field9176 = 0;
         this.field9175 = class604.method4452(97);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field9183[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9183[3] : field9183[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "i",
      descriptor = "(I)V"
   )
   private final void method4722(int arg0) {
      try {
         ++field9158;
         if (this.field9174 != null) {
            try {
               this.field9177.field945 = 0;
               this.field9177.method656((byte)30, 6);
               int var2 = 19 % ((67 - arg0) / 39);
               this.field9177.method672(3, (byte)91);
               this.field9174.method5730(false, 0, 4, this.field9177.field942);
            } catch (IOException var5) {
               try {
                  this.field9174.method5728(true);
               } catch (Exception var4) {
               }

               this.field9174 = null;
               ++this.field9180;
               this.field9181 = -2;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9183[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method4723(boolean arg0) {
      try {
         if (!arg0) {
            this.method4731(17);
         }

         ++field9165;
         return this.method4724(-1) >= 20;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9183[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "j",
      descriptor = "(I)I"
   )
   public final int method4724(int arg0) {
      try {
         ++field9168;
         return arg0 != -1 ? -112 : this.field9169.method5223(false) + this.field9171.method5223(false);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9183[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(I)I"
   )
   private final int method4725(int arg0) {
      try {
         if (arg0 != 0) {
            field9162 = null;
         }

         ++field9160;
         return this.field9172.method5223(false) - -this.field9173.method5223(false);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9183[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method4726(int arg0) {
      try {
         ++field9170;
         if (this.field9174 != null) {
            try {
               this.field9177.field945 = 0;
               if (arg0 == 10089) {
                  this.field9177.method656((byte)-93, 7);
                  this.field9177.method672(0, (byte)-95);
                  this.field9174.method5730(false, 0, 4, this.field9177.field942);
               }
            } catch (IOException var4) {
               try {
                  this.field9174.method5728(true);
               } catch (Exception var3) {
               }

               ++this.field9180;
               this.field9174 = null;
               this.field9181 = -2;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9183[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(IBIZB)Lce;"
   )
   public final class166 method4727(int arg0, byte arg1, int arg2, boolean arg3, byte arg4) {
      try {
         ++field9159;
         if (arg1 > -93) {
            this.field9176 = -122;
         }

         long var6 = (long)((arg2 << 16) + arg0);
         class166 var8 = new class166();
         var8.field2505 = arg4;
         var8.field6491 = arg3;
         var8.field1548 = var6;
         if (!arg3) {
            if (this.method4725(0) >= 20) {
               throw new RuntimeException();
            }

            this.field9172.method5224(var8, 126);
            if (!client.field10022) {
               return var8;
            }
         }

         if (~this.method4724(-1) <= -21) {
            throw new RuntimeException();
         } else {
            this.field9169.method5224(var8, 96);
            return var8;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field9183[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method4728(int arg0) {
      try {
         ++field9157;

         try {
            this.field9174.method5728(true);
         } catch (Exception var3) {
         }

         this.field9181 = -1;
         this.field9178 = (byte)((int)(1.0D + 255.0D * Math.random()));
         ++this.field9180;
         if (arg0 >= -21) {
            this.method4721(false, true, (class796)null);
         }

         this.field9174 = null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9183[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method4729(byte arg0, boolean arg1) {
      try {
         ++field9167;
         if (this.field9174 != null) {
            try {
               this.field9177.field945 = 0;
               if (arg0 > -46) {
                  this.method4724(11);
               }

               this.field9177.method656((byte)-120, !arg1 ? 3 : 2);
               this.field9177.method672(0, (byte)53);
               this.field9174.method5730(false, 0, 4, this.field9177.field942);
            } catch (IOException var5) {
               try {
                  this.field9174.method5728(true);
               } catch (Exception var4) {
               }

               ++this.field9180;
               this.field9174 = null;
               this.field9181 = -2;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9183[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method4730(int arg0) {
      try {
         ++field9161;
         if (arg0 != -11808) {
            return true;
         } else {
            return this.method4725(0) >= 20;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9183[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method4731(int arg0) {
      try {
         int var2 = 124 / ((arg0 - 19) / 46);
         if (this.field9174 != null) {
            this.field9174.method5728(true);
         }

         ++field9163;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9183[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method4732(int arg0) {
      try {
         if (arg0 != 0) {
            this.field9177 = null;
         }

         if (this.field9174 != null) {
            this.field9174.method5737((byte)123);
         }

         ++field9156;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9183[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4733(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4734(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4735(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
