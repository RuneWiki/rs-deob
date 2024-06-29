import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class127 {
   @OriginalMember(
      owner = "client!dl",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   private String field1822 = field1836[3];
   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1836 = new String[]{method1208(method1207("\u001f\u001a\u001d\\+")), method1208(method1207("\u001f\u001a\u001d]+")), method1208(method1207("\u0000X\u001d8~")), method1208(method1207("\u0015\u0003_z")), method1208(method1207("\u001f\u001a\u001dW+")), method1208(method1207("\u001f\u001a\u001dT+")), method1208(method1207("\u001f\u001a\u001dP+")), method1208(method1207("\u001f\u001a\u001d_+")), method1208(method1207("\u001f\u001a\u001dS+")), method1208(method1207("\u001f\u001a\u001d^+")), method1208(method1207("\u001f\u001a\u001dU+")), method1208(method1207("\u001f\u001a\u001dR+")), method1208(method1207("\u001f\u001a\u001dQ+"))};
   @OriginalMember(
      owner = "client!dl",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field1823 = false;
   @OriginalMember(
      owner = "client!dl",
      name = "m",
      descriptor = "[Lkga;"
   )
   public static class240[] field1826 = new class240[2048];
   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "C"
   )
   public char field1814;
   @OriginalMember(
      owner = "client!dl",
      name = "r",
      descriptor = "C"
   )
   public char field1816;
   @OriginalMember(
      owner = "client!dl",
      name = "w",
      descriptor = "I"
   )
   public static int field1812;
   @OriginalMember(
      owner = "client!dl",
      name = "x",
      descriptor = "I"
   )
   public static int field1815;
   @OriginalMember(
      owner = "client!dl",
      name = "e",
      descriptor = "I"
   )
   public static int field1817;
   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "I"
   )
   public static int field1818;
   @OriginalMember(
      owner = "client!dl",
      name = "f",
      descriptor = "I"
   )
   private int field1819;
   @OriginalMember(
      owner = "client!dl",
      name = "s",
      descriptor = "I"
   )
   public static int field1820;
   @OriginalMember(
      owner = "client!dl",
      name = "o",
      descriptor = "I"
   )
   public static int field1821;
   @OriginalMember(
      owner = "client!dl",
      name = "i",
      descriptor = "I"
   )
   private int field1824;
   @OriginalMember(
      owner = "client!dl",
      name = "l",
      descriptor = "I"
   )
   public static int field1825;
   @OriginalMember(
      owner = "client!dl",
      name = "p",
      descriptor = "I"
   )
   public static int field1827;
   @OriginalMember(
      owner = "client!dl",
      name = "u",
      descriptor = "I"
   )
   public static int field1829;
   @OriginalMember(
      owner = "client!dl",
      name = "n",
      descriptor = "I"
   )
   public static int field1830;
   @OriginalMember(
      owner = "client!dl",
      name = "h",
      descriptor = "I"
   )
   public static int field1831;
   @OriginalMember(
      owner = "client!dl",
      name = "c",
      descriptor = "I"
   )
   public static int field1832;
   @OriginalMember(
      owner = "client!dl",
      name = "k",
      descriptor = "I"
   )
   public static int field1833;
   @OriginalMember(
      owner = "client!dl",
      name = "d",
      descriptor = "I"
   )
   public static int field1834;
   @OriginalMember(
      owner = "client!dl",
      name = "g",
      descriptor = "Let;"
   )
   private class389 field1813;
   @OriginalMember(
      owner = "client!dl",
      name = "j",
      descriptor = "Ljq;"
   )
   public static class672 field1828;
   @OriginalMember(
      owner = "client!dl",
      name = "v",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field1835;

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public final String method1196(int arg0, int arg1) {
      try {
         ++field1820;
         if (this.field1835 == null) {
            return this.field1822;
         } else {
            if (arg1 > -74) {
               this.method1206((byte)-43, (String)null);
            }

            if (this.field1835 instanceof class389) {
               class55 var3 = (class55)((class389)this.field1835).method3141((long)arg0, true);
               return var3 != null ? var3.field680 : this.field1822;
            } else {
               String[] var4 = (String[])this.field1835;
               if (arg0 >= 0 && ~arg0 > ~var4.length) {
                  String var5 = var4[arg0];
                  return var5 != null ? var5 : this.field1822;
               } else {
                  return this.field1822;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1836[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(ZZLfq;)V"
   )
   public static final void method1197(boolean arg0, boolean arg1, class374 arg2) {
      try {
         ++field1830;
         int var3 = arg2.field5951 == 0 ? arg2.field5849 : arg2.field5951;
         int var4 = arg2.field5942 == 0 ? arg2.field5915 : arg2.field5942;
         class408.method3273(arg0, var4, var3, arg1, arg2.field5840, class296.field4672[arg2.field5840 >> 16]);
         if (arg2.field5829 != null) {
            class408.method3273(false, var4, var3, arg1, arg2.field5840, arg2.field5829);
         }

         class276 var5 = (class276)class507.field7766.method3141((long)arg2.field5840, true);
         if (var5 != null) {
            class688.method5069(arg1, var5.field4404, var4, var3, -1);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1836[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1836[2] : field1836[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1198(int arg0) {
      try {
         if (arg0 != 21551) {
            this.field1813 = null;
         }

         ++field1812;
         return this.field1819;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1836[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "(II)Z"
   )
   public final boolean method1199(int arg0, int arg1) {
      try {
         ++field1831;
         if (arg1 < 88) {
            return true;
         } else if (this.field1835 == null) {
            return false;
         } else {
            if (this.field1813 == null) {
               this.method1202((byte)117);
            }

            class668 var3 = (class668)this.field1813.method3141((long)arg0, true);
            return var3 != null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1836[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method1200(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(ILica;B)V"
   )
   private final void method1201(int arg0, class354 arg1, byte arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg2 != -23) {
            method1203(false);
         }

         ++field1815;
         if (~arg0 == -2) {
            this.field1816 = class424.method3361((byte)34, arg1.method2886((byte)88));
         } else if (arg0 == 2) {
            this.field1814 = class424.method3361((byte)116, arg1.method2886((byte)88));
         } else if (arg0 == 3) {
            this.field1822 = arg1.method2843(-1);
         } else if (~arg0 == -5) {
            this.field1824 = arg1.method2894(111);
         } else if (arg0 != 5 && arg0 != 6) {
            if (arg0 != 7) {
               if (~arg0 == -9) {
                  int var9 = arg1.method2848(-98);
                  this.field1819 = arg1.method2848(-124);
                  Integer[] var10 = new Integer[var9];
                  int var11 = 0;
                  if (!var4 && ~var11 <= ~this.field1819) {
                     this.field1835 = var10;
                     return;
                  }

                  do {
                     int var12 = arg1.method2848(arg2 ^ 75);
                     var10[var12] = new Integer(arg1.method2894(104));
                     ++var11;
                  } while(~var11 > ~this.field1819);

                  this.field1835 = var10;
                  return;
               }
            } else {
               int var13 = arg1.method2848(arg2 ^ 107);
               this.field1819 = arg1.method2848(-119);
               String[] var14 = new String[var13];
               int var15 = 0;
               if (var4 || ~this.field1819 < ~var15) {
                  do {
                     int var16 = arg1.method2848(-110);
                     var14[var16] = arg1.method2843(-1);
                     ++var15;
                  } while(~this.field1819 < ~var15);
               }

               this.field1835 = var14;
            }

         } else {
            this.field1819 = arg1.method2848(-114);
            class389 var5 = new class389(class510.method3964(this.field1819, (byte)125));
            int var6 = 0;
            if (!var4 && var6 >= this.field1819) {
               this.field1835 = var5;
            } else {
               do {
                  int var7 = arg1.method2894(99);
                  class294 var8;
                  if (arg0 != 5) {
                     var8 = new class668(arg1.method2894(117));
                     if (var4) {
                        var8 = new class55(arg1.method2843(-1));
                     }
                  } else {
                     var8 = new class55(arg1.method2843(-1));
                  }

                  var5.method3143(94, var8, (long)var7);
                  ++var6;
               } while(var6 < this.field1819);

               this.field1835 = var5;
            }
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field1836[1] + arg0 + ',' + (arg1 != null ? field1836[2] : field1836[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method1202(byte arg0) {
      boolean var2 = client.field1786;

      try {
         label69: {
            if (!(this.field1835 instanceof class389)) {
               Integer[] var3 = (Integer[])this.field1835;
               this.field1813 = new class389(class510.method3964(var3.length, (byte)110));
               int var4 = 0;
               class668 var5;
               if (var2) {
                  if (var3[var4] != null) {
                     var5 = new class668(var4);
                     this.field1813.method3143(59, var5, (long)var3[var4]);
                  }

                  ++var4;
               }

               while(true) {
                  while(var3.length > var4) {
                     if (var3[var4] != null) {
                        var5 = new class668(var4);
                        this.field1813.method3143(59, var5, (long)var3[var4]);
                     }

                     ++var4;
                  }

                  if (!var2) {
                     if (!var2) {
                        break label69;
                     }
                     break;
                  }

                  ++var4;
               }
            }

            class389 var6 = (class389)this.field1835;
            this.field1813 = new class389(var6.method3144((byte)56));
            class668 var7 = (class668)var6.method3139(-3);
            if (var2 || var7 != null) {
               do {
                  class668 var8 = new class668((int)var7.field4655);
                  this.field1813.method3143(101, var8, (long)var7.field9986);
                  var7 = (class668)var6.method3147(-21068);
               } while(var7 != null);
            }
         }

         ++field1829;
         if (arg0 < 80) {
            this.field1822 = null;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1836[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1203(boolean arg0) {
      try {
         field1828 = null;
         field1826 = null;
         if (arg0) {
            method1197(true, true, (class374)null);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1836[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method1204(int arg0, byte arg1) {
      try {
         ++field1833;
         if (this.field1835 == null) {
            return this.field1824;
         } else if (arg1 != 28) {
            return -107;
         } else if (this.field1835 instanceof class389) {
            class668 var3 = (class668)((class389)this.field1835).method3141((long)arg0, true);
            return var3 != null ? var3.field9986 : this.field1824;
         } else {
            Integer[] var4 = (Integer[])this.field1835;
            if (arg0 >= 0 && ~var4.length < ~arg0) {
               Integer var5 = var4[arg0];
               return var5 != null ? var5 : this.field1824;
            } else {
               return this.field1824;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1836[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(Lica;I)V"
   )
   public final void method1205(class354 arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field1827;
         if (arg1 == 0) {
            do {
               int var4 = arg0.method2855(-31007);
               if (var4 == 0) {
                  break;
               }

               this.method1201(var4, arg0, (byte)-23);
            } while(!var3);

         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1836[5] + (arg0 != null ? field1836[2] : field1836[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(BLjava/lang/String;)Z"
   )
   public final boolean method1206(byte arg0, String arg1) {
      boolean var3 = client.field1786;

      try {
         ++field1825;
         int var4 = 40 / ((-43 - arg0) / 46);
         if (this.field1835 == null) {
            return false;
         } else {
            if (this.field1813 == null) {
               this.method1200(120);
            }

            class718 var5 = (class718)this.field1813.method3141(class473.method3675(arg1, (byte)-119), true);
            if (var3) {
               if (var5.field10763.equals(arg1)) {
                  return true;
               }

               var5 = (class718)this.field1813.method3148(-46);
            }

            while(true) {
               boolean var10000;
               if (var5 == null) {
                  var10000 = false;
                  if (!var3) {
                     return false;
                  }
               } else {
                  var10000 = var5.field10763.equals(arg1);
               }

               if (var10000) {
                  return true;
               }

               var5 = (class718)this.field1813.method3148(-46);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1836[12] + arg0 + ',' + (arg1 != null ? field1836[2] : field1836[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1207(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1208(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
