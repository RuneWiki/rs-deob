import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class674 {
   @OriginalMember(
      owner = "client!og",
      name = "b",
      descriptor = "Ldw;"
   )
   private class748 field10128 = new class748(256);
   @OriginalMember(
      owner = "client!og",
      name = "g",
      descriptor = "Leaa;"
   )
   private class526 field10129;
   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10133 = new String[]{method4924(method4923("8)h\b#")), method4924(method4923("8)h\f#")), method4924(method4923("8)h\n#")), method4924(method4923("9;*\"")), method4924(method4923(",`h`v")), method4924(method4923("8)h\u000f#")), method4924(method4923("8)hrb9'2p#")), method4924(method4923("8)h\r#")), method4924(method4923("8)h\t#")), method4924(method4923("8)h\u000b#"))};
   @OriginalMember(
      owner = "client!og",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field10130 = new class101(61, -2);
   @OriginalMember(
      owner = "client!og",
      name = "h",
      descriptor = "I"
   )
   public static int field10123;
   @OriginalMember(
      owner = "client!og",
      name = "f",
      descriptor = "I"
   )
   public static int field10124;
   @OriginalMember(
      owner = "client!og",
      name = "j",
      descriptor = "I"
   )
   public static int field10125;
   @OriginalMember(
      owner = "client!og",
      name = "e",
      descriptor = "I"
   )
   public static int field10126;
   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "I"
   )
   public static int field10127;
   @OriginalMember(
      owner = "client!og",
      name = "c",
      descriptor = "I"
   )
   public static int field10131;
   @OriginalMember(
      owner = "client!og",
      name = "i",
      descriptor = "I"
   )
   public static int field10132;

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public final void method4916(int arg0) {
      try {
         ++field10132;
         class748 var2 = this.field10128;
         synchronized(this.field10128) {
            if (arg0 != 26) {
               field10130 = null;
            }

            this.field10128.method5445(697465426);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10133[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "b",
      descriptor = "(B)V",
      line = 16
   )
   public static void method4917(byte arg0) {
      try {
         if (arg0 > -62) {
            field10130 = null;
         }

         field10130 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10133[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(B)V",
      line = 31
   )
   public static final void method4918(byte arg0) {
      try {
         if (arg0 >= 54) {
            ++field10126;
            if (class490.field7240 != null) {
               class490.field7240.method653(-127);
               class313.field4468 = null;
               class490.field7240 = null;
            }
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10133[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(IIIIBILha;)V",
      line = 57
   )
   public static final void method4919(int param0, int param1, int param2, int param3, byte param4, int param5, class66 param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(II)V",
      line = 115
   )
   public final void method4920(int arg0, int arg1) {
      try {
         ++field10124;
         class748 var3 = this.field10128;
         synchronized(this.field10128) {
            if (arg1 != 0) {
               method4919(-42, 103, -16, -69, (byte)-57, -18, (class66)null);
            }

            this.field10128.method5453(arg0, false);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10133[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(Z)V",
      line = 132
   )
   public final void method4921(boolean arg0) {
      try {
         class748 var2 = this.field10128;
         synchronized(this.field10128) {
            this.field10128.method5451(0);
         }

         if (!arg0) {
            this.method4916(116);
         }

         ++field10131;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10133[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V",
      line = 150
   )
   public class674(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field10129 = arg2;
         this.field10129.method3875(0, 26);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10133[6] + (arg0 != null ? field10133[4] : field10133[3]) + ',' + arg1 + ',' + (arg2 != null ? field10133[4] : field10133[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(BI)Lmh;",
      line = 165
   )
   public final class657 method4922(byte arg0, int arg1) {
      try {
         ++field10125;
         class748 var3 = this.field10128;
         class657 var4;
         synchronized(this.field10128) {
            var4 = (class657)this.field10128.method5454((long)arg1, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field10129;
            byte[] var6;
            synchronized(this.field10129) {
               var6 = this.field10129.method3899(-75, arg1, 26);
            }

            class657 var7 = new class657();
            int var8 = -9 / ((-1 - arg0) / 50);
            if (var6 != null) {
               var7.method4728(new class128(var6), -19903);
            }

            class748 var9 = this.field10128;
            synchronized(this.field10128) {
               this.field10128.method5455(-2049, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field10133[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4923(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4924(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
