import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class113 implements Runnable {
   @OriginalMember(
      owner = "client!jt",
      name = "j",
      descriptor = "Lgi;"
   )
   private class705 field1828 = new class553();
   @OriginalMember(
      owner = "client!jt",
      name = "v",
      descriptor = "Lgi;"
   )
   private class705 field1829 = null;
   @OriginalMember(
      owner = "client!jt",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1838 = new String[]{method1080(method1079("b@;\u0016v")), method1080(method1079("b@;\u0010v")), method1080(method1079("fAy>")), method1080(method1079("s\u001a;|#")), method1080(method1079("b@;\u001bv")), method1080(method1079("b@; +f\u001c")), method1080(method1079("(\u001cG7=gBp ;l\u001d5")), method1080(method1079("b@;\u001fv")), method1080(method1079("b@;\u0013v")), method1080(method1079("b@;\u0019v")), method1080(method1079("b@;\u0015v")), method1080(method1079("b@;\u0018v")), method1080(method1079("b@;\u001av")), method1080(method1079("b@;\u0014v")), method1080(method1079("b@;\u0017v")), method1080(method1079("b@;\u001ev")), method1080(method1079("b@;\u0011v"))};
   @OriginalMember(
      owner = "client!jt",
      name = "c",
      descriptor = "Lkea;"
   )
   public static class248 field1825 = new class248("", 19);
   @OriginalMember(
      owner = "client!jt",
      name = "g",
      descriptor = "I"
   )
   public static int field1830 = 0;
   @OriginalMember(
      owner = "client!jt",
      name = "n",
      descriptor = "I"
   )
   public static int field1813;
   @OriginalMember(
      owner = "client!jt",
      name = "p",
      descriptor = "I"
   )
   public static int field1815;
   @OriginalMember(
      owner = "client!jt",
      name = "d",
      descriptor = "I"
   )
   public static int field1816;
   @OriginalMember(
      owner = "client!jt",
      name = "m",
      descriptor = "I"
   )
   public static int field1817;
   @OriginalMember(
      owner = "client!jt",
      name = "x",
      descriptor = "I"
   )
   public static int field1818;
   @OriginalMember(
      owner = "client!jt",
      name = "q",
      descriptor = "I"
   )
   public static int field1819;
   @OriginalMember(
      owner = "client!jt",
      name = "r",
      descriptor = "I"
   )
   public static int field1820;
   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "I"
   )
   public static int field1821;
   @OriginalMember(
      owner = "client!jt",
      name = "y",
      descriptor = "I"
   )
   public static int field1822;
   @OriginalMember(
      owner = "client!jt",
      name = "b",
      descriptor = "I"
   )
   public static int field1823;
   @OriginalMember(
      owner = "client!jt",
      name = "u",
      descriptor = "I"
   )
   public static int field1824;
   @OriginalMember(
      owner = "client!jt",
      name = "l",
      descriptor = "I"
   )
   public static int field1826;
   @OriginalMember(
      owner = "client!jt",
      name = "i",
      descriptor = "I"
   )
   public static int field1827;
   @OriginalMember(
      owner = "client!jt",
      name = "w",
      descriptor = "I"
   )
   public static int field1832;
   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "I"
   )
   private int field1835;
   @OriginalMember(
      owner = "client!jt",
      name = "e",
      descriptor = "I"
   )
   private int field1837;
   @OriginalMember(
      owner = "client!jt",
      name = "h",
      descriptor = "J"
   )
   private long field1834;
   @OriginalMember(
      owner = "client!jt",
      name = "k",
      descriptor = "J"
   )
   private long field1836;
   @OriginalMember(
      owner = "client!jt",
      name = "s",
      descriptor = "Llg;"
   )
   private class431 field1831;
   @OriginalMember(
      owner = "client!jt",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   private String field1833;
   @OriginalMember(
      owner = "client!jt",
      name = "f",
      descriptor = "Z"
   )
   private volatile boolean field1812;
   @OriginalMember(
      owner = "client!jt",
      name = "o",
      descriptor = "Z"
   )
   private boolean field1814;

   @OriginalMember(
      owner = "client!jt",
      name = "b",
      descriptor = "(B)Z"
   )
   public final synchronized boolean method1066(byte arg0) {
      try {
         ++field1821;
         if (arg0 != 102) {
            method1076((byte)-71);
         }

         return this.field1828.method4123((byte)-116, this.field1834);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1838[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1067(int arg0) {
      try {
         if (arg0 != 28098) {
            field1826 = 2;
         }

         field1825 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1838[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(ILgi;)V"
   )
   public final synchronized void method1068(int arg0, class705 arg1) {
      try {
         this.field1829 = this.field1828;
         ++field1832;
         this.field1828 = arg1;
         if (arg0 != 1) {
            this.field1831 = null;
         }

         this.field1834 = class57.method650(102);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1838[13] + arg0 + ',' + (arg1 != null ? field1838[3] : field1838[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method1069(byte arg0) {
      try {
         if (arg0 != -54) {
            this.method1073((class431)null, -64, (String)null, 95, 37L);
         }

         ++field1813;
         return this.field1837;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1838[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method1070(byte arg0) {
      try {
         ++field1818;
         if (arg0 != 93) {
            this.field1814 = true;
         }

         return this.field1836;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1838[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1071(int arg0) {
      try {
         if (arg0 > -18) {
            this.field1835 = -65;
         }

         ++field1817;
         this.field1812 = true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1838[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method1072(int arg0) {
      try {
         if (arg0 != 3505) {
            return null;
         } else {
            ++field1822;
            return this.field1833;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1838[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(Llg;ILjava/lang/String;IJ)V"
   )
   public final synchronized void method1073(class431 arg0, int arg1, String arg2, int arg3, long arg4) {
      try {
         this.field1835 = arg3;
         if (arg1 == 21590) {
            this.field1836 = arg4;
            this.field1833 = arg2;
            ++field1819;
            this.field1831 = arg0;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1838[1] + (arg0 != null ? field1838[3] : field1838[2]) + ',' + arg1 + ',' + (arg2 != null ? field1838[3] : field1838[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jt",
      name = "b",
      descriptor = "(I)V"
   )
   public final synchronized void method1074(int arg0) {
      try {
         ++field1816;
         this.field1814 = true;
         if (arg0 > -50) {
            this.method1073((class431)null, 30, (String)null, 107, 39L);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1838[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1075(int arg0) {
      try {
         int var2 = -33 / ((arg0 - -8) / 61);
         ++field1823;
         return this.field1835;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1838[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1076(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jt",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method1077(int arg0) {
      try {
         ++field1827;
         if (this.field1831 == null) {
            return 0;
         } else {
            int var2 = this.field1831.method3251(19);
            if (this.field1831.field6222 && this.field1831.field6210 > this.field1835) {
               return this.field1835 + 1;
            } else if (~var2 <= -1 && var2 < class262.field3735.length + -1) {
               if (arg0 >= -68) {
                  return 112;
               } else {
                  return this.field1831.field6211 == this.field1835 ? this.field1831.field6210 : this.field1831.field6211;
               }
            } else {
               return 100;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1838[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "c",
      descriptor = "(I)Llg;"
   )
   public final class431 method1078(int arg0) {
      try {
         ++field1815;
         if (arg0 > -80) {
            this.method1077(16);
         }

         return this.field1831;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1838[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1079(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1080(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
