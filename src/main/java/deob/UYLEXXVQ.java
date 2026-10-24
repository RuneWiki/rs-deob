package deob;

@ObfuscatedName("UYLEXXVQ")
public class UYLEXXVQ extends AVUWZCYT {

	@ObfuscatedName("UYLEXXVQ.v")
	public int field1183;

	@ObfuscatedName("UYLEXXVQ.w")
	public int field1184;

	@ObfuscatedName("UYLEXXVQ.x")
	public int field1185;

	@ObfuscatedName("UYLEXXVQ.m")
	public int field1174;

	@ObfuscatedName("UYLEXXVQ.n")
	public int field1175;

	@ObfuscatedName("UYLEXXVQ.o")
	public int field1176;

	@ObfuscatedName("UYLEXXVQ.p")
	public int field1177;

	@ObfuscatedName("UYLEXXVQ.t")
	public JFYFSKVR field1181;

	@ObfuscatedName("UYLEXXVQ.s")
	public int field1180;

	@ObfuscatedName("UYLEXXVQ.u")
	public int field1182;

	@ObfuscatedName("UYLEXXVQ.q")
	public int field1178;

	@ObfuscatedName("UYLEXXVQ.r")
	public int field1179;

	@ObfuscatedName("UYLEXXVQ.k")
	public int[] field1173;

	@ObfuscatedName("UYLEXXVQ.y")
	public static client field1186;

	public UYLEXXVQ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		field1183 = arg3;
		field1184 = arg8;
		field1185 = arg5;
		field1174 = arg6;
		field1175 = arg0;
		field1176 = arg4;
		field1177 = arg1;

		if (arg2 != -1) {
			field1181 = JFYFSKVR.field659[arg2];
			field1180 = 0;
			field1182 = client.field336;
			if (arg7 && field1181.field664 != -1) {
				field1180 = (int) (Math.random() * field1181.field660);
				field1182 -= (int) (Math.random() * field1181.method251(field1180));
			}
		}

		ZXOFSHYE var10 = ZXOFSHYE.method588(field1183);
		field1178 = var10.field1468;
		field1179 = var10.field1486;
		field1173 = var10.field1456;
	}

	@ObfuscatedName("UYLEXXVQ.a(Z)LYYHPBDED;")
	public final YYHPBDED method2() {
		int var1 = -1;
		if (field1181 != null) {
			int var2 = client.field336 - field1182;
			if (var2 > 100 && field1181.field664 > 0) {
				var2 = 100;
			}

			while (var2 > field1181.method251(field1180)) {
				var2 -= field1181.method251(field1180);
				field1180++;
				if (field1180 >= field1181.field660) {
					field1180 -= field1181.field664;
					if (field1180 < 0 || field1180 >= field1181.field660) {
						break;
					}
				}
			}

			field1181 = null;
			field1182 = client.field336 - var2;

			if (field1181 != null) {
				var1 = field1181.field661[field1180];
			}
		}

		ZXOFSHYE var3;
		if (field1173 == null) {
			var3 = ZXOFSHYE.method588(field1183);
		} else {
			var3 = method506();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method586(field1184, field1185, field1174, field1175, field1176, field1177, var1);
	}

	@ObfuscatedName("UYLEXXVQ.a(I)LZXOFSHYE;")
	public final ZXOFSHYE method506() {
		int var1 = -1;
		if (field1178 != -1) {
			CYAEJBRE var2 = CYAEJBRE.field553[field1178];
			int var3 = var2.field555;
			int var4 = var2.field556;
			int var5 = var2.field557;
			int var6 = client.field253[var5 - var4];
			var1 = field1186.field208[var3] >> var4 & var6;
		} else if (field1179 != -1) {
			var1 = field1186.field208[field1179];
		}

		if (var1 >= 0 && var1 < field1173.length && field1173[var1] != -1) {
			return ZXOFSHYE.method588(field1173[var1]);
		}

		return null;
	}
}
